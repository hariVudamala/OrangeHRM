package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		String data=cell.getStringCellValue();
		System.out.println(data);
		
	}

}
