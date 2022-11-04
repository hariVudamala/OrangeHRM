package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationOfTitleOForangeHrmApplicatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		dr.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		
		String actualTitle=dr.getTitle();
		System.out.println("actual title of application:"+actualTitle);
		String expectedTitle="OrangeHRM";
		System.out.println("expected title of application:"+expectedTitle);
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Titlr matched-pass");
		}
		else
		{
			System.out.println("Title not matched-fail");
		}
		dr.close();
    
	}

}
