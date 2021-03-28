package com.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean morning=true;
		boolean classToday=true;
		
		// is it morning??
	// if there is a class: ==>yes--->hello classmates
	//otherwise--> likely---> hello my family	
		
		if (morning) {
			System.out.println("let me check if I have class today");
		} if (classToday) {
			System.out.println("Good morning classmates");
		} else {
			System.out.println("Good Morning family");
		}
		
		
		// Example number2
		
	//	boolean morning=false; // cannot go inside if block so nothing prints from if and else but rather line 40
	//	boolean classToday=true;
		
		// is it morning??
	// if there is a class: ==>yes--->hello classmates
	//otherwise--> likely---> hello my family	
		
		if (morning) {
			System.out.println("let me check if I have class today");
		} if (classToday) {
			System.out.println("Good morning classmates");
		} else {
			System.out.println("Good Morning family");
		}
		
		 System.out.println("end of code");
		
		
		 //example #3
		 
		 boolean anyAllergy=true;
		 boolean pollenAllergy=false;
		 
		 if (anyAllergy) {
			 System.out.println("Let's check which allergies you have");
		 } else {
			 System.out.println("You are lucky you don't have any allergies");
		 }
		 
		 //example #4
		 // if it is Friday-->go to the movie
		 //if not--> stay at home & study
		 //if it is Friday,-->then I will check if day is 13, if yes, --> watch scary movie
		 // if no--> watch any movie
		 
		 boolean isFriday=true;
		 int day=13;
		 
		if (isFriday) {
			System.out.println("Go to the movies");
			if (day==13) {
				System.out.println("I'll watch a scary movie");
			} else {
				System.out.println("I'll watch any movie");
			}
			
			
		} else {
			System.out.println("I'll go home and study");
		}
		 
		 //example #5
		/*check assignment, based on the score we will display a message
		 */
		 
		 
		boolean completed=false;
		int score=90;
		
		if(completed) {
			if (score>90) {
				System.out.println("Great job");
			} else if (score >80) {
				System.out.println("Good job");
			} else if (score>70) {
				System.out.println("good, but do better");
			} else {
				System.out.println("study more!!!");
			}
			
		} else {
			System.out.println("please make sure to complete all assignments");
		}
		
		
		//example #5 nested if inside ELSE
		
		boolean evening=false;
		boolean noClassToday=true;
		
		if(evening) {
			System.out.println("let me check if I have class today");
			
		} else {
			if (noClassToday) {
				System.out.println("I will attend class");
				} else {
				System.out.println("I will relax");
			}
			
			
		}	
		
		
	}
}
