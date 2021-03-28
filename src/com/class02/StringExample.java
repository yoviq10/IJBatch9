package com.class02;

public class StringExample {

	public static void main(String[] args) {
		
		//Example #1
		String name; 
		name="Yovanna";

		//Exampled #2
		String greeting= "Good Morning";
        
		// Example #3
		String phonenumber="123456789";
		
		//Example #4
		String stringNumber="12";
		
		//Example #5
		String space=" ";
		
		//Example #6
		String letter="A";
		//string letter2="A "; >>> The space matters after in between the quotes
		char oneLetter='A';
		
		//Hello, my name is Yovanna
		System.out.println("Hello my name is " + name);
		
		//Exampple: Hoaw are you Yovanna?
		System.out.println("How are you " + name);  //do not put quotation marks under name or it will print name
		
		//Example #7
		int age=25;
		// I am 25
		
		System.out.println("I am "+age);
		
		//Example #8
		char grade='A';
		//Yovanna is A student
		System.out.println(name + " is " + grade + " student");
		
		/*
		 * String concatenation operator  + can be used when:
		 * We attachString to another String
		 * When we attach String to a number
		 * When we attach String to any character or boolean
		 *  
		 */
		
		//Example #9
		String car="Skyline";
		int year=1999;
		
		// I drive 1999 skyline
		System.out.println("I drive "+ year + " " + car);
		
		//Example #10
		String computer="windows";
		int memory=250;  // do not add quotes or it will pick up as string
		
		//Yovanna has windows with 259 GB memory
		System.out.println(name + " has "  + computer + " " + "with " + memory + " GB memory" );
		
		
		String CombinedValue = year + " " +car;// 1999 (space) Skyline
		//System.out.println(combinedValue);
		
		//Example #11
		byte day=7;
				String month="February ";
		String date=month+day;
		System.out.println(date);
		
		
		
		
	}
	

}
