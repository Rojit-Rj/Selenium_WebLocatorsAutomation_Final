package com.rojit.seleniumwebactions.utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtil {
    
    
    private Sheet sheet;
    
    public ExcelUtil(String filePath, String sheetName) {
        try (FileInputStream fis = new FileInputStream(filePath)) { Workbook workbook = new XSSFWorkbook(fis); sheet = workbook.getSheet(sheetName); } catch (IOException e) { e.printStackTrace(); }
    }

    public String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        org.apache.poi.ss.usermodel.Cell cell = row.getCell(colNum);
        if (cell == null) return "";
        switch (cell.getCellType()) {
            case STRING : 
                return cell.getStringCellValue();
            case NUMERIC :
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN :
                return String.valueOf(cell.getBooleanCellValue());
            default :
                return "";
        }
    }

    public int getRowCount() { 
        return sheet.getLastRowNum(); 
    }
}
