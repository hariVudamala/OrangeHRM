package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://bing.com");
		
	   String bingHomePageTitle=driver.getTitle();
	   System.out.println("the title of bing homepage is:"+bingHomePageTitle);
	   
	   driver.close();
	}

}
