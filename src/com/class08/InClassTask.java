package com.class08;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		
		//Print numbers from 1 to 50 except those that are divisible by 3

		
		for(int i=1; i<=50; i++) {
			
			if(i%3==0 ) {     // skipping #s, 3, 6, 9, ect..
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----Task#2--------");
		
		/*
		 * Create a program that will keep asking user to apply for a credit card.
		 *  As soon you get “yes” from a user program should stop asking.
		 */
		
		
		Scanner input=new Scanner(System.in);
		String answer;
			
	    do {
	      	 System.out.println("Please apply for a credit card");
	      	 answer=input.nextLine(); }
	    while (!answer.equalsIgnoreCase("yes"));
	  		System.out.println("Okay, no more question");
		
			
		System.out.println();
		System.out.println("---Another way-----");
			
		
	
		
		
		

		
			
			
		
		
		
		
		

	}

}
