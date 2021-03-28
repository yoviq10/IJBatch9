package com.class18;

import java.util.Scanner;

public class AccessModifierTester {

	public static void main(String[] args) {
	
		AccessModifierDemo obj1=new AccessModifierDemo();
		
	//	System.out.println(obj1.bankAccountPassword);//not available due to private
		System.out.println(obj1.name);
		System.out.println(obj1.SSNumber);
		
		Scanner scanner=new Scanner(System.in);
		scanner.next();

	}

}
