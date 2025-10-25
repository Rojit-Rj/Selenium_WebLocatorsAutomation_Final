package com.rojit.seleniumwebactions.utils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvUtil {
    private List<String[]> allData = null;
    public CsvUtil(String filePath) { 
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) { 
            allData = reader.readAll(); 
        } catch (IOException | CsvException e) { 
            e.printStackTrace(); 
        } 
    }
    
    public String getData(int row, int col) { 
        if (allData == null || row >= allData.size() || col >= allData.get(row).length) return ""; return allData.get(row)[col]; 
    }
    
    public int getRowCount() { 
        return (allData == null) ? 0 : allData.size(); 
    }
}
