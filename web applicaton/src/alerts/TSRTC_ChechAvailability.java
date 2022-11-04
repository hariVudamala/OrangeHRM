package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_ChechAvailability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
		
	System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
	
	dr=new EdgeDriver();
	dr.get(applicationUrlAddress);
	dr.manage().window().maximize();
		
	WebElement CheckAvailabilityElement=dr.findElement(By.id("searchBtn"));
	
	CheckAvailabilityElement.click();
	Alert alert=dr.switchTo().alert();
	
	alert.accept();
	
	
	
	}

}
