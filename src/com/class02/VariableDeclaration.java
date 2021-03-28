package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		// 1 way to create a variable
		
		short b=200; //created a variable of short and assigned value
					 // decalre a variable and initialized
		
		
		//2 (second) way this is if you don;t know what the value is so you use the word SUM temporary. 
		
		int sum; // Declaration of the variable ONLY happens ONCE
		sum=20; // initialed the variable 
		
		sum=30; // reassigned the value
		
         //
		int x,y,z; // declaring a variables (a shortcut instead of retypying all 3 
		
		/*
		 * int x;
		 * int y;
		 * int z;
		 * 
		 */
		
	        x=10; // when giving the value, make sure you STORE ONLY int types of value
			y=20;
			z=25;
			
			
			// If I would like to change the value of x, now it will read the output of 70 instead of 10
			x=70;
			
			System.out.println(x); // when you run the program, it should give you 70 (top to bottom)
			
			
			// we are using value of different variable to initialize the 
			int num=33;//
			int num2=num;// variable will be 33 since you already assigned num=33 above
			System.out.println(num2);
			// should have run and print as 33
	}
	
	

}
