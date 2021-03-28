package com.class19;

public class ConstructorDemo2 {
	//JVM knows if it is a constructor by class name
	
	double bonus;
	double salary;
	String name;
	
	ConstructorDemo2(String name){    //calling the constructor
		bonus=50000;
		salary=50000;
		this.name=name; //accessing a instance variable, not local
		
	}
	
	public static void main (String[] args) {
		
	ConstructorDemo2 obj1=new ConstructorDemo2("yovanna");
		System.out.println(obj1.bonus);
		System.out.println(obj1.salary);
		System.out.println(obj1.name);
	}
	
}
