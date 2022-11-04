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

public class OrangeHRM_ExcelOperation1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver dr;
		String ApplicationUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.edge.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get(ApplicationUrl);
		dr.manage().window().maximize();
		
		FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\samplefile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String expectedLoginpanelText=cell.getStringCellValue();
		System.out.println("expected text of loginpanel:"+expectedLoginpanelText);

		WebElement loginpanelElement=dr.findElement(By.id("logInPanelHeading"));
		String actualText=loginpanelElement.getText();
		System.out.println("actual text of login page:"+actualText);
		
		cell=row.createCell(1);
		cell.setCellValue(actualText);
	
		cell=row.createCell(2);
		if(actualText.equals(expectedLoginpanelText))
		{
			System.out.println("login panel text is matched-pass");
			cell.setCellValue("pass");
			
		}
		else
		{
			System.out.println("login panel text not matched-fail");
			cell.setCellValue("fail");
		}
		
		
		
		String UserName=row.getCell(3).getStringCellValue();
		String PassWord=row.getCell(4).getStringCellValue();
		dr.findElement(By.id("txtUsername")).sendKeys(UserName);
		dr.findElement(By.id("txtPassword")).sendKeys(PassWord);
		dr.findElement(By.id("btnLogin")).click();
		
		
	    String expectedHomepageText=row.getCell(5).getStringCellValue();
	    WebElement AdminElement=dr.findElement(By.id("menu_admin_viewAdminModule"));
	    String actualHomepageText=AdminElement.getText();
	    System.out.println("actual text of Homepage:"+actualHomepageText);
		System.out.println("expected text of Homepage:"+expectedHomepageText);
		cell=row.createCell(6);
		cell.setCellValue(actualHomepageText);
		
		cell=row.createCell(7);
	    if(actualHomepageText.equals(expectedHomepageText))
	    {
			 System.out.println("Homepage text is matched-pass");
			 cell.setCellValue("pass");
	    }
	    else
	    {
	    	System.out.println("Homepage  text is not matched-fail");
	    	cell.setCellValue("fail");
	    }
	    
	    
	    
	    dr.findElement(By.id("menu_pim_viewPimModule")).click();
	    dr.findElement(By.linkText("Add Employee")).click();
	    
	    
	    cell=row.getCell(8);
	    String ExpectedAddEmployeeText=cell.getStringCellValue();
	    System.out.println("expected addemployee text:"+ExpectedAddEmployeeText);
	    WebElement AddEmployeeElement=dr.findElement(By.xpath("//*[text()='Add Employee']"));
	    String actualAddemployeeText=AddEmployeeElement.getText();
	    System.out.println("actual add employee text:"+actualAddemployeeText);
	    cell=row.createCell(9);
	    cell.setCellValue(actualAddemployeeText);
	    
	    cell=row.createCell(10);
	    if(actualAddemployeeText.equals(ExpectedAddEmployeeText))
	    {
			 System.out.println("add empolyee text is matched-pass");
			 cell.setCellValue("pass");
			 
	    }
	    else
	    {
			 System.out.println("add empolyee tet is not matched-fail");
			 cell.setCellValue("fail");
	    }
	    
	    
	    WebElement employeeIdvalue=dr.findElement(By.id("employeeId"));
		String expectedEmployeeId=employeeIdvalue.getAttribute("value");
	    cell=row.createCell(14);
	    cell.setCellValue(expectedEmployeeId);
	    
	    
	    String firstname=row.getCell(11).getStringCellValue();
	    String middleName=row.getCell(12).getStringCellValue();
	    String lastName=row.getCell(13).getStringCellValue();
	    dr.findElement(By.id("firstName")).sendKeys(firstname);
		dr.findElement(By.id("middleName")).sendKeys(middleName);
		dr.findElement(By.id("lastName")).sendKeys(lastName);
		dr.findElement(By.id("btnSave")).click();
		
	    
	    cell=row.getCell(15);
		String expectedPersonalDetailsText=cell.getStringCellValue();
		
		///html/body/div[1]/div[3]/div/div[2]/div[1]/h1
		
		WebElement personalDetailsElement=dr.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[1]/h1"));
		String ActualPersoalDetailsText=personalDetailsElement.getText();
		System.out.println("expected personal details text:"+expectedPersonalDetailsText);
		System.out.println("actual personal details text:"+ActualPersoalDetailsText);
		cell=row.createCell(16);
		cell.setCellValue(ActualPersoalDetailsText);
	
		cell=row.createCell(17);
		if(ActualPersoalDetailsText.equalsIgnoreCase(expectedPersonalDetailsText))
		{
			System.out.println("personal details text is matched-pass");
			cell.setCellValue("pass");
		}
		else
		{
			System.out.println("personal details text is not matched-fail");
			cell.setCellValue("fail");
		}
		
		
	
		WebElement firstnameElement=dr.findElement(By.id("personal_txtEmpFirstName"));
		String actualFirstnameText=firstnameElement.getAttribute("value");
		System.out.println("actual first name:"+actualFirstnameText);
		System.out.println("expected first name:"+firstname);
		
		cell=row.createCell(18);
		cell.setCellValue(actualFirstnameText);
		
		if(actualFirstnameText.equals(firstname))
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
		System.out.println("expected middle name:"+middleName);
		cell=row.createCell(19);
		cell.setCellValue(actualMiddleName);
		
		if(actualMiddleName.equals(middleName))
		{
			System.out.println("middle name is matched-pass");
		}
		else
		{
			System.out.println("middle name is not matched-fail");
		}
		
		
		
		WebElement lastNameElement=dr.findElement(By.id("personal_txtEmpLastName"));
		String actualLastname=lastNameElement.getAttribute("value");
		System.out.println("actual last name:"+actualLastname);
		System.out.println("expected last name:"+lastName);
		cell=row.createCell(20);
		cell.setCellValue(actualLastname);
		if(actualLastname.equals(lastName))
		{
			System.out.println("last name is matched-pass");
		}
		else
		{
			System.out.println("last name is not matched-fail"); 
			
		}
		
		
		
		WebElement employeeIdElement=dr.findElement(By.id("personal_txtEmployeeId"));
		String actualEmployeeId=employeeIdElement.getAttribute("value");
		System.out.println("actual employee id:"+actualEmployeeId);
		System.out.println("expected employee id:"+expectedEmployeeId);
		cell=row.createCell(21);
		cell.setCellValue(actualEmployeeId);
		
		cell=row.createCell(22);
		if(actualEmployeeId.equals(expectedEmployeeId))
		{
			System.out.println("employee id is matched-pass");
			cell.setCellValue("pass");
		}
		else
		{
			System.out.println("employee id is not matched-fail");
			cell.setCellValue("fail");
		}
		
		FileOutputStream file1=new FileOutputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\samplefile.xlsx");
		workbook.write(file1);
		
		
		dr.findElement(By.id("welcome")).click();
		Thread.sleep(10000);
		dr.findElement(By.linkText("Logout")).click();
		Thread.sleep(10000);
		dr.quit();
		
		
		
		
	}

}
