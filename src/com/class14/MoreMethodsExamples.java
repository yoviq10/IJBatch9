package com.class14;

public class MoreMethodsExamples {

	/*
	 * create a method that does not take any values
	 * and always return String type
	 */
	
	
	String print() {
		return "hi";
		
	}
	
	/*
	 * create a method that takes a number
	 * and returns the double of that number
	 */
	
	
	double doubleTheValue(double input) {
		return input*2;
	}
	
	
	/*
	 * create a method that will take a boolean as input
	 * if the value is true, I want to print "take the umbrella"
	 * and if the value is false, I want to print "please go for a walk"
	 */
	
	
	void isRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}
	
	/*
	 * Write a method to print batch 9 is great 5 times
	 */
	
	
	void print5Times() {
		for(int i=0; i<5;i++) {
			System.out.println("Batch 9 is great");
		}
	}
	
	
	/*
	 * create a method that takes 2 numbers as input and 
	 * return the greater number
	 */
	
	double returnGreater(double num1, double num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	/*
	 * write a method that takes a number if number is even
	 * otherwise print number if odd
	 * 
	 */
	
	
	void printEvenOdd(double num1) {
		if(num1%2==0) {
			System.out.println("even number");
		}else {
			System.out.println("odd number");
		}
	}
	
	/*
	 * write a method that takes an array and returns the 
	 * sum of the elements that are present in the array
	 */
	
	double returnTheArraySum(double [] arr) {  //use same variable-double inside()
		double sum=0;
		for(double element:arr) {
			sum=sum+element;
		}
		return sum;
	}
	
	//INTERVIEW QUESTION:
	
	/*
	 * Write a method that returns true if a string is
	 * a mirror of itself, otherwise it returns as false
	 */
	
	boolean isMirror(String str) {
		String newStr="";
		
		for(int i =str.length()-1;i>=0;i--) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		
		if(str.equals(newStr)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

	
	
	
	
	
	
	
	
}

