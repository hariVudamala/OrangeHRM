package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_writeOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\TestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		Row row=sheet.createRow(2);
		
		Cell cell=row.createCell(3);
		
	cell.setCellValue("livetech");
	FileOutputStream file1=new FileOutputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\TestData.xlsx");
	
	workbook.write(file1);

	}

}
