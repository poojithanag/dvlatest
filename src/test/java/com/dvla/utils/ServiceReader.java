package com.dvla.utils;

import com.example.demo.DemoApplication;
import com.example.demo.FileInformation;
import com.example.demo.FileService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class ServiceReader {
    private static final Logger logger = LogManager.getLogger(ServiceReader.class);

    public List<String[]> getVehicleInfo(String fileType, String folderName) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class);
        FileService fserv = context.getBean(FileService.class);
        CSVReader csvReader = new CSVReader();
        ExcelReader excelReader = new ExcelReader();
        List<String> extensions = new ArrayList<>();
        List<FileInformation> matchingFiles;
        extensions.add(fileType);
        matchingFiles = fserv.setListOfSupportedFiles(folderName, extensions);
        List<String[]> myVehicleList = new ArrayList<>();
        for (FileInformation fileInfo : matchingFiles) {
            if (fileType.equals("csv") && fileInfo.getExt().equals("csv")) {
                myVehicleList = csvReader.getContents(folderName + "/" + fileInfo.getFileName(), myVehicleList);
            } else if (fileType.equals("xls") && fileInfo.getExt().equals("xls")) {
                myVehicleList = excelReader.readAllRowsExcel(folderName + "/" + fileInfo.getFileName(), "Sheet1");
            } else if (fileType.equals("xlsx") && fileInfo.getExt().equals("xlsx")) {
                myVehicleList = excelReader.readAllRowsExcel(folderName + "/" + fileInfo.getFileName(), "Sheet1");
            } else {
                logger.error("Not a CSV or XLS/XLSX file");
            }
        }
        return myVehicleList;
    }
}
