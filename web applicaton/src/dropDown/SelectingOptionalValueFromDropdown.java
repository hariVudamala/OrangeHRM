package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingOptionalValueFromDropdown {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		String ApplicationUrlAdress="https://www.osmania.ac.in/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(ApplicationUrlAdress);
		Thread.sleep(10000);
		dr.manage().window().maximize();
		WebElement SelectLaungageDropdown=dr.findElement(By.id("gtranslate_selector"));
		List<WebElement>LaungageNames=SelectLaungageDropdown.findElements(By.tagName("option"));
		
		int launagenames_length=LaungageNames.size();
		System.out.println("number of laungages:"+launagenames_length);
	for(int i=0;i<launagenames_length;i++)
	{
		String laungageName=LaungageNames.get(i).getText();
		//System.out.println(i+" "+laungageName);
		Select hari=new Select(SelectLaungageDropdown);
		/*hari.selectByIndex(i);
		hari.selectByVisibleText(laungageName);
		hari.selectByVisibleText(LaungageNames.get(i).getText());*/
		hari.selectByValue(LaungageNames.get(i).getAttribute("value"));
		
		
		
	}
	}

}
