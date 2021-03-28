package com.class18;

public class TypesOfVars {

	//static variables belongs to the CLASS NOT THE OBJECTS
	String name;
	static String CompanyName="Syntax";
	
	void printInfo() {
		System.out.println(name+" Company "+CompanyName);
	}
	
	
	static void printCompanyInfo() {
		//System.out.println(name); error   cannot use instance variable inside static
		System.out.println(CompanyName);//CORRECT WAY!!
	}
	
	
	
	
	public static void main(String[] args) {
		
		TypesOfVars obj1=new TypesOfVars();
		obj1.name="Ram";
		
		
		TypesOfVars obj2=new TypesOfVars();
		obj2.name="Ram";
		
		
		
		
		

	}

}
