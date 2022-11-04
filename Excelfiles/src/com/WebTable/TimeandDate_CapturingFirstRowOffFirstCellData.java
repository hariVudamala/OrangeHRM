package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeandDate_CapturingFirstRowOffFirstCellData {
	
	@Test
	public void capturingFirstRowOffFirstCellData()
	{
		WebDriver dr;
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(applicationUrlAddress);
		dr.manage().window().maximize();
		
		WebElement firstRowfirstCell_Element=dr.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a"));
		
		String firstRowfirstCell_data=firstRowfirstCell_Element.getText();
		
		System.out.println("the Text of firstRow firstCell value is:"+firstRowfirstCell_data);
		
		dr.quit();
	}
	
	
	

}
