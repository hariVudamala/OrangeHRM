package drageAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		String applicationUrlAddress="https://jqueryui.com/droppable/";
		System.setProperty("webdriver.edge.driver","C:\\Users\\sh\\Desktop\\Hari_java_appilications\\web applicaton\\DriverFiles\\msedgedriver.exe");
		dr=new EdgeDriver();
		dr.get(applicationUrlAddress);
		dr.manage().window().maximize();
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		WebElement frameOfDrageAndDropElement=dr.findElement(By.className("demo-frame"));
		dr.switchTo().frame(frameOfDrageAndDropElement);
		WebElement dragMeToMyTargetElement=dr.findElement(By.id("draggable"));
		System.out.println("dragMeToMyTargetElement is identified");
		WebElement dropHereElement=dr.findElement(By.id("droppable"));
		System.out.println("dropHereElement is identified");
		
		Actions action=new Actions(dr);
		
		action.dragAndDrop(dragMeToMyTargetElement, dropHereElement).perform();

	}

}
