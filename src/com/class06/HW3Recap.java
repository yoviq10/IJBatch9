package com.class06;

import java.util.Scanner;

public class HW3Recap {

	public static void main(String[] args) {
		
		//Write a program to find largest number among three numbers using nested if provided by a user
		//(numbers must be distinct)
		
		Scanner input=new Scanner(System.in);
		
		int num1,num2,num3,largest;
		
		System.out.println("Please Enter 3 numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
	if (num1>num2) { //we assume number 1 is bigger than number 2
		
		if (num1>num3) {
			largest=num1;
		}else {
			largest=num3;
		}
		
	}else { //assuming number 2 is bigger than number 1
		
		if(num2>num3) {
			largest=num2;
		}else {
			largest=num3;
			}
		}
	
	System.out.println("The largest number amongst "+num1+", "+ num2+", "+num3+", is "+ largest);
		

	}

}
