package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleIndiaGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		
		 dr=new EdgeDriver();
		 dr.get("http://google.com");
		 
		 dr.manage().window().maximize();
		 
		WebElement indiaElement=dr.findElement(By.className("uU7dJb"));
		
		 String indiaText=indiaElement.getText();
		 
		 System.out.println("india text in google home page:"+indiaText);
		 dr.close();
		

	}

}
