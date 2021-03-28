package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		
		
		for (int i=1; i<=10; i++) {
			System.out.println("Hello");
			
			if(i==2) {
				continue;   //Keyword inside if statement
			}
			
			System.out.println("I am inside the loop");
			
		}
		
		System.out.println("---------------------------");
		/*
		 * You need to print all number from 1 to 10, except 5&6
		 * 
		 */
		
		for(int i=1; i<=10; i++) {
			
			if(i==5 || i==6) {
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		
		System.out.println();
		System.out.println("---------------------------");
		/*
		 * You need to print numbers from 1 to 40, except those that are divisible by 4
		 */
		
		
		for(int i=1; i<=40; i++) {
			
			if(i%4==0 ) {     // skipping #s, 4, 8, 12, ect..
				continue;
			}
			
			System.out.print(i+" ");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
