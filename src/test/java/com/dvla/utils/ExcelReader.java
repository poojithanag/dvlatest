package com.dvla.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

class ExcelReader {
    private static final Logger logger = LogManager.getLogger(ServiceReader.class);

    private static XSSFSheet ExcelSheet;
    private static XSSFWorkbook ExcelWBook;

    public List<String[]> readAllRowsExcel(String filePath, String sheetName) {
        List<String[]> myVehicleList = new ArrayList<>();

        int rows = 0;
        try {
            FileInputStream ExcelFile = new FileInputStream(filePath);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelSheet = ExcelWBook.getSheet(sheetName);
            rows = ExcelSheet.getPhysicalNumberOfRows();
        } catch (Exception e) {
            logger.error(e);
        }

        for (int rowNum = 0; rowNum < rows; rowNum++) {
            myVehicleList.add(readExcelRow(filePath, sheetName, rowNum));
        }
        return myVehicleList;
    }

    private String[] readExcelRow(String filePath, String sheetName, int rowNum) {

        String[] vehicleData = new String[3];
        try {
            FileInputStream ExcelFile = new FileInputStream(filePath);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelSheet = ExcelWBook.getSheet(sheetName);
            vehicleData[0] = (ExcelSheet.getRow(rowNum).getCell(0).getStringCellValue());
            vehicleData[1] = (ExcelSheet.getRow(rowNum).getCell(1).getStringCellValue());
            vehicleData[2] = (ExcelSheet.getRow(rowNum).getCell(2).getStringCellValue());
            return vehicleData;
        } catch (Exception e) {
            logger.error(e);
            return vehicleData;
        }
    }
}
