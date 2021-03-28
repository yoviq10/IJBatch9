package com.class07;

public class InClassTaskForLoops {

	public static void main(String[] args) {
		
		
		//Print numbers from 1 to 100 in 1 line with space
		
		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		
		//Print numbers from 100 to 1
		System.out.println();
		System.out.println("---------Task #2 Print numbers from 100 to 1-----------------");
		
		for (int a=100; a>=1; a--) {
			System.out.print(a+" ");
		}
		
		//Task #3
				System.out.println();
				System.out.println("---------Task #3 Print Even numbers between 20 and 1 (2 ways)-----------------");
				
		for (int a=20; a>=1; a-=2) {
			System.out.print(a+" ");
		}
				
		System.out.println();
		System.out.println("-------2nd way--------");		
		//2nd way
		for (int a=20; a>=1; a-=2) {
				if (a % 2==0) {
					System.out.print(a+" ");
				}
		}
		
		//task #4
					System.out.println();
					System.out.println("--------- Task #4 Print odd numbers between 20 and 50 (2 ways)-----------------");
		
		for (int a=21; a<=50; a+=2) {
				System.out.print(a+" ");
					}
		System.out.println();
		System.out.println("-------2nd way--------");
		
		
		//2nd way
		for (int a=20; a<=50; a++) {
			if (a % 2==1) {
			System.out.print(a+" ");
		}
	}
		
		
		
		

	}

}
