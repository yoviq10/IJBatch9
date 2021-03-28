package com.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter birth month");
		String month=input.next();
		
		String season = null;
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")) {
			season="Winter";
			
		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season="Spring"; 
				
			}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
				season="Summer";
			}else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
				season="Fall";
			}else {
				System.out.println("Invalid month");
			}
		
		System.out.println("You were born in the season "+ season);
		
		
	}

}
