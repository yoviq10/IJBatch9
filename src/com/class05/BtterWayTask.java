package com.class05;

import java.util.Scanner;

public class BtterWayTask {

	public static void main(String[] args) {
		
		// CODE LOOKS CLEANER with the definition:
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your height");
		int height=input.nextInt();
		
		String definition;
		
		if(height<=60 ) {
			definition="You are short";
			} else if (height>60 && height<=72) {
			definition="You are medium";
			} else {
			definition="You are tall";
		}
		
		System.out.println("You are a person who's height is "+ definition);
		
		

	}

}
