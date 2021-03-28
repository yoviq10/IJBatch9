package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*
		 * We need to make user to pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * If user gives more than >3, -->please give less money
		 * if user gives less than <3, -->please give more money
		 * 
		 */
		System.out.println("-------Do while Loop------");
		
		Scanner input=new Scanner(System.in);
		int money;
		
		System.out.println("Please pay for soda");
		
		do {
			
			money=input.nextInt();
			
			if(money<3) {
				System.out.println("Please give more money");
			}else if (money>3) {
				System.out.println("Please give less money");
			}
			
		}while (money!=3);
		
			System.out.println("Thank you, enjoy your drink");
		
		
		System.out.println();
		System.out.println("-----While Loop-----");
		
		
		System.out.println("Please pay for your soda");
		money=input.nextInt();
		
		while (money!=3) {
			if (money<3) {
				System.out.println("Please give more money");
			}else if(money>3) {
				System.out.println("Please give less money");
			}
			
			money=input.nextInt();
			
		}
		
		System.out.println("Thank you for your purchase!");
		
		
		
		
		
		
		

	}

}
