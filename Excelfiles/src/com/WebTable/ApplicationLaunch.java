package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationLaunch {
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
	public void dynamicwebtable() {
		
	}
	

}
