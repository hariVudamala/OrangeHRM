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

public class Tsrtc_keyboardOperation {
	WebDriver dr;
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(applicationUrlAddress);
		dr.manage().window().maximize();
		
		
	}
	@AfterTest
	public void TearDown()
	{
		dr.quit();
		
	}
	@Test
	public void sendkeys() throws InterruptedException
	{
		WebElement FromcityElemenet=dr.findElement(By.id("fromPlaceName"));
		Actions action=new Actions(dr);
		FromcityElemenet.sendKeys("hyderabad");
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		dr.findElement(By.id("toPlaceName")).sendKeys("visakapatnam");
	
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		dr.findElement(By.id("txtJourneyDate")).click();
		dr.findElement(By.linkText("22")).click();
		
		dr.findElement(By.id("searchBtn")).click();
		
	}

}
