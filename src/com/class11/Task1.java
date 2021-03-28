package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * create an array on double values using scanner
		 * calculate the sum of all stored elements in that array
		 */

		Scanner scan;
		double sum=0;   //declared an array-stored big box
		int size;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter size of array");
		size=scan.nextInt();
		
		double[] array=new double [size]; // initializing your array
		
		for(int i=0; i<size;i++) {
			
			System.out.println("Please enter a double value");
			array[i]=scan.nextDouble();
			sum+=array[i];
		}
		
		
		System.out.println("The sum of "+size+" elements from an array is= "+sum);
		
		
		System.out.println("-----Calculating sum using for each loop--------");
		
		sum=0;
		for(double num:array) {
			sum+=num;
		}
		
		System.out.println("The sum of "+size+" elements from an array is= "+sum);
		
		
		
		
		
		
	}

}
