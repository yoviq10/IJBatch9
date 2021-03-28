package com.class14;

public class TaskMethod {

	/*
	 * Create a method that will say Hello in different languages 
	 * based on the country that will passed when method is executed.
	 * 
	 */
	
	
	void languages(String country) {
		
		if(country.equals("Usa")) {
			System.out.println("Hello");
		}else if(country.equals("france")) {
			System.out.println("bonjour");
		}else if(country.equals("japan")) {
			System.out.println("konichiwa");
		}
		}
		
	/*
	 * Write a method to return whether given number is prime or not?
	 */
	
	boolean isPrime;
	
	boolean givenNumberIsPrime(int num1) {
		if(num1>1) {
			for (int i=2; i<=num1; i++) {
				if(num1%2==0) {
					isPrime=true;
				}else {
					isPrime=false;
				}
			}
			
		}
		return isPrime;
		}
	
	

	
	/*
	 * Create  class Student that will have a method getGrade.
	 *  Your method should accept the score of a student and return a grade:
	 *	score > 90 - A
	 *	score >80 - B
	 *	score >70 - C
	 *	score > 50 - D
	 *	anything else - F 
	 */
	
	char student(int grade){
		if(grade>90) {
			return 'A';
		}else if(grade>80) {
			return 'B';
		}else if(grade>70) {
			return 'C';
		}else if(grade>50) {
			return 'D';
		}else {
			return 'F';
		}
		
	}
	
	
	
}
