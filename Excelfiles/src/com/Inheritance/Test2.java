package com.Inheritance;

public class Test2 extends Test1 {
	
	public void method3(int f,int g)
	{
		int h;
		h=f*g;
		System.out.println("multiplication of f and g:"+h);
	}
	void method4()
	{
		int l=50;
		int k=10;
		int j;
		j=l/k;
		System.out.println("division of l and k is:"+j);
	}
	protected void method5(int f,int g)
	{
		int h;
		h=f-g;
		System.out.println("subtraction of f and g is:"+h);
	}

	public static void main(String[] args) {
		Test2 m2=new Test2();
		m2.method3(10,20);
		m2.method4();
		m2.method5(10,20);
		m2.method1();
		/*Test1 m1=new Test1();
		m1.method1();*/
	}
	
	
}
