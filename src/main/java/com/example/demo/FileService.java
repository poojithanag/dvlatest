package com.example.demo;

import org.springframework.stereotype.Component;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileService {
    private final MimetypesFileTypeMap mimeTypes = new MimetypesFileTypeMap();

    // Hashmap with file type as key and value as files of same type
    private List<FileInformation> getFiles(String directoryName) {
        List<FileInformation> FileInfoList = new ArrayList<>();
        File directory = new File(directoryName);
        File[] fList = directory.listFiles();

        assert fList != null;
        for (File file : fList) {
            String extension = getFileExtension(file);
            FileInformation fileInformation = new FileInformation();
            fileInformation.setFileName(file.getName());
            fileInformation.setExt(extension);
            fileInformation.setFileSize(file.length());
            fileInformation.setExt(extension);
            fileInformation.setMimeType(mimeTypes.getContentType(file));
            FileInfoList.add(fileInformation);
        }
        return FileInfoList;
    }

    public List<FileInformation> setListOfSupportedFiles(String directoryName, List<String> extensions) {
        List<FileInformation> supportedFiles = new ArrayList<>();
        for (FileInformation fileInfo : getFiles(directoryName)) {
            if (extensions.contains(fileInfo.getExt())) {
                supportedFiles.add(fileInfo);
            }
        }
        return supportedFiles;
    }

    private String getFileExtension(File file) {
        String extension = "";
        // read file extension
        int i = file.getName().lastIndexOf('.');
        if (i > 0) {
            extension = file.getName().substring(i + 1);
        }
        return extension;
    }

//    public List<FileInformation> getAllFilesInFolder(String directoryName) {
//        File directory = new File(directoryName);
//        File[] fList = directory.listFiles();
//
//        List<FileInformation> fileInfoList = new ArrayList<FileInformation>();
//        for (File file : list) {
//            FileInfo fileInfo = new FileInfo();
//            fileInfo.setName(file.getName());
//            fileInfo.setSize(file.length());
//            fileInfo.setType(mimeTypes.getContentType(file));
//            fileInfo.setExt(getFileExtension(file));
//            fileInfoList.add(fileInfo);
//        }
//        return fileInfoList;
//    }


//    public HashMap<String, List<String>> getFiles(String directoryName) {
//        File directory = new File(directoryName);
//        File[] fList = directory.listFiles();
//
//        HashMap<String, List<String>> hmap = new HashMap<>();
//
//        assert fList != null;
//        for (File file : fList) {
//            String extension = getFileExtension(file);
//            List<String> fileNames = new ArrayList<>();
//            // update existing file type array or else create new one
//            if (hmap.get(extension) != null) {
//                fileNames = hmap.get(extension);
//            }
//            fileNames.add(file.getName());
//            hmap.put(extension, fileNames);
//        }
//        return hmap;
//    }


}
