package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlAndValidating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		String actualUrlAddress=driver.getCurrentUrl();
		System.out.println("actual url:"+actualUrlAddress);
		
		String expectedUrlAddress="google.com";
		System.out.println("expected url:"+expectedUrlAddress);
		
		if(actualUrlAddress.contains(expectedUrlAddress))
		{
			System.out.println("url matched-pass");
		}
		else
		{
			System.out.println("url not matched-fail");
		}
		driver.close();

	}

}
