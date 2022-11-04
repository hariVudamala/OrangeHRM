package com.Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OHRM_LoginTest {
	
	@Parameters("Browser")
	@Test
	public void login(String browserName) throws MalformedURLException
	{
		System.out.println("the browser name is:"+browserName);
		DesiredCapabilities cap=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browserName.equalsIgnoreCase("edge"))
			{
				cap=DesiredCapabilities.edge();
				cap.setBrowserName("edge");
				cap.setPlatform(Platform.WINDOWS);
				
			}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.15:4444/wd/hub"),cap);
		String applicationurlAddress="https://www.tsrtconline.in/oprs-web/";
		
		driver.get(applicationurlAddress);
		driver.manage().window().maximize();
		
		
	}

}
