package com.class15;

public class CharAtDemo {

	public static void main(String[] args) {
		
		String name="Yovanna";
		System.out.println(name.charAt(3)); //prints a
		
		int sum=0;
		for(int i=0; i<name.length(); i++) {
			
			if(name.charAt(i)=='a') {
				System.out.println("a found");
			sum++;
			}
			
			}
		
		System.out.println(sum+" a are found");//2 a's are found in yovanna
		
		
		
		
		System.out.println("..another example..");
		
		String name1="Yovanna";
		System.out.println(name1.charAt(3));// prints a
		
		
	}

}
