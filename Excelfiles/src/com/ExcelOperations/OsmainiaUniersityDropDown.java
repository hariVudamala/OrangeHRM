package com.ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class OsmainiaUniersityDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		String applicationUrl="https://www.osmania.ac.in/";
	//	System.setProperty("webdriver.chrome.driver","./driverfiles/chromedriver.exe");
		//dr=new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\msedgedriver.exe");
		dr = new EdgeDriver();
		dr.get(applicationUrl);
		dr.manage().window().maximize();	
		
		WebElement SelectLanguageDropdown=dr.findElement(By.id("gtranslate_selector"));
		List<WebElement>LanguageNames=SelectLanguageDropdown.findElements(By.tagName("option"));
		
		int Languages_count=LanguageNames.size();
		System.out.println("number of language in dropdown are:"+Languages_count);
		for(int i=0;i<Languages_count;i++)
		{
			String languageName=LanguageNames.get(i).getText();
			System.out.println(i+" "+languageName);
			
			//Select selection=new Select(SelectLanguageDropdown);
			//selection.selectByIndex(i);
			//selection.selectByVisibleText(languageName);
			//selection.selectByValue(LanguageNames.get(i).getAttribute("value"));
		//	Thread.sleep(20000);
		//	File Screenshot=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(Screenshot, new File("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\newScreenshots"+languageName+".png"));
			//Thread.sleep(20000);
			//FileInputStream file=new FileInputStream("C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\src\\excelfile\\data.xlsx");
		/*	XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet("sheet1");
			Row row=sheet.createRow(i);
			Cell cell=row.createCell(0);
			cell.setCellValue(languageName);
			FileOutputStream file1=new FileOutputStream("C:\\\\Users\\\\sh\\\\Desktop\\\\Hari_java_appilications\\\\Excelfiles\\\\src\\\\excelfile\\\\data.xlsx");
			workbook.write(file1);
			
			*/
			
			
		}

		dr.quit();
		
	}

}
