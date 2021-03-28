package com.class05;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your height");
		int height=input.nextInt();
		
		if(height<60 ) {
			System.out.println("You are short");
			
		} else if (height>=60 && height<=72) {
			System.out.println("You are medium");
			
		} else if (height>72) {
			System.out.println("You are tall");
	
		}
		
		System.out.println("---------task 2---------");
		//using the && option:
		
		System.out.println("Please enter if it's a day or weekend using 1-7");
		
		
		int day=input.nextInt();
		
		if(day>=1 && day<=5) {
			System.out.println("It's a weekday");
			
		}else if (day>=6 && day<=7) {
			System.out.println("It is a weekend");
			
		}else {
			System.out.println("Invalid day");

		// using the OR option:
			
			if(day==1 || day==2 || day==3 || day==4 || day==5) {
				System.out.println("It's a weekday");
				
			}else if (day==6 || day==7) {
				System.out.println("It is a weekend");
				
			}else {
				System.out.println("Invalid day");
			
			}
		
		
		
		}
		
	}

	
}
