package com.Inheritance;

public class Test1 {
	
	public void method1()
	{
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("sum of a and b is:"+c);
	}
	private void method2()
	{
		int m=40;
		int n=50;
		int o;
		o=n-m;
		System.out.println("difference of m and n is:"+o);
	}
	public static void main(String[] args) {
	 Test1 m1=new Test1();
	 m1.method1();
	 m1.method2();
	 
	 
	}

}
