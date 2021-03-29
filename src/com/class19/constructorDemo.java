package com.class19;

import java.util.Scanner;

public class constructorDemo {

	constructorDemo(){
		System.out.println("constructor called");
	}

	int returnNumber(){
		return 10;
	}
	
	
	public static void main(String[] args) {
	
	constructorDemo obj=new constructorDemo();
	int var1= obj.returnNumber();
		Scanner scanner=new Scanner(System.in);
		
		

	}

}
