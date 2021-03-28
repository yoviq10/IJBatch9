package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
		/*
		 * We play lottery and we will have a magic number which is 17
		 * We need to keep asking user to enter any number from 1 to 100
		 * UNTIL correct number is entered
		 */
		
		Scanner input=new Scanner(System.in);
		int num;
		int lotteryNumber=17;
		
		
		do {
			System.out.println("Please enter any number from 1 to 100 to win the lottery");
			num=input.nextInt();
		}while(num!=lotteryNumber);

		System.out.println("Congratulations, you entered "+ num+" which is a lucky number");
		
		
		
	}

}
