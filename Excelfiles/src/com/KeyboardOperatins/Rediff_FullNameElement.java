package com.KeyboardOperatins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_FullNameElement {
	
	WebDriver dr;
	String applicationUrlAddress="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(applicationUrlAddress);
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
	
	}

	@AfterTest
	public void teardown()
	{
		//dr.quit();
	}
	@Test
	public void FullName()
	{
		//WebElement FullNameElement=dr.findElement(By.name("name71e85334"));
		WebElement FullNameElement=dr.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
		FullNameElement.sendKeys("harikrishna vudamala");
		//WebElement MailIdElement=dr.findElement(By.name("login44cc8baa"));
		WebElement MailIdElement=dr.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]"));
		MailIdElement.sendKeys("vhariipl");
		//WebElement CheckAvailabilityElement=dr.findElement(By.name("btnchkavailedd36777"));
		WebElement CheckAvailabilityElement=dr.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]"));
		CheckAvailabilityElement.click();
		
		
	}
}
