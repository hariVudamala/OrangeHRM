package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebTable{
	WebDriver dr;


@BeforeTest
public void apllicationLaunch()
{
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\Excelfiles\\driverfiles\\chromedriver.exe");
	dr=new ChromeDriver();
	dr.get(applicationUrlAddress);
	dr.manage().window().maximize();
}
@AfterTest
public void apllicationClosing()
{
	dr.close();
}	
	@Test
	public void CapturingDynamicWebTableData()
	{
		
	//	/html/body/div[5]/section[1]/div/section/div[1]/div/table
		
		WebElement webtable=dr.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table"));
		
		List<WebElement>rows=webtable.findElements(By.tagName("tr"));
		
		int rows_count=rows.size();
		System.out.println("number of rows in web table are:"+rows_count);
		
		for(int i=0;i<rows_count;i++)
		{
			List<WebElement>cells=rows.get(i).findElements(By.tagName("td"));
			int cells_count=cells.size();
			for(int j=0;j<cells_count;j++)
			{
				String data=cells.get(j).getText();
				System.out.print(data+" ");
				
			}
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	

}
