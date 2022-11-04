package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingCompleteWebTable {
	
	WebDriver dr;
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
	public void applicationClosing()
	{
		//dr.close();
		
	}
	@Test
	public void capturingCompleteWebTable()
	{
		//first row first cell
	         	//  /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		//last row last cell
	        	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++)
		{
			for(int j=1;j<=8;j++)
			{
				WebElement webtableElement=dr.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]"));
			     String data=webtableElement.getText();
			     System.out.print(data+"  ");
			}
			System.out.println();
		}
	}

}
