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

public class TsrtcWebApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr;
	String 	ApplicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
	dr=new EdgeDriver();
	dr.get(ApplicationUrlAddress);
	dr.manage().window().maximize();
	WebElement headerBlock=dr.findElement(By.className("menu"));
	List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
	
	int headerBlockLinks_Count=headerBlockLinks.size();
	System.out.println("number links in header block are:"+headerBlockLinks_Count);
	for(int i=0;i<headerBlockLinks_Count;i++)
	{
		String headerBlockLinkName=headerBlockLinks.get(i).getText();
		System.out.println(i+" "+headerBlockLinkName);
	Thread.sleep(10000);
	headerBlockLinks.get(i).click();
	Thread.sleep(10000);
   System.out.println(dr.getTitle());
		Thread.sleep(10000);
		File TSRTCwebpage=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(TSRTCwebpage,new File("./Screenshot/"+headerBlockLinkName+".png"));
		Thread.sleep(10000);
		dr.navigate().back();
		headerBlock=dr.findElement(By.className("menu"));
		headerBlockLinks=headerBlock.findElements(By.tagName("a"));
	}
	dr.quit();
	}

}
