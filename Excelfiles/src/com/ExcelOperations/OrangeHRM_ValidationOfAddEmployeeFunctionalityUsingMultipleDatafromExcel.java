package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class OrangeHRM_ValidationOfAddEmployeeFunctionalityUsingMultipleDatafromExcel {
	
	WebDriver dr;
	@BeforeTest
	public void Setup()
	{
	
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.edge.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get(ApplicationUrl);
		dr.manage().window().maximize();
		
		
	}
	@AfterTest
	public void Teardown()
	{
		
		dr.quit();
	
	}
	@Test
	public void AddEmployeeFunctionality() throws IOException, InterruptedException
	{
		dr.findElement(By.id("txtUsername")).sendKeys("harikrishna");
		dr.findElement(By.id("txtPassword")).sendKeys("a13m1@GOD");
		dr.findElement(By.id("btnLogin")).click();
		
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		dr.findElement(By.linkText("Add Employee")).click();
		
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\OrangeHRM.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int rows_count=sheet.getLastRowNum();
		System.out.println("number of rows of data in excel:"+rows_count);
		for(int i=1;i<=rows_count;i++)
		{
			Row row=sheet.getRow(i);
			Cell FirstNamecell=row.getCell(0);
			Cell MiddleNamecell=row.getCell(1);
			Cell LastNamecell=row.getCell(2);
			
			String FirstName=FirstNamecell.getStringCellValue();
			String MiddleName=MiddleNamecell.getStringCellValue();
			String LastName=LastNamecell.getStringCellValue();
			
			WebElement employeeIdvalue=dr.findElement(By.id("employeeId"));
			String expectedEmployeeId=employeeIdvalue.getAttribute("value");
			
			dr.findElement(By.id("firstName")).clear();
			dr.findElement(By.id("firstName")).sendKeys(FirstName);
			dr.findElement(By.id("middleName")).clear();
			dr.findElement(By.id("middleName")).sendKeys(MiddleName);
			dr.findElement(By.id("lastName")).clear();
			dr.findElement(By.id("lastName")).sendKeys(LastName);
			dr.findElement(By.id("btnSave")).click();
			 
			WebElement EmployeeIdElement=dr.findElement(By.name("personal[txtEmployeeId]"));
			String actualEmployeeId=EmployeeIdElement.getAttribute("value");
			
			System.out.println("Employee Name:"+actualEmployeeId+" "+FirstName+"  "+MiddleName+"  "+LastName);
			
			System.out.println("actual employee id:"+actualEmployeeId); 
			System.out.println("expected employee id is:"+expectedEmployeeId);
			if(actualEmployeeId.equals(expectedEmployeeId))
			{
				System.out.println("employee id is matched-pass ");
			}
			else
			{
				System.out.println("employee id is not matched- fail");
			}
			
			WebElement firstNameElement=dr.findElement(By.id("personal_txtEmpFirstName"));
			String firstnameAttributeValue=firstNameElement.getAttribute("value");
			System.out.println("actual first name:"+firstnameAttributeValue);
			System.out.println("expected first name:"+FirstName);
			if(firstnameAttributeValue.equals(FirstName))
			{
				System.out.println("first name is matched-pass");
			}
			else
			{
				System.out.println("first name is not matched-fail");
			}
			
			WebElement middleNameElement=dr.findElement(By.id("personal_txtEmpMiddleName"));
			String actualMiddleName=middleNameElement.getAttribute("value");
			System.out.println("actual middle name:"+actualMiddleName);
			System.out.println("expected middle name:"+MiddleName);
			if( actualMiddleName.equals(MiddleName))
			{
				System.out.println("middle name is matched-pass");
			}
			else
			{
				System.out.println("middle name is not matched- fail");
			}
			
			WebElement lastNameElement=dr.findElement(By.id("personal_txtEmpLastName"));
			String actualLastName=lastNameElement.getAttribute("value");
			System.out.println("actual last name:"+actualLastName);
			System.out.println("expected last name:"+LastName);
			if(actualLastName.equals(LastName))
			{
				System.out.println("last name is matched-pass");
			}
			else
			{
				System.out.println("last name is not matched-fail");
			}
		
			
			dr.navigate().back();
			
		}
			dr.findElement(By.id("welcome")).click();
			Thread.sleep(30000);
			dr.findElement(By.linkText("Logout")).click();
	
		
		
		
		
		
		
		
		
		
	}

}
