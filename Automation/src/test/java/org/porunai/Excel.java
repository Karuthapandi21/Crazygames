package org.porunai;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel {
public static void main(String args[]) throws IOException {
	File f=new File("C:\\Users\\91877\\eclipse-workspace\\New folder (2)\\Automation\\src\\test\\resources\\Book2.xlsx");
	FileInputStream i=new FileInputStream(f);
    Workbook w=new XSSFWorkbook(i);
    Sheet s = w.getSheet("Sheet1");
    Row r = s.getRow(1);
    Cell c = r.getCell(1);
    System.out.println(c);
	}
}

