package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String ApplicationUrlAddress="https://www.osmania.ac.in/";
		System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		
	WebElement SelectLanguageDropDown=driver.findElement(By.id("gtranslate_selector"));
	 List<WebElement>dropdownLanguage=SelectLanguageDropDown.findElements(By.tagName("option"));
	int language_Count=dropdownLanguage.size();
	System.out.println("number of languages:"+language_Count);
	for(int i=0;i<language_Count;i++)
	{
		String LanguageText=dropdownLanguage.get(i).getText();
		System.out.println(i+" "+LanguageText);
	}
		driver.close();
	}

}
