package capturingScreenShot;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		String ApplicationUrlAdress="https://www.osmania.ac.in/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(ApplicationUrlAdress);
		
		
	File osmaniaWebpage=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(osmaniaWebpage,new File("./Screenshot/osmaniauniversityHomepage.png"));
	
	
	
	
	

	
	

	
	

	
	}


	}


