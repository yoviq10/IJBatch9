package com.class09;

public class HWpatterns {

	public static void main(String[] args) {
		
		System.out.println("------HW #1------");
		//Print the following pattern:	
		//55555
		//44444
		//33333
		//22222
		//11111 
		
		for(int i=5; i>=1;i--) { //ROWS
			
			for(int c=1; c<=5; c++) {  //columns
			
				System.out.print(i);// to print rows, for repetitive 
		}
			System.out.println();
	}
		
		
		
		System.out.println("------HW #2------");
		
		//Print the following pattern:
		//7654321
		//7654321
		//7654321
		//7654321
		//7654321

		for(int i=5; i>=1;i--) { //ROWS
			
			for(int c=7; c>=1; c--) {  //columns
			
				System.out.print(c);// to print rows, for repetitive 
		}
			System.out.println();
	}
		
		
		
		

	}

}
