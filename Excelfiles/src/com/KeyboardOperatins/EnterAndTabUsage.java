package com.KeyboardOperatins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EnterAndTabUsage {
	
	WebDriver dr;
	String applicatonUrlAddress="https://www.youtube.com/";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(applicatonUrlAddress);
		dr.manage().window().maximize();
		//dr.manage().deleteAllCookies();
	}
	@AfterTest 
	public void TearsDown()
	{
		//dr.quit();
	}
	@Test
	public void Search() throws InterruptedException 
	{
		WebElement SearchElement=dr.findElement(By.name("search_query"));
		SearchElement.sendKeys("national Anthem");
		
		Actions action=new Actions(dr);
		
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(20000);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
	}

}
