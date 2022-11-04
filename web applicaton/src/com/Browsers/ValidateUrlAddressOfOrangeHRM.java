package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrlAddressOfOrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		String actualUrl=dr.getCurrentUrl();
		System.out.println("actual url of orangeHRM:"+actualUrl);
		String expectedUrl="orangehrm-4.2.0.1";
		System.out.println("expected Url of orangeHrm:"+expectedUrl);

		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("url matched-pass");
		}
		else
		{
			System.out.println("url not matched-fail");
		}
		
		dr.close();
			
			
			
			
			
		
	}

}
