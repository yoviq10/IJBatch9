package com.class02;

public class NamingConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//keywords - a special word that has reserved in java memory: Class, Public, Static, Final, For
		
		//Identifiers - name that we give to classes, variable and methods
		
		/*
		 * RULE!!
		 * DO NOT USE KEYWORD AS IDENTIFIERS
		 * Identifiers CAN NOT contain space >>> EXAMPLE: byte variable one=12;  correct format should be like this: byte variableone=12;
		 * Identifiers CAN NOT start with numbers>>> EXAMPLE: short 1b=12; correct format should be like this: short b1=12;
		 * Identifiers CAN NOT have special charahcters: _ or $ EXAMPLE: long *=2000 or long l*=2000;  the correct format should be like this: long _l=2000;
		 * or long_20000; or double $price=12.99; or double price$=10.99;
		 */

		
		//int final=10; you will get an error/invalid Identifier message if you use this with the keyword
		
		// Naming Convention 
			//1. we use camel casing
			//2. Classes starts with Upper cases and will follow camel casing
		    //3. VARIABLES start with lower case and will follow with camel casing
		 	//4. packages we use lower case and use name as reverse way of URL
		    //5. Use meaningful name for your variables  EXAMPLE: boolean isSnow=true; or booleansnow=true
		
		
		int Number=12; //try not to use upper case names
		int num=12;// more preferable
		
	//	int numberOne-12;
		int numberTwo=13;
		
		
		
	}

}
