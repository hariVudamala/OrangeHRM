package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingOptionalVluesFromddropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
	String ApplicationUrlAddress="https://my.monsterindia.com/sponsered_popup.html";
	System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
	dr=new EdgeDriver();
	dr.get(ApplicationUrlAddress);
	dr.manage().window().maximize();
	
	WebElement currentLocationBlock=dr.findElement(By.className("border_grey1"));
	List<WebElement>currentLocation_cityNames=currentLocationBlock.findElements(By.tagName("option"));
	
	int currentLocationCityNames_length=currentLocation_cityNames.size();
	System.out.println("number of cities in currentLocation block:"+currentLocationCityNames_length);
	for(int i=0;i<currentLocationCityNames_length;i++)
	{
	String cityName=currentLocation_cityNames.get(i).getText();
	//System.out.println(i+" "+cityName);

	Select hari=new Select(currentLocationBlock);
     //hari.selectByIndex(i);
	//hari.selectByVisibleText(cityName);
	hari.selectByValue(currentLocation_cityNames.get(i).getAttribute("value"));
	
	
	
	}
	/*Select sele=new Select(currentLocationBlock);
	sele.selectByIndex(1);
	sele.selectByValue("491");
	sele.selectByVisibleText("Kolkata");
	
	WebElement industryBlock=dr.findElement(By.id("id_industry"));
	
	Select selection=new Select(industryBlock);
	selection.selectByIndex(4);
	selection.selectByVisibleText("Banking/Accounting/Financial Services");
	selection.selectByValue("4");
	
	selection.deselectByVisibleText("Automotive/Automobile/Ancillaries");
	selection.deselectByValue("5");
	selection.deselectAll();*/
	
	
	
	
	}

}
