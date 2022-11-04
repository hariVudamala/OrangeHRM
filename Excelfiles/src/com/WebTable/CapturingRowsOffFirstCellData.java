package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingRowsOffFirstCellData {
	
	WebDriver dr;      //global Declaration  
	@BeforeTest
	public void applicationLaunch()
	{
		String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(applicationUrlAddress);
		dr.manage().window().maximize();
		
	}
	@AfterTest
	public void closingApplication()
	{
		dr.close();
	}
	@Test
	public void CapturingRowsOffFirstCellData()
	{
		//first row first cell element 
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//last row first cell element
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		for(int i=1;i<=36;i++)
		{
		//	WebElement tableElement=dr.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a"));
                                                       //or
			String part1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
			
			String part2="]/td[1]/a";
			
			WebElement tableElement=dr.findElement(By.xpath(part1+i+part2));
			
			String data=tableElement.getText();
			System.out.println(data);
		}
		
	}
	

}
