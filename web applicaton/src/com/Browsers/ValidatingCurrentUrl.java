package com.Browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class ValidatingCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\msedgedriver.exe");
		
		EdgeDriver dr=new EdgeDriver();
		dr.get("http://facebook.com");
		
        
        
        
		 String actualFacebookTitle=dr.getTitle();
		
		 System.out.println("actual title:"+actualFacebookTitle);
		 
		 String expectedFacebookTitle="facebook log in or sign up";
		 
		 
		  if(actualFacebookTitle.equals(expectedFacebookTitle))
		  {
			  System.out.println("Title matched-pass");
			  
		  }
		  else
		  {
			  System.out.println("Title not matched-fail");
		  }
		  
		  
		  String actualCurrentUrl=dr.getCurrentUrl();
		System.out.println("actual current url:"+actualCurrentUrl);
		 String expectedCurrentUrl="facebook.com";
		 System.out.println("expected Current Url:"+expectedCurrentUrl);
		 
		 if(actualCurrentUrl.contains(expectedCurrentUrl))
			 
		 {
			 System.out.println("matched pass");
		 }
		 else 
		 {
			 
			 System.out.println("not matched fail");
			 
		 }
		 dr.close();

	}

}
