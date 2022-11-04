package com.Inheritance;

public class Test3 extends Test2 {
	public void method6()
	{
		System.out.println("method6 is executed");
		
	}
	void method7()
	{
		System.out.println("method7 is executed");
	}
	private void method8()
	{
		System.out.println("method8 is executed"); 
		
	}
	public static void main(String[] args) {
		  
		Test3 m3=new Test3();
		m3.method1();
		m3.method3(100,200);
		m3.method4();
		m3.method5(10,20);
		m3.method6();
		m3.method7();
		m3.method8();
	
		
	}
	

}
