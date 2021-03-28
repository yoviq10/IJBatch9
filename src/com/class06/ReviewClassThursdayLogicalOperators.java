package com.class06;

public class ReviewClassThursdayLogicalOperators {

	public static void main(String[] args) {
		
		
		String day="Sunday";
		
		if("Sunday".equals(day)) {
			System.out.println("Relax it's the weekend, don't blink otherwise");
		}else if (day.equals("Saturday")) {
			System.out.println("Relax its the weekend, don't blink ottherwise");
		}else {
			System.out.println("I have to go to work");
		}
		
		// using logical operators..same thing as above, but with less code/typing
		
		if("Sunday".equals(day) || day.equals("Saturday")){
			System.out.println("Relax it's the weekend, don't blink ottherwise");
		}else {
			System.out.println("I have to go to work");
		}
		
	System.out.println("-------review------------------");
	
	
	int number=10;
	
	
	if(number>=0) {
		if(number<=100) {
			System.out.println("0 to 100");
		}
	} else {
		System.out.println("Out of Range");
		
	// same thing as above, but with logical operators
		
		if(number>=0 && number<=100) {
			System.out.println("0 to 100");
		}else {
			System.out.println("Out of Range");
		}
		
	}
	
		
	
	
	
	
		
		
		
		
		

	}

}
