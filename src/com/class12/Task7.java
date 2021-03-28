package com.class12;

public class Task7 {

	public static void main(String[] args) {
		/*
		 * Write a java program to print the first 10 numbers of fibonachi
		 * fibonachi series is a sum of 2 previous numbers
		 * used in Agile> user stories (requirements that we get from clients)
		 */
		
		//Preferable way
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=1; i<=10;i++) {
			
			System.out.print(a+" ");   // <this has to be inside to print out 0       used 4 lines
			
			c=a+b;   //0+1 --->1+1=2
			a=b;	//
			b=c;	//

			
		}
		
		System.out.println("-------Another way-----");
		
		
		int f1=0;
		int f2=1;
		
			for(int f=1;f<=10;f++) {
				
				System.out.print(f1+" ");  //3 lines of code
				f1=f1+f2;
				f2=f1-f2;		
				
				
				
			}
		}
		
		
		
		
		
		
		

	

}
