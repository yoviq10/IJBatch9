package com.class02;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=11;
		
		String str1= "hello";
		String str2= "Hi";
				
				System.out.println(num1+num2+str1+str2);// equals 21helloHi
				System.out.println(num1+str1+num2+str2);// equals 10Hello11Hi
				System.out.println(str1+str2+num1+num2);// equals Hellohi1011
		
		// if String comes first, then the rest will not add up becuase of Str
				
				//Example:
				String result= str1+str2+num1+num2; //equals helloHi1011
				System.out.println(result);
		
				
				//If you are trying to add within a string line, add the num1 and num2 in parathesis
		//Example:
				//string result= str1+str2+(num1+num2);
				System.out.println(result);
				
		

	}

}
