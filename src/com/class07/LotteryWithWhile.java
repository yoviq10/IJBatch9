package com.class07;

import java.util.Scanner;

public class LotteryWithWhile {

	public static void main(String[] args) {
		
		
		
System.out.println("-----------------Lottery With While--------------------------");
		

		Scanner input=new Scanner(System.in);
		
		int num; 
		int lotNumber=17;
		
		System.out.println("Please enter any number from 1 to 100 to win the lottery");
		num=input.nextInt();
		
		while(num !=lotNumber) {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}
		System.out.println("Congratulations, you entered "+ num+" which is a lucky number");
		
		// When we DON'T know in advance how many times we would like to repeat block
		//of code, we go for WHILE or Do WHILE loops
		
		
	/*When we KNOW in advance how many times we would like to repeat block
		//of code, we use FOR loops
	 * 
	 */
		
		
		
		
		
		

	}

}
