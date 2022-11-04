package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSignInGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		
		dr=new ChromeDriver();
		dr.get("http://google.com");
		
		dr.manage().window().maximize();
	//	<a class="gb_1 gb_2 gb_8d gb_8c" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
	//continue=https://www.google.com/%3Fgws_rd%3Dssl&amp;ec=GAZAmgQ" target="_top">Sign in</a>
		
		WebElement signInElement=dr.findElement(By.linkText("Sign in"));
		
		String signInText=signInElement.getText();
		
		System.out.println("sign in text in google home page:"+signInText);
		
		signInElement.click();		
		
		dr.close();
		
		
		
		
		
		
		
		
		
	}

}
