package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
		/*
		 * Store gender using M or F
		 * based on the gender, we will specify
		 * if M-->Male
		 * if F--> Female
		 * otherwise-->not sure
		 */
		
		char gender='F';  //gender is variable
		String description;
		
		switch(gender) {
		
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="Not appplicable";
		}
		
		System.out.println(description);
		
		//SWITCH can work with: byte,short,char,int,and String
		
		/*
		 * Limitations:
		 * Switch cannot use RELATIONAL OR LOGICAL OPERATORS(it simply checks for value/equality 
		 * Switch CANNOT be used with boolean, double,float,long,
		 * Does not work with all cases
		 */
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I am happy");
		}
		
	//^^switch (sunny) { //^^cannot work with boolean or double type of values
		}
		
	

}
