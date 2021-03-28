package com.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Yovanna"; //mostly used because its a shorter syntax
		String name1=new String("Yovanna");//creating objects of string class
		
		
		
		System.out.println(name);
		// first method
		//Length  is the number of characters in a string class
		System.out.println(name.length());
		name="      yovanna";  //Reassigned the value
		int len=name.length();  // created a new variable and calling a  method
		System.out.println(len); //printing the value from the length method
	}

}
