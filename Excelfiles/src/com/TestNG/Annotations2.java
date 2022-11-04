package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void apllicationLaunch()
	{
		System.out.println("Gmail application launch successfuly");
	}
	@Test(priority=1)
	public void inbox()
	{
		System.out.println("Gmail application inbox functionality Test successful");
	}
	@Test(priority=0)
	public void composemail()
	{
		System.out.println("Gmail application composemail functionality test successful");
	}
	@Test (priority=2)
	public void drafts()
	{
		System.out.println("Gmail applicatin drafts functionality test successful");
	}
	@AfterTest 
	public void applicationClose()
	{
		System.out.println("Gmail application close successful ");
	}
	
	
	
}
