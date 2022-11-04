package com.WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingCompleteWebTableIntoExcel {
	WebDriver dr;
	
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
	public void savingWebTableIntoExcel() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\Time and date webtable.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.createRow(0);
	    Cell cell=row.createCell(0);
		for(int i=1;i<=36;i++)
		{
			 row=sheet.createRow(i-1);
			 for(int j=1;j<=8;j++)
			 {
				WebElement webtableElement=dr.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
			    String data=webtableElement.getText();
			    System.out.print(data+"  ");
			     
			    cell=row.createCell(j-1);
				cell.setCellValue(data);
				FileOutputStream file1=new FileOutputStream("C:\\\\Users\\\\sh\\\\Desktop\\\\Hari_java_appilications\\\\Excelfiles\\\\src\\\\excelfile\\\\Time and date webtable.xlsx");
				workbook.write(file1);
		     }
			System.out.println();
		}
		
		
	
	}
	
}
