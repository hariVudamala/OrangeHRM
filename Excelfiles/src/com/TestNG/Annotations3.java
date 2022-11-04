package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3 {
	
	@BeforeMethod
	public void applicationLaunch()
	{
		System.out.println("Gmail application launch successfully");
	}
	@Test(priority=0)
	public void inbox()
	{
		System.out.println("Gmail application inbox functionality test successful");
	}
	@Test(priority=1)
	public void composemail()
	{
		System.out.println("Gmail application composemail functinality test successful");
	}
	@Test(priority=2)
	public void Drafts()
	{
	System.out.println("Gmail application drafts functionality test successful");	
	}
	@AfterMethod
	public void applicationClose()
	{
		System.out.println("Gmail application close successfully");
	}
	
}
