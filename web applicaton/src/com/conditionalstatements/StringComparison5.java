package com.conditionalstatements;

public class StringComparison5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String a="liveTech Technologies";
   String b="selenium";
   String c="Tech";
   String d="liveTech technologies";
   
   if(a.equals(d))
   {
	   System.out.println("both are equal");
   }
   else
   {
	   System.out.println("both are not equal");
	   
   }
   if(a.equalsIgnoreCase(d))
   {
	   System.out.println("both are equal when casesensitive ignored");
	   
   }
   else
   {
	   System.out.println("both are not equal when case sensitive iqnored");
	   
   }
   if(a.contains(c))
   {
	   System.out.println("c in a");
	   
   }
   else
   {
	   System.out.println("c not in a");
   }
	}

}
