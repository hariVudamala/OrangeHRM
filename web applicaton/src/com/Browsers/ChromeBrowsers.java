package com.Browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		
		ChromeDriver Hello=new ChromeDriver();
		
		Hello.get("https://accounts.google.co.in/");
		
		Hello.close();
		
		
	}

}
