package com.class18;

public class AccessModifierDemo {
	
	public String name;
	private String bankAccountPassword;
	String SSNumber;  //default behavior applied
	
	
	public void park() {
		System.out.println("Everyone can go to a public park");
	}
	
	
	void car() {
		System.out.println("My little brother you can have my car, please don't destoy it");
	}
	
	
	void toothBrush() {
		System.out.println("No one should use it");
	}
	
	
	void printInfo() {
		System.out.println(name);
		System.out.println(bankAccountPassword);
		System.out.println(SSNumber);
	}
	
	

}
