package com.class16;

public class ReplaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var1="Hello";
		var1=var1.replace('e','a'); //we can replace characters & assigning it to the variable 1
		System.out.println(var1);  //prints out Hallo
		
		System.out.println("--another example---");
		
		String var2="Syntax is best. Batch 9 is best"; //we can also replace words/strings
		System.out.println(var2.replace("best", "amazing"));
		//replaces best with amazing 

	}

}
