package com.class18;

public class task3 {
	
		//task#3
		/*Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
		 *Method should be available inside the class only where it was declared 
		 *and executed by calling it is name.
		 */
		
		private static String vowelsOnly(String input) {
			return input.replaceAll("[^a,e,i,o,u]",""); //replaces everything that is not a vowel
		}
		
	
		public static void main(String[] args) {
		
		
	//	InClassTask task3=new InClassTask();// not needed since it is STATIC!!
		
		System.out.println(vowelsOnly("yovanna")); //prints the vowels of my name
		
		
		

	}

}
