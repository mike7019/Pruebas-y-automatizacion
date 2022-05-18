package testing.sqa.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataTable {

    private XSSFWorkbook book;
    private FileInputStream file;

    public String ReadDataSheet(String page, String path, int rowValue, int cellValue) throws IOException {
        String pointer;
        file = new FileInputStream(new File(path));
        book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheet(page);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        pointer = cell.getStringCellValue();
        book.close();
        file.close();
        return pointer;
    }
}
