package com.class06;

import java.util.Scanner;

public class HomeWorkAssignments {

	public static void main(String[] args) {
		
		/*Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks.
		 */
		Scanner input=new Scanner(System.in);
		String country,language;
		
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "japan":
			language="japanese";
			break;
		case "china":
			language="mandarin";
			break;
		case "vietnam":
			language="vietnamese";
			break;
		case "mexico":
			language="spanish";
			break;
		default:
			language="unknown";
			}
		System.out.println("You speak "+ language);
		
		System.out.println("--------HW#2-------------------------");
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */
		char grade;  
		String answer;
		
		System.out.println("Enter your grade");
		grade=input.next().charAt(0);
		
		switch(grade) {
		
		case 'A':
			answer="Excellent";
			break;
		case 'B':
			answer="Good";
			break;
		case 'C':
			answer="Average";
			break;
		case 'D':
			answer="Bad";
			break;
		default:
			answer="Not acceptable";
		}
		System.out.println("Your grade is "+grade+ " and the results are "+ answer);
		
		System.out.println("----------HW#3----------");
		/*
		 * Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user.
		 */
		
		int num1,num2,result = 0;
		char operator;
		 
		System.out.println("Enter first number");
		num1=input.nextInt();
		
		System.out.println("Enter the operator");
		operator=input.next().charAt(0);
		
		System.out.println("Enter second number");
		num2=input.nextInt();
		
		switch (operator) {
		
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("Unknown");
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		


	}

}
