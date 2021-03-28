package com.class06;

import java.util.Scanner;

public class ReviewClassSwitchStatemenThursday {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		char operations;
		int num1,num2;
		
		System.out.println("ENTER your first number");
		num1=input.nextInt();
		
		System.out.println("Enter your second number");
		num2=input.nextInt();
		
		System.out.println("Enter the operations");
		operations=input.next().charAt(0);
		
		if(operations=='+') {
			System.out.println(num1+num2);
		}else if(operations=='-') {
			System.out.println(num1-num2);
		}else {
			System.out.println("unknown");
		}
		
		//The Switch way:
		
		switch(operations) {
		
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		default:
			System.out.println("Unknown");
		}
		
		
		
		

	}

}
