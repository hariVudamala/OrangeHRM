package RadioButtonsTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex2 {

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
		//<input type="radio" name="group2" value="Water">
		//<input type="radio" name="group2" value="Beer">
		//<input type="radio" name="group2" value="Wine" checked="">
		List<WebElement>group2RadioButtons=radioButtonsBlock.findElements(By.name("group2"));
		int group2RadioButtonsLength=group2RadioButtons.size();
		System.out.println("number of radio buttons in group2 are:"+group2RadioButtonsLength);
		for(int i=0;i<group2RadioButtonsLength;i++)
		{
			group2RadioButtons.get(i).click();
			Thread.sleep(30000);
			for(int j=0;j<group2RadioButtonsLength;j++)
			{
				System.out.println(group2RadioButtons.get(j).getAttribute("value")+" "+group2RadioButtons.get(j).getAttribute("checked"));
			}
			System.out.println();
			
			
		}
		dr.quit();
		

	}

}
