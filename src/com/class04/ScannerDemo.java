package com.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in); //shortcut: CTRRL+SHIFT+O
		
		System.out.println("Please enter any text");
		
		String text=scan.nextLine(); //scan.nextline();-->capture your input from console,
									//once you text, you must HIT ENTER
		System.out.println("text that I entered is " +text);
		
		System.out.println("Please enter your name");
		
		String name=scan.next(); //capture only 1 word till space
		System.out.println("Nice to meet you " + name);
		
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println("My name is "+name+ " and I am "+age+ " years old!");
		
		
		

		
		
		
		
	}

}
