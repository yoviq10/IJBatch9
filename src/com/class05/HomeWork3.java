package com.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		

		//Write a program to find largest number among three numbers using nested if provided by a user
		//(numbers must be distinct)
		
		Scanner input=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Enter first number");
		a=input.nextInt();
		
		System.out.println("Enter second number");
		b=input.nextInt();
		
		System.out.println("Enter third number");
		c=input.nextInt();
		
	if (a>b) {
		
		if (a>c) {
			System.out.println(a+" is the largest");
		}
		
	}else if (b>a) {
		
		if (b>c) {
			System.out.println(b+" is the largest");
		}
	}else {
			System.out.println(c+" is the largest");
		
	}
		
	
		
		
		
		
		
		
		
	}
		
	}

