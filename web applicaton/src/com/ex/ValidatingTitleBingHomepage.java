package com.ex;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitleBingHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\chromedriver.exe");
		  ChromeDriver dr=new ChromeDriver();
		  
		  dr.get("http://Bing.com");
		  
		  String actualbinghomepagetitle=dr.getTitle();
		  System.out.println("the actual title bing homepage is:"+actualbinghomepagetitle);
		  
		  String expectedbinghomepagetitle="Bing";
		  System.out.println("the expectedbing home page is:"+expectedbinghomepagetitle);
		  
		  
		  if(actualbinghomepagetitle.equals(expectedbinghomepagetitle))
		  {
			  System.out.println("Title matched-pass");
		  }
		  else
		  {
			  System.out.println("Title not matched-fail");
		  }
		  dr.close();

	}

}
