package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadMultipleTestDataFromExcel {WebDriver dr;


@BeforeTest
public void apllicationLaunch()
{
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.get(applicationUrlAddress);
	dr.manage().window().maximize();
}
@AfterTest
public void apllicationClosing()
{
	dr.close();
}	
@Test
public void ExcelTestData() throws IOException
{
	FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\dynamic time and date webtable.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("sheet1");
	int rows_count=sheet.getLastRowNum();
	for(int i=0;i<rows_count;i++)
	{
		Row row=sheet.getRow(i);
		int cell_count=row.getLastCellNum();
		for(int j=0;j<cell_count;j++)
		{
			Cell cell=row.getCell(j);
			String data=cell.getStringCellValue();
			System.out.print(data+"");
		}
		System.out.println();
		
	}
	
	
	
}

	
}
