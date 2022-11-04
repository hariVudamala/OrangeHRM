package com.conditionalstatements;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="hari";
    String b="giri";
    String c="pori";
    if(a=="hAri")  
    {
    	if(b=="Giri")
    	{
    		//String data type comparison is case sensitive means upper case and lower case letters   		//space should be same in string comparison
    		if(c=="pori")
    		{
    			System.out.println("hello every one");
    		}
    	}
    }
    else
    {
    	System.out.println("good morning every one");
    }
    		
	}

}
