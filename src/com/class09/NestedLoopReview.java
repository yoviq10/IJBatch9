package com.class09;

public class NestedLoopReview {

	public static void main(String[] args) {
		
		
		for(int i=1; i<4; i++) { // outer loop controls loop
			
			for (int j=1; j<5; j++) { //inner loop
				System.out.println("Good Evening");
			}
			System.out.println("------------------------");
		}
			System.out.println("----------------------------");

			for(int i=5; i<7;i++) {
				
					System.out.println("Outer loop");
					
				for(int j=10; j<=12; j++) {
					
					System.out.println("inner loop");
					
				}
			}

			System.out.println("----------------------------");
			
					
			for(int a=1; a<3; a++) {
						
				for(int b=1; b<=4; b++) {
						
						System.out.println(a+" "+b);		
					
				}
			}

			System.out.println("----Print number from 10 to 99 using nested loops------------------------");
		
				for(int c=1; c<10; c++) {
					
					for (int d=0; d<=9; d++) {
						System.out.println(c+" "+d);
					
					}
				}
					
		
			
	}

}
