package com.class04;

import java.util.Scanner;

public class HomeWorkPart2 {

	public static void main(String[] args) {
		
		   
	Scanner money=new Scanner(System.in);
	System.out.println("Do you have a credit card?");
	String answer=money.nextLine();
	
	if (answer.equals("yes")) {
		System.out.println("What is the balance?");
		
		int balance=money.nextInt();
		if(balance>1000) {
			System.out.println("Pay off immediately");
		}else if (balance<1000) {
			System.out.println("You can spend more");
			}
	}else {
		System.out.println("Would you like a credit card?");
	}
		
			
				   
			   

	}

}
