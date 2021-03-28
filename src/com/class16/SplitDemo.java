package com.class16;

public class SplitDemo {

	public static void main(String[] args) {
		// this method is widely used*
		
		
		//put in array of Strings
		String var1="Today is Wednesday";
		System.out.println(var1.length());
		
		String [] strArr=var1.split(" "); 
		for(String word:strArr) {
			System.out.println(word);
		}

		System.out.println("--another example--");
		
		String var2="Syntax is best. Batch 9 is great";
		String [] strArr2=var2.split("[.]"); //NEED SQUARE BRACKETS or it won't print
		for(int i=0; i<strArr2.length;i++) {
			System.out.println(strArr2[i]);
		}
		
		
		System.out.println();
		System.out.println("-METHOD CHAINING-");
		
		//Method Chaining >combining multiple methods in the same line
		String var3="        SYNTAX       ";
		System.out.println(var3.trim().toLowerCase());
		//trim removes spaces     // lower case to small
		
		System.out.println();
		System.out.println("--another example--");
		
		
		
		
	}

}
