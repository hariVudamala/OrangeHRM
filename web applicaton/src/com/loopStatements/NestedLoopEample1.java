package com.loopStatements;

public class NestedLoopEample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int n=1;n<=5;n++)
		{
			for(int k=5;k>n;k--)
			{
				System.out.println(n+"testing");
			}
		}
		
		for(int i=5;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.println(i+"live");
			}
		}
	}

}
