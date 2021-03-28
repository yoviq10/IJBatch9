package com.class14;

public class MethodExample1 {

	public static void main(String[] args) {
	
	int num=method(12,10); //12,& 10 are parameters
	System.out.println(num);
	method2();   //for line 20 example
	}

	public static int method(int num1, int num2) {
		
		int num3;
		num3=num1+num2;
		return num3;   //return the value of num3 variable when you are done using the method
	}
	
	
 // adding another method but with void will only print not return	
	public static void method2() {
		for(int i=0;i<5;i++) {
		System.out.println("hi");
		}
	}
	
	
	
}
