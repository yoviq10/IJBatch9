package com.class15;

public class IsEmptyDemo {

	public static void main(String[] args) {
		
		String name=""; //no characters inside
		System.out.println(name.isEmpty()); //true
		
		
		String name1=" ";  // because it has a character inside
		System.out.println(name1.isEmpty());  //false since there is something inside
		
		

	}

}
