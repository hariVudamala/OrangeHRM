package RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver dr;
	String	ApplicationUrlAddress="https://echoecho.com/htmlforms10.htm";
		
	System.setProperty("webdriver.edge.driver","./DriverFiles/msedgedriver.exe");
	dr=new EdgeDriver();
	dr.get(ApplicationUrlAddress);
	dr.manage().window().maximize();
	
	//"/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"
	
	WebElement radioButtonsBlock=dr.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
	List<WebElement>group1RadioButtons=radioButtonsBlock.findElements(By.name("group1"));
	List<WebElement>group2RadioButtons=radioButtonsBlock.findElements(By.name("group2"));
	int group1RadioButtonsLength=group1RadioButtons.size();
	int group2RadioButtonsLength=group2RadioButtons.size();
	System.out.println("number of radio buttons in group1 are:"+group1RadioButtonsLength);
	System.out.println("number of radio buttons in group2 are:"+group2RadioButtonsLength);
	
	for(int i=0;i<3;i++)
	{
		group1RadioButtons.get(i).click();
		
	Thread.sleep(30000);
		for(int j=0;j<3;j++)
		{
			System.out.println(group1RadioButtons.get(j).getAttribute("value")+" "+group1RadioButtons.get(j).getAttribute("checked"));
		
		}
			System.out.println();
			group2RadioButtons.get(i).click();
		for(int k=0;k<3;k++)
		{
			System.out.println(group2RadioButtons.get(k).getAttribute("value")+" "+group2RadioButtons.get(k).getAttribute("checked"));
			
		}
			System.out.println();
		
	}
	dr.quit();
	
	}

}
