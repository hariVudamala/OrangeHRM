package com.tsrtc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_LinksTesting {
	public static void main(String[] args) {
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		dr=new ChromeDriver();
		dr.get("https://www.tsrtconline.in/oprs-web/");
		WebElement headerBlock=dr.findElement(By.className("menu"));
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		//<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
		//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
		//<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		//<a class="tabcopy" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
		//<a class="tabcopy" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
		//<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info<a 
				//class="tabcopy" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a></a>
		
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerBlockLinks_Count=headerBlockLinks.size();
		System.out.println("number of header block links:"+headerBlockLinks_Count);
		
		for(int i=0;i<headerBlockLinks_Count;i++)
		{
		 String headerLinksNames=headerBlockLinks.get(i).getText();
		 System.out.println(i+" "+headerLinksNames);
		 headerBlockLinks.get(i).click();
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		System.out.println();
		dr.navigate().back();
		
		 headerBlock=dr.findElement(By.className("menu"));
		 headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		 
		}
		dr.quit();
	}
	
		
	}


