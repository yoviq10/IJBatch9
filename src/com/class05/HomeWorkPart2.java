package com.class05;

import java.util.Scanner;

public class HomeWorkPart2 {

	public static void main(String[] args) {
		
	
		//Write a program to find largest of three double values using if-else..if 
		//and logical operators provided by a user
		//(numbers must be distinct/different)
		
		Scanner scan=new Scanner(System.in);

		double num1,num2,num3;
		
		System.out.println("Enter first number");
		num1=scan.nextDouble();
		
		System.out.println("Enter second number");
		num2=scan.nextDouble();
		
		System.out.println("Enter third number");
		num3=scan.nextDouble();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the largest number");
			
		} else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest number");
			
		} else if(num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest number");
		}
		
		
		
	}

}
