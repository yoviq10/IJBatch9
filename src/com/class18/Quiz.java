package com.class18;

public class Quiz {

	public static void main(String[] args) {
	
		//there are spaces in the given answer
		
		
		
		//what will be the output in the java code?
		String word="abrakadabra";// the spaces b,r,k,d,b,r
		
		String replace=word.replaceAll("[^aAeEiIoOuU]"," ");
		System.out.println(replace);

	}

}
