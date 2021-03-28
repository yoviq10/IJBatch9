package com.class01;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		/*
		 * Byte - datatype -->what kind of values  we are going to store
		 * Box1 - name of the Variable--> label of the box
		 * 10 - Value that we assign to that variable --> Values that we put inside the box
		 * 
		 * \\we are storing whole number Values
		 */
		byte box1=10; //stores numbers from 127 and below
		
		short box2=100; //stores numbers from -32768 to 32767
		
		int box3=1000; // stores numbers from -2147483648 to 2147483647 the most popular & used when it comes to numbers
		
		long box4=100000; // The second popular one- you need to mark it with a letter L at the end of the number example: 1000000L (upper or lower case L)
		
		
		
		//We are storing floating numbers
		float f=12.99f; // 10 divided by 3 = 3.00000   can only hold up to 5-6 decimal places
		double d=12.95; // 10/3= 3.00000000000000000 can store up to 14-15 after decimal (the most popular one)
		
		
		//We are storing single character values
		
		char a='$';
		char b='A';
		char c='1';
		
		
		//Store boolean Values
		
		boolean variable1=true;
		boolean variable2=false;
		
		//I would like to store value 99  store under Int
		int number=99;
		
		//examples how to use the different variables
		System.out.println(d);
		System.out.println(a);
		
		
		//System.out.print(bool);// program gives error because variable is not created at the current moment
		//boolean bool=true; //program executes from top to bottom
	
		System.out.println(variable1); //True
		System.out.println("variable1");// variable1
		
		
		
	}

}
