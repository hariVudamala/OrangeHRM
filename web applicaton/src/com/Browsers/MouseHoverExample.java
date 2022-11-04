package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get("http://www.amazon.in");
		dr.manage().window().maximize();
		Thread.sleep(10000);
		WebElement helloSignInElement=dr.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		  String text=helloSignInElement.getText();
		  System.out.println("the actual text of hello sign in element:"+text);
		  
		  Actions act=new Actions(dr);
		  act.moveToElement(helloSignInElement).perform();
		  
		   WebElement yourordersElement = dr.findElement(By.linkText("Your Orders"));
		  
		   yourordersElement.click();
	}

}
