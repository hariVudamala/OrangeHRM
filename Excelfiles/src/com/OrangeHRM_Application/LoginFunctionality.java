package com.OrangeHRM_Application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class LoginFunctionality {
	
		public WebDriver dr;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		
		@BeforeTest
		public void setup()
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\msedgedriver.exe");
			dr = new EdgeDriver();
			
			dr.get(applicationUrlAddress);
			dr.manage().window().maximize();
			//dr.manage().deleteAllCookies();
			dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		}
		@AfterTest
		public void teardown()
		{
			dr.quit();
		}
		
		@Test(priority=1)
		public void ValidationOfLogInPage() throws IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\input data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			Row row=sheet.getRow(1);
			Cell ExpectedLoginPageTextcell=row.getCell(0);
			
			String ExpectedLoginPageText=ExpectedLoginPageTextcell.getStringCellValue();
			System.out.println(ExpectedLoginPageText);
			System.out.println("Expected LoginPage Text:"+ExpectedLoginPageText);
			
			WebElement ActualLoginpageTextElement=dr.findElement(By.id("logInPanelHeading"));
			String ActualLoginpageText=ActualLoginpageTextElement.getText();
			System.out.println("Actual text of Login page:"+ActualLoginpageText);
			
			Cell ActualLoginPageTextcell=row.createCell(1);
			ActualLoginPageTextcell.setCellValue(ActualLoginpageText);
			
			 Cell LoginPageResultCell=row.createCell(2);
			
			if(ActualLoginpageText.equals(ExpectedLoginPageText))
			{
				System.out.println("Login page text is matched-pass");
				LoginPageResultCell.setCellValue("pass");
			}
			else
			{
				System.out.println("Login page Text is not matched-fail");
				LoginPageResultCell.setCellValue("fail");
			}
			
			FileOutputStream file1=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\input data.xlsx");
		     workbook.write(file1);
		}
		
		@Test(priority=2)
		public void Login() throws IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\input data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			Row row=sheet.getRow(1);
			Cell UserNamecell=row.getCell(3);
			Cell PassWordcell=row.getCell(4);
			
			String UserName=UserNamecell.getStringCellValue();
			System.out.println(UserName);
			
			String password=PassWordcell.getStringCellValue();
			
			dr.findElement(By.id("txtUsername")).sendKeys(UserName);
			dr.findElement(By.id("txtPassword")).sendKeys(password);
			dr.findElement(By.id("btnLogin")).click();
			
		}
		@Test(priority=3)
		public void ValidationOfAdminText() throws IOException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\input data.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			Row row=sheet.getRow(1);
			Cell ExpectedHomepageTextcell=row.getCell(5);
			String ExpectedTextOfHomepage=ExpectedHomepageTextcell.getStringCellValue();
			
			WebElement ActualTextOfHomepageElement=dr.findElement(By.id("menu_admin_viewAdminModule"));
			String actualHomepageText=ActualTextOfHomepageElement.getText();
			System.out.println("actual text of Homepage:"+actualHomepageText);
			System.out.println("expected text of Homepage:"+ExpectedTextOfHomepage);
			
			Cell ActualTextOfHomepageText=row.createCell(6);
			ActualTextOfHomepageText.setCellValue(actualHomepageText);
			
			Cell ResultCell=row.createCell(7);
			
			if(actualHomepageText.equals(ExpectedTextOfHomepage))
			{
				System.out.println("Homepage Text is matched-pass");
				ResultCell.setCellValue("PASS");
			}
			else
			{
				System.out.println("Homepage Text is not matched-fail");
				ResultCell.setCellValue("fail");
			}
			FileOutputStream file1=new FileOutputStream("C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\input data.xlsx");
		     workbook.write(file1);
		}
		@Test(priority=4)
		public void goThrowPIMandAddEmployee()
		{
			 dr.findElement(By.id("menu_pim_viewPimModule")).click();
			 dr.findElement(By.linkText("Add Employee")).click();
		}

	}




	


