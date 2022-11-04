package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMValidationOfLoginFunctionalityusingMultipleExcellData {
	WebDriver dr;
	@BeforeTest
	public void applicationLaunch()
	{
	
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.edge.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get(ApplicationUrl);
		dr.manage().window().maximize();
		
	}
	@AfterTest
	public void applicationClose()
	{
		
		//dr.quit();
	}
	@Test
	public void ValidationOfLoginFunctionality() throws IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\OrangeHRM.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows_count=sheet.getLastRowNum();
		System.out.println("number of rows in exceldata are;"+rows_count);
		for(int i=1;i<=rows_count;i++)
		{
			
			Row row=sheet.getRow(i);
			int cell_count=row.getLastCellNum();
			Cell cell=row.getCell(0);
			String username=cell.getStringCellValue();
			System.out.println(username);
			Cell cell1=row.getCell(1);
			String password=cell1.getStringCellValue();
			System.out.println(password);
			String pagesourceBeforeLogin=dr.getPageSource();
		    Thread.sleep(10000);
			dr.findElement(By.id("txtUsername")).clear();
		    Thread.sleep(10000);
			dr.findElement(By.id("txtUsername")).sendKeys(username);
		    Thread.sleep(10000);
			dr.findElement(By.id("txtPassword")).clear();
		    Thread.sleep(10000);
			dr.findElement(By.id("txtPassword")).sendKeys(password);
		    Thread.sleep(10000);
			dr.findElement(By.id("btnLogin")).click();
			String pagesourceAfterLogin=dr.getPageSource();
	
			    cell=row.createCell(2);
			    if(pagesourceBeforeLogin.equals(pagesourceAfterLogin))
			    {
			    	
					cell.setCellValue("fail");
				
						
			    }
			    else
			    {
			    	
			    	cell.setCellValue("pass");
			    	dr.findElement(By.id("welcome")).click();
					Thread.sleep(10000);
					dr.findElement(By.linkText("Logout")).click();
						
			    	
			    }

			    FileOutputStream file1=new FileOutputStream("C:\\\\Users\\\\sh\\\\Desktop\\\\Hari_java_appilications\\\\Excelfiles\\\\src\\\\excelfile\\\\OrangeHRM.xlsx");
				
				workbook.write(file1);
			
		
	     
			}
		
	}

}
