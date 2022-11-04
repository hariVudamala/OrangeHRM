package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		WebElement HelloSignInElement=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(HelloSignInElement).perform();
		
		WebElement YourAccountElement=driver.findElement(By.linkText("Your Account"));
		YourAccountElement.click();
		
		
	}

}
