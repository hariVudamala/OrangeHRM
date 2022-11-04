package com.valuelabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementsOfHeaderBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver dr;
		System.setProperty("webdriver.edge.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\msedgedriver.exe");
		
		dr=new EdgeDriver();
		dr.get("http://valuelabs.com");
		dr.manage().window().maximize();
		
		WebElement headerBlock=dr.findElement(By.className("container"));
		
		//<a class="nav-link1 menu-main dropdown-toggle" href="https://www.valuelabs.com" id="Dropdown_about"
				//role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">About Us</a>
	
		//<a class="nav-link1 menu-main dropdown-toggle" href="https://www.valuelabs.com" id="Dropdown_service"
				//+ " role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Services</a>
		
		//<a class="nav-link1 menu-main dropdown-toggle" href="https://www.valuelabs.com" id="Dropdown_Industries"
				//role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Industries</a>
		
		//<a class="gtm-click nav-link1 menu-main"
				//href="https://www.valuelabs.com/success-stories/">Our Work </a>
		//<a href="https://www.valuelabs.com/events-and-webinars/" class="gtm-click nav-link1"> Events </a>
		
		
		//<a href="https://www.valuelabs.com/resources/" class="gtm-click nav-link1"> Resource</a>
		
		//<a class="gtm-click nav-link1 menu-main" href="https://www.valuelabs.com/careers/"> Careers </a>
		
		//all headerBlockElements are having the same common property of links having anchor tag(a)
		
		List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerLinksCount=headerLinks.size();
		System.out.println("header links count:"+headerLinksCount);
		for(int i=0;i<headerLinksCount;i++)
		{
			if(headerLinks.get(i).isDisplayed())
			{
				String headerLinksNames=headerLinks.get(i).getText();
				System.out.println(i+" "+headerLinksNames);
			}	
		
		}
		
		
		
		
		
	}

}
