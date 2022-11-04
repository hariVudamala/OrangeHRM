package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLoginFuncionalityOfOrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		
		dr.findElement(By.id("txtUsername")).sendKeys("harikrishna");
		dr.findElement(By.id("txtPassword")).sendKeys("a13m1@GOD");
		//dr.findElement(By.id("btnLogin")).click();
		         //OR
		//dr.findElement(By.name("Submit")).click();
		          //OR
		WebElement loginbutton=dr.findElement(By.name("Submit"));
		loginbutton.click();
		 String actualTitleAfterLogin=dr.getTitle();
		System.out.println("actual title after login:"+actualTitleAfterLogin);
		String expectedTitleAfterLogin="OrangeHRM";
		if(actualTitleAfterLogin.equals(expectedTitleAfterLogin))
		{
			System.out.println("Title matched after login-pass");
		}
		else
		{
			System.out.println("Title not matched after login-fail");
		}
		dr.close();
	}

}
