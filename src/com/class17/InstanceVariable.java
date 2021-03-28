package com.class17;

public class InstanceVariable {

	int number=10; //instance variables inside class but outside main
	String name="yo";//instance variable
	
	void printNumber() {
		System.out.println(number);
		String name="Yovanna";
	}
	
	void printNumber2() {
		System.out.println(number);
		
	}
	
	
	public static void main(String[] args) {  //static means access variable
		
		InstanceVariable obj=new InstanceVariable();
		
		System.out.println(obj.number);
		
	System.out.println(obj.name);
		
		
		
		
		
		
		
		

	}

}
