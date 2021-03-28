package com.class04;

public class InClassTask {

	public static void main(String[] args) {
		
		//1.)
		boolean diploma=true;
		double gpa=3.5;
		
		if (diploma) {
			System.out.println("Congratulations");
		   if  (gpa>=3.5) {
			   System.out.println("You are eligible for scholarship");
		   } else {
			   System.out.println("You should have studied harder");
		   } 
	
		} else {
			System.out.println("Get a degree");
		}
		
		//2.)
		
		System.out.println("------------------");
		double mortageRate=4.2;
		int mortagePrice=1000;
		
		if (mortageRate>4.5) {
			System.out.println("User will not buy a house");
		} else  {
			System.out.println("Will consider buying a house");
			   if (mortagePrice>2000000) {
				System.out.println("Will take out a loan");
			} else {
				System.out.println("will pay cash");
			}
		
		
			   
			   System.out.println("----------------");
		// NESTED if  last example:
		/*to donate, you must be 18 and older, otherwise you can't 
		 * your weight, must be more than 110lbs, otherwise you cannot donate 
		 */
		
			   int age=29;
			   int weight=150;
			   
			   if(age>=18) {
				   System.out.println("You can donate since you are older than 18");
				   if (weight>110) {
					   System.out.println("Your weight passed, you can also donate");
				   } else {
					   System.out.println("your weight is too small, cannot donate");
				   }
				   
				   
			   } else {
				   System.out.println("You cannot donate");
			   }
		
			   
			   
			   
			   
			   
		

		
		}	
		
		

	}

}
