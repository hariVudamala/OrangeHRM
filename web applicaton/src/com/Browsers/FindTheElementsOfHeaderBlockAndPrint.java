package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindTheElementsOfHeaderBlockAndPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		WebDriver dr;
		
		System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		
		dr=new EdgeDriver();
		dr.get("http://valuelabs.com");
		WebElement headerblock=dr.findElement(By.className("container"));
		
		
		
		

	}

}
