package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	@Test(priority=1)
	public void applicationLaunch()
	{
		System.out.println("Gmail application Launch successfully");
	}
	@Test(priority=2)
	public void inbox()
	{
		System.out.println("Gmail application inbox functionality Test successful");
	}
	@Test(priority=3)
	public void composemail()
	{
		System.out.println("Gmail application composemail functionality Test successful");
	}
	@Test(enabled=false)
	public void Drafts()
	{
		System.out.println("Gmail application drafts functionality Test successful");
	}
	
}
