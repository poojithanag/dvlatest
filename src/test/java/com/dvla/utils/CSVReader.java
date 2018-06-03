package com.dvla.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class CSVReader {
    public List<String[]> getContents(String fileName, List<String[]> myList) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String cvsSplitBy = ",";
                String[] vehicleDetails = line.split(cvsSplitBy);
                myList.add(vehicleDetails);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }
}
