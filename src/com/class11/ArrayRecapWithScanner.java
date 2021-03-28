package com.class11;

import java.util.Scanner;

public class ArrayRecapWithScanner {

	public static void main(String[] args) {
		/*
		 * We want to create an array that will store elements from a user
		 * 
		 */

		
		Scanner scan;
		String [] array;   //declared an array-stored big box
		
		
		scan=new Scanner(System.in);
		System.out.println("How many String elements would you like to store?");
		int size=scan.nextInt();
		
		array=new String[size]; // initializing your array
		
		for(int i=0; i<size;i++) {
			
			System.out.println("Please enter a string");
			array[i]=scan.next();
			
		}
		
			System.out.println("-------Lets see what we have stored----");
		
			
			for (String str:array) {
				
				System.out.print(str+" ");
			}
			
			
			
			
			
			
	}

}
