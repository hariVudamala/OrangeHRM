package com.ExcelOperations;

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


public class OsmaniaUniversityLanugagesSaveinExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver dr;
	
	String ApplicationURl="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.get(ApplicationURl);
	dr.manage().window().maximize();
	WebElement headerBlock=dr.findElement(By.className("menu"));
	List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
	FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\data.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("sheet1");
	
	
	int headerBlockLinks_Count=headerBlockLinks.size();
	System.out.println("number links in header block are:"+headerBlockLinks_Count);
	for(int i=0;i<headerBlockLinks_Count;i++)
	{
		String headerBlockLinkName=headerBlockLinks.get(i).getText();
		
		Row row=sheet.createRow(i);
		Cell cell=row.createCell(0);
		cell.setCellValue(headerBlockLinkName);
		FileOutputStream file1=new FileOutputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\data.xlsx");

			workbook.write(file1);

		
		
	}

}
}