package com.Browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.setProperty("webdriver.edge.driver", "C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\msedgedriver.exe");
     
         EdgeDriver dr=new EdgeDriver();

         dr.get("http://www.facebook.com");
        // dr.close();
         
	
	}
}