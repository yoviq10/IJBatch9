package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		int num=1;
		
		while(num<=5) {    //While loop is used more in programming!
			System.out.println("num");
			num++;	
		}

		System.out.println("----------DO WHILE------------");
		
		int num1=1;
		
		do {
			System.out.println("num1");
			num1++;
			
		}while (num1<=5);
		
		/*
		 * While= First Checks the condition then executes
		 * Do=First executes, then checks condition
		 * Even when the CONDITION IS FALSE, DO will execute at LEAST ONCE
		 */
		
		
		
	}

}
