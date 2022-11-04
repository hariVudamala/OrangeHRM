package capturingScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.graph.ElementOrder.Type;

public class OsmaniaUniversitySelectlaungageDropdownScreenshots {

	public static <TakeScreenshot> void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver dr;
	String	ApplicationUrlAddress="https://www.osmania.ac.in/";

	System.setProperty("webdriver.edge.driver","C:\\Users\\LENOVO\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\msedgedriver.exe");
	dr=new EdgeDriver();
	dr.get(ApplicationUrlAddress);
	dr.manage().window().maximize();
	WebElement SelectlaungageDropdown=dr.findElement(By.id("gtranslate_selector"));
	
	
	List<WebElement>laungageNames=SelectlaungageDropdown.findElements(By.tagName("option"));
	
	int laungage_count=laungageNames.size();
	System.out.println("number of laungages in dropdown are:"+laungage_count);
	for(int i=0;i<laungage_count;i++)
	{
	String laungageName=laungageNames.get(i).getText();
	System.out.println(i+" "+laungageName);
	
	File Screenshot=((TakesScreenshot)dr).getScreenshotAs(OutputType .FILE);
	FileUtils.copyFile(Screenshot, new File("./osmaniaUniversityScreenshots/"+laungageName+".png"));

	
	
	}
	
	dr.quit();
	}

}
