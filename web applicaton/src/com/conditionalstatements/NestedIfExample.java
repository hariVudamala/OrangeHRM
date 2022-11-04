package com.conditionalstatements;

public class NestedIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=40;
		int c=60;
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
			if(b>c)
			{
			System.out.println("b is greater than c");
			
			}
			else
				if(a>b)
				{
					System.out.println("a is greater than c");
					
				}
				else
				{
					System.out.println("a is lesstan b and c");
				}
					}

}
