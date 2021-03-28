package com.class15;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1="Hello";
		System.out.println(var1.toLowerCase());
		System.out.println(var1.toUpperCase());
		
		var1="Hello 123!"; //reassigned 
		System.out.println(var1.toLowerCase());
		
		
		var1=var1.toUpperCase();  //now all will be upper case
		System.out.println(var1); //prints out HELLO 123!
		
		System.out.println("---another example---");
		
		String firstName="Yovanna";
		String lastName=" Quisbert";
		System.out.println(firstName+lastName);//used often
		String fullName=firstName+lastName;
		System.out.println(fullName);
		
		fullName=firstName.concat(lastName);//not common approach
		System.out.println(fullName);
		
		System.out.println("---Another example----");
		
		String var="Hello ";
		int var2=14;
		System.out.println(var+var2);
		
		//we can only use Concat with Strings
		
		
		
		
		
	}

}
