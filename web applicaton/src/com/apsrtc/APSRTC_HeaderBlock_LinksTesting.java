package com.apsrtc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class APSRTC_HeaderBlock_LinksTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
		System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get("https://www.apsrtconline.in/oprs-web/");
		dr.manage().window().maximize();
		WebElement headerBlockElement=dr.findElement(By.className("menu"));
		//<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		//<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Ticket Status">Ticket Status</a>
		//<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Ticket">Cancel Ticket</a>
		//<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Track Service">Track Service</a>
		//<a class="selectedtabcopy" href="/oprs-web/services/coaches.do" target="_top" title="Gallery">Gallery</a>
		//<a class="tabcopy" href="/oprs-web/wallet/traxnHistory.do" target="_top" title="Wallet">Wallet</a>
		//<a class="tabcopy" href="/oprs-web/services/timeTable.do" target="_top" title="TimeTable / Track">TimeTable / Track</a>
		List<WebElement>headerBlocklinks=headerBlockElement.findElements(By.tagName("a"));
		int headerLinks_Count=headerBlocklinks.size();
		System.out.println("number of links in header block:"+headerLinks_Count);
		for(int i=0;i<headerLinks_Count;i++)
		{
			String headerLiksName=headerBlocklinks.get(i).getText();
		
			System.out.println(i+" "+headerLiksName);
			headerBlocklinks.get(i).click();
			System.out.println(dr.getTitle());
			System.out.println(dr.getCurrentUrl());
			dr.navigate().back();
			headerBlockElement=dr.findElement(By.className("menu"));
			headerBlocklinks=headerBlockElement.findElements(By.tagName("a"));
		}
		dr.quit();
		
	}

}
