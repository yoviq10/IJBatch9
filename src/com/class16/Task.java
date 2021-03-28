package com.class16;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence.
		 * Write a program to get a new String without any spaces.
		 */
		
		
		String word="Hello How are you?";
		System.out.println(word.replace(" ",""));
		
	
		System.out.println();
		System.out.println("--Task number 2--");

		/*
		 * Create a String that should be combination of letters, numbers and special characters.
		 * Find out how many alpha characters are there in the String.
		 */
		
		
		String words="abc123!@#";
		System.out.println(words.replaceAll("[^a-z]","").length());
		
		
		System.out.println();
		System.out.println("--Task number 3--");
	
		/*
		 * You have a String a="Is it saturday?
		 *  Is it raining? Do we have a Java Class today?" 
		 *  How would you find out how many sentences are in that String?
		 * 
		 */
		
		String a="Is it Saturday?, Is it raining?, Do we have Java class today";
		System.out.println(a.split("[?]").length);
		
		
		
		
	}

}
