package com.class13;

public class Main {

	public static void main(String[] args) {
		// from simple class
		
		SimpleClass class1=new SimpleClass();
		class1.var1="yoyo";
		class1.method1();
		String var1=class1.returnTheValueOfVar1();
		System.out.println(var1);
		

	}

}
