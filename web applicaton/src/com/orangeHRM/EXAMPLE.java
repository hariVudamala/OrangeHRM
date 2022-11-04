package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EXAMPLE {

		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		dr=new ChromeDriver();
		dr.manage().window().maximize();
		Thread.sleep(10000);
		dr.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
		
		
		WebElement loginpanelElement=dr.findElement(By.id("logInPanelHeading"));
		String actualText=loginpanelElement.getText();
		System.out.println("actual text of login page:"+actualText);
		String expectedText="LOGIN Panel";
		System.out.println("expected text of login page:"+expectedText);
		if(actualText.equals(expectedText))
		{
			System.out.println("login panel text is matched-pass");
		}
		else
		{
			System.out.println("login panel text not matched-fail");
		}
		
		
		dr.findElement(By.id("txtUsername")).sendKeys("harikrishna");
		dr.findElement(By.id("txtPassword")).sendKeys("a13m1@GOD");
		dr.findElement(By.id("btnLogin")).click();
		
	    WebElement AdminElement=dr.findElement(By.id("menu_admin_viewAdminModule"));
	    String actualTextOfAdmin=AdminElement.getText();
	    System.out.println("actual text of admin:"+actualTextOfAdmin);
	    String expectedTextOfAdmin="Admin";
	    System.out.println("expected text of admin:"+expectedTextOfAdmin);
	    if(actualTextOfAdmin.equals(expectedTextOfAdmin))
	    {
			 System.out.println("Admin text is matched-pass");
	    }
	    else
	    {
	    	System.out.println("Admin text is not matched-fail");
	    }
		 
		 
	    dr.findElement(By.id("menu_pim_viewPimModule")).click();
	    dr.findElement(By.linkText("Add Employee")).click();
		 
		 //<h1>Add Employee</h1>
		 
	    WebElement AddEmployeeElement=dr.findElement(By.xpath("//*[text()='Add Employee']"));
	    String actualAddemployeeText=AddEmployeeElement.getText();
	    System.out.println("actual add employee text:"+actualAddemployeeText);
	    String  expectedAddEmpioyeetext="Add Employee";
	    System.out.println(expectedAddEmpioyeetext);
	    if(actualAddemployeeText.equals(expectedAddEmpioyeetext))
	    {
			 System.out.println("add empolyee text is matched-pass");
	    }
	    else
	    {
			 System.out.println("add empolyee tet is not matched-fail");
	    }
	    
	    
	    // <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0069" id="employeeId">
		WebElement employeeIdvalue=dr.findElement(By.id("employeeId"));
		String expectedEmployeeId=employeeIdvalue.getAttribute("value");
		
		
		dr.findElement(By.id("firstName")).sendKeys("Hari");
		dr.findElement(By.id("middleName")).sendKeys("Krishna");
		dr.findElement(By.id("lastName")).sendKeys("Vudamala");
		dr.findElement(By.id("btnSave")).click();
		
		 
		WebElement personalDetailsElement=dr.findElement(By.xpath("//*[text()='Personal Details']"));
		String actualpersonalDetailstext=personalDetailsElement.getText();
		System.out.println("actual text of personal details:"+actualpersonalDetailstext);
		String expectedTextOfPersonalDetails="Personal Details";
		if( actualpersonalDetailstext.equals(expectedTextOfPersonalDetails))
		{
			System.out.println("personal details text is matched-pass");
		}
		else
		{
		System.out.println("not matched-fail");
		}
		
	
		//<input value="Hari" type="text" name="personal[txtEmpFirstName]" class="block default editable"
			//maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
	
		WebElement firstNameElement=dr.findElement(By.id("personal_txtEmpFirstName"));
		String firstnameAttributeValue=firstNameElement.getAttribute("value");
		System.out.println("actual first name;"+firstnameAttributeValue);
		String expectedFirstName="Hari";
		if(firstnameAttributeValue.equals(expectedFirstName))
		{
			System.out.println("first name is matched-pass");
		}
		else
		{
			System.out.println("first name is not matched-fail");
		}
	
		// <input value="Krishna" type="text" name="personal[txtEmpMiddleName]" class="block default editable" 
			//maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
	
		WebElement middleNameElement=dr.findElement(By.id("personal_txtEmpMiddleName"));
		String actualMiddleName=middleNameElement.getAttribute("value");
		System.out.println("actual middle name:"+actualMiddleName);
		String expectedmiddleName="Krishna";
		if( actualMiddleName.equals(expectedmiddleName))
		{
			System.out.println("middle name is matched-pass");
		}
		else
		{
			System.out.println("middle name is not matched- fail");
		}
		//<input value="Vudamala" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30"
			//title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
	
		WebElement lastNameElement=dr.findElement(By.id("personal_txtEmpLastName"));
		String actualLastName=lastNameElement.getAttribute("value");
		System.out.println("actual last name:"+actualLastName);
		String expectedLastName="Vudamala";
		System.out.println("expected last name:"+expectedLastName);
		if(actualLastName.equals(expectedLastName))
		{
			System.out.println("last name is matched-pass");
		}
		else
		{
			System.out.println("last name is not matched-fail");
		}
		
		
		//<input value="0041" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		//<input value="0045" type="text" name="personal[txtEmployeeId]" maxlength="10"
			//	class="editable" id="personal_txtEmployeeId" disabled="disabled">
	
		WebElement EmployeeIdElement=dr.findElement(By.name("personal[txtEmployeeId]"));
		String actualEmployeeId=EmployeeIdElement.getAttribute("value");
		System.out.println("actual employee id:"+actualEmployeeId); 
		System.out.println("expected employee id is:"+expectedEmployeeId);
		if(actualEmployeeId.equals(expectedEmployeeId))
		{
			System.out.println("employee id is matched-pass ");
		}
		else
		{
			System.out.println("employee id is not matched- fail");
		}
		
		
		WebElement welcomeAdminElemet=dr.findElement(By.id("welcome"));
		welcomeAdminElemet.click();
		Thread.sleep(10000);
	
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		WebElement logoutElement=dr.findElement(By.linkText("Logout"));
		logoutElement.click();
		
		
		WebElement loginpanelElementafterLogOut=dr.findElement(By.id("logInPanelHeading"));
		String loginpanelText=loginpanelElementafterLogOut.getText();
		System.out.println("actualtext:"+loginpanelText);
		String expectedTextofLOgin="LOGIN Panel";
		if(loginpanelText.equals(expectedTextofLOgin))
		{
			System.out.println("login panel text is matched-pass");
		}
		else
		{
			System.out.println("login panel text is not matched-fail");
		}
		dr.quit(); 
}

}
