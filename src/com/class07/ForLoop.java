package com.class07;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * I want to say hello 3 times
		 */
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello");
			
		}
		
		System.out.println("-------Print numbers from 1 to 50 ---------------");
		
		for (int a=1; a<=50; a++) {
			System.out.print(a+ " ");
		}
		
		System.out.println();
		System.out.println("-------Print numbers from 10 to 1 ---------------");
		
		for(int b=10; b>=1; b--) {
			System.out.print(b+" ");
		}
		
		System.out.println();
		System.out.println("-------What is my output? We are incrementin by 2 ---------------");
		
		for (int c=0; c<=10; c+=2) {
			System.out.print(c+" ");
		}
		
		
		System.out.println();
		System.out.println("-------What is my output? We are incrementing by 5 ---------------");
		
		for (int d=5; d<=50; d+=5) {
			System.out.print(d+" ");
		}
		
		System.out.println();
		System.out.println("-------What is my output? We are incrementing by 10 ---------------");
		
		for (int e=5; e<=50; e+=10) {
			System.out.print(e+" ");
		}
		
		
		
		
		
		
	}

}
