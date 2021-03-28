package com.class09;

public class Patterns {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=4;i++) { //ROWS
			
			for(int c=1; c<=5; c++) { //COLUMNS
				
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("-----BIG SQUARE------");
		
		
		for(int i=1; i<=6;i++) { //ROWS
			
			for(int c=1; c<=8; c++) { //COLUMNS
				
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("-----Rows with #'s Square------");
		
		for(int i=1; i<=4;i++) { //ROWS
			
			for(int c=1; c<=5; c++) {  //columns
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		

		System.out.println("--Reverse numbers Square---------");
		
		
		for(int i=5; i>=1;i--) { //ROWS
			
			for(int c=6; c>=1; c--) {  //columns
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println("--Reverse numbers Square Another Way---------");
		
		for(int i=1; i<=5;i++) { //ROWS
			
			for(int c=6; c>=1; c--) {  //columns
				
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	System.out.println("--1111-22222-3333-444-555 numbers Square ---------");
		
		for(int i=1; i<=5;i++) { //ROWS
		
			for(int c=1; c<=5; c++) {  //columns
			
				System.out.print(i+" ");// to print rows, for repetitive 
		}
			System.out.println();
	}
	
		System.out.println("----------Triangle---in class task-----------------");
		
		for(int r=1; r<=5;r++) { //ROWS
			
			for(int c=1; c<=r; c++) {  //columns, the r defined the shape
			
				System.out.print(" * "); 
		}
			System.out.println();
	}
	
		System.out.println("--------Different shape triangle----------");
		
		for(int a=1; a<=5;a++) {
			for(int b=5; b>=a; b--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
