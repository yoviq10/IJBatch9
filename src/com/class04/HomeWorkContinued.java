package com.class04;

import java.util.Scanner;

public class HomeWorkContinued {
	public static void main(String[] args) {
		
		Scanner hours=new Scanner(System.in);
		System.out.println("Enter number of years worked");
		int years=hours.nextInt();
		
		if(years>=5) {
			System.out.println("User is eligble for bonus");
			
			System.out.println("Enter annual salary");
			int salary=hours.nextInt();
			
			if (salary>50000) {
				System.out.println("bonus=5000");
			}else {
				System.out.println("bonus=3000");
			}
			
		}else {
			System.out.println("You are not eligible");
		}
		
		
		
		
	
		
		

	}

}
