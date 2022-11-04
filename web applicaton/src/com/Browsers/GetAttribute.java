package com.Browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//<a class="gb_1 gb_2 gb_8d gb_8c" 
		//href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.co.in/&amp;ec=GAZAmgQ" 
		//target="_top">Sign in</a>
		WebDriver dr;
			System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
			
			dr=new EdgeDriver();
			dr.get("http://www.google.com");
			//System.out.println("the value of target Attribute is-_top");
		System.out.println("the value of class Attribute is-gb_1 gb_2 gb_8d gb_8c");
		WebElement signinElement=dr.findElement(By.linkText("Sign in"));
		
		String signinElementAttributeValue=signinElement.getAttribute("class");
		//String signinElementAttributeValue=signinElement.getAttribute("target");
		System.out.println(signinElementAttributeValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
