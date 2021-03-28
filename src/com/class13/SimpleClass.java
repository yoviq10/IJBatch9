package com.class13;

public class SimpleClass {
	
	String var1;
	int var2;
	
	public void method1() {
		System.out.println("value of var 1 "+var1);
	}
	

	public String returnTheValueOfVar1() {
		return var1;
	}
	
	
	
	public void method2(String variable1) {
		var1=variable1;
	}
	
	
}
