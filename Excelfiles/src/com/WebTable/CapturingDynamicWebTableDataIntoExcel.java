package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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

public class CapturingDynamicWebTableDataIntoExcel {
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
	public void CapturingDynamicWebTableData() throws IOException
	{
		WebElement webtable=dr.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		int rows_count=rows.size();
		System.out.println("number of rows in the webtable:"+rows_count);
		
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\dynamic time and date webtable.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		for(int i=0;i<rows_count;i++)
		{
			Row row=sheet.createRow(i);
			List<WebElement>cells=rows.get(i).findElements(By.tagName("td"));
			int cells_count=cells.size();
			for(int j=0;j<cells_count;j++)
			{
				
				String data=cells.get(j).getText();
				System.out.print(data);
				Cell cell=row.createCell(j);
				cell.setCellValue(data);
				
			}
			System.out.println();
			FileOutputStream file1=new FileOutputStream("C:\\\\Users\\\\sh\\\\Desktop\\\\Hari_java_appilications\\\\Excelfiles\\\\src\\\\excelfile\\\\dynamic time and date webtable.xlsx");
			workbook.write(file1);
		
		}
	
		
		
	}

}
