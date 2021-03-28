package com.class07;

import java.util.Scanner;

public class ScannerWithLoop {

	public static void main(String[] args) {
		
		System.out.println("------Scanner Way-----------------");
		/*I want to capture 5 different names and say hello 5 times
		 * 
		 */
		
		
		Scanner scan;
		String name;
		
		scan= new Scanner(System.in);
		
		
		int q=5;
		
		while(q<10) {
			
			System.out.println("Please enter your name");
			name=scan.nextLine();
		
			System.out.println("Hello "+ name);
		
			q++;
		}
		
		
		int num1=1;

		while(num1<=3){
		  System.out.println(num1);
		  num1++;
		}
		
		
		
		

	}

}
