package com.methods;

public class MethodExample3 {
	public void division()
	{
		
	
	int k=50;
	int i=2;
	int m;
	m=k/i;
	System.out.println("the division of two numbers is:"+m);
	}
	
		

	public static void main(String[] args) {
		MethodExample3 m3=new MethodExample3();
		m3.division();
		MethodExample2 m2=new MethodExample2();
		m2.division(100,10);
		m2.subtraction(12,2);
		
	}
	
	
	
	
	

}
