package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		
		
		
		int time=11;
			
	if (time<12) {
		System.out.println("Hello"); //Code executes 1 time
	}
		
	System.out.println("--------WHILE LOOP-------");
	
	while (time<12) {   
		System.out.println("Hello"); // code runs FOREVER, does not stop..works the same way as an if statement
		time++; //Incrementing by 1, now = 12, now condition is FALSE, you cannot go inside while loop
	}
		
		System.out.println("--------Print numbers from 1 to 10");
		
		int num=1;
		
		while(num<11) {
			System.out.print(num+" ");
			num++;
		}
	
		System.out.println();
		System.out.println("--------Print numbers from 20 to 40");
	
		int num1=20;
		
		while(num1<=40) {
			System.out.print(num1+" ");
			num1++;
		}
		
		System.out.println();
		System.out.println("--------Print numbers from 10 to 1");
		
		int a=10;
		
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}
		
		
		
		

	}

}
