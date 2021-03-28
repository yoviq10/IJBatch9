package com.class08;

import java.util.Scanner;

public class InClassTaskPart2 {

	public static void main(String[] args) {
	
		/*
		 * Write a program that reads a range of integers (start and end point), provided by a user 
		 * and then from that range prints the sum of the even and odd integers.
		 */
	
		System.out.println("-----Task #3------");
		
		Scanner input=new Scanner(System.in);
		int start, end;
		
		System.out.println("Please select a starting number");
		start=input.nextInt();
		
		System.out.println("Please select a ending number");
		end=input.nextInt();
		
		int sumOdd=0;
		int sumEven=0;
		
		for(int i=start; i<end; i++) {
			
			if(i%2!=0) {
				sumOdd+=i;
				}else {
				sumEven+=i;
			}
		}
		
		System.out.println("Sum of odd numbers from range "+ start+" to "+end+" is = "+sumOdd);
		System.out.println("Sum of Even numbers from range "+ start+" to "+end+" is = "+sumEven);
			
			
			
		
		
		
		

	}

}
