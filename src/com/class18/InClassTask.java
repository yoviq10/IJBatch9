package com.class18;

public class InClassTask {

	/*Create a method that will accept an array as parameters
	 * and will return a sum of all elements from that array.
	 * Method should be visibly only within same package 
	 * and accessible by the creating an instance of the class. 
	 */
	
	double sumArrayElements(double [] arr) {
		
		double sum=0;
		for(double element:arr) {
			sum+=element;
		}
		return sum;
	}
	
	
	//Task#2
	
	/*Create a method that will take a String as a parameter 
	 *and returns reversed String. 
	 *Method should be available to all classes within your project
	 *and accessible by class name.
	 */
	
	public static String reverseString(String str) {
		
		String str2="";
		
		for(int i=str.length()-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		return str2;
	}
	
	
	//task#3 ***- can't be done with separate classes since this will be a private**
	/*Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
	 *Method should be available inside the class only where it was declared 
	 *and executed by calling it is name.
	 */
	
	private static String vowelsOnly(String input) {
		return input.replaceAll("[^a,e,i,o,u]",""); //replaces everything that is not a vowel
	}
	
	
	
	
	
	
	
	
	
	
}
