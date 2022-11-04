package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginFunctionalityOfFaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		 
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("http://facebook.com");
		
		String actualTitle=dr.getTitle();
		System.out.println("actual title of facebook:"+actualTitle);
		String expectedTitle="Facebook";
        
		System.out.println("expected title of facebook:"+expectedTitle);
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Title matched-pass");
			
		}
		else
		{
			System.out.println("Title not matched-fail");
		}
		String actualUrl=dr.getCurrentUrl();
		String expectedUrl="facebook.com";
		System.out.println("actualUrl:"+actualUrl);
			System.out.println("expectedUrl:"+expectedUrl);
			if(actualUrl.contains(expectedUrl))
					{
				System.out.println("url matched-pass");
					}
			else
			{
				System.out.println("url not matched-fail");
				
			}
			dr.findElement(By.id("email")).sendKeys("srini.qatrainer");
			dr.findElement(By.id("pass")).sendKeys("testing");
			//dr.findElement(By.id("u_0_5_MI")).click();
			
			//dr.findElement(By.name("login")).click();
			            //or
			WebElement loginbutton=dr.findElement(By.name("login"));
			 loginbutton.click();
			 dr.close();
			 

		
	}

}
