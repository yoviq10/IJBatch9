package com.class12;

public class Task6 {

	public static void main(String[] args) {
		
		//prime number is a positive number that can be divided by 1 and itself
		
		/*
		 * Write a java program to check whether a given number is a prime or not?
		 * 
		 * (go for a loop) 
		 */
		
		
		int num=7;
		boolean prime=true;
		
		if(num>1) {
			
		for(int i=2; i<num;i++) {
			
			if(num%i==0) {
				prime=false;
				break;
			}
			
		 }
		
		}else {
			prime=false;
		}
		
		if(prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
		
		
		
		
		
		
		

	}

}
