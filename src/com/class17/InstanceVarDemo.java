package com.class17;

public class InstanceVarDemo {

	
		
		String name;
		int age;
		
		void printInfo() {
			//if I am inside same class & my method is NOT STATIC
			//I can use my instance variables directly
			double salary=120000;
			System.out.println(salary);
			System.out.println(name+" "+age);
		}
		
		

	

}
