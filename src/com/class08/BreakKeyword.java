package com.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		
		boolean rain=true;
		int temp=60;
		
		
		while (rain) {
			
			System.out.println("I'll stay home");
			
			if(temp>75) {
				
				System.out.println("I will walk outside");
				break;
			}
			
			temp+=2;
			
		}

		System.out.println("-----------------------------");
		//INSIDE FOR LOOP
		
		for (int i=1; i<=10; i++) {
			System.out.println("Hello");
			
			if(1==5) {
				break;   //Keyword inside if statement
			}
			
			System.out.println("I am inside the loop");
			
		}
		
		
		
		
	}

}
