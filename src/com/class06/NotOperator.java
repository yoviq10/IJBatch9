package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		boolean rain=true;
		
		if(!rain) {
			System.out.println("I will go to the park");
		}

		boolean boo=!true; //false
		System.out.println(boo);
			
		// second example:
		
		boolean boo1=!false; //true
		System.out.println(boo1);
		
		//third example
		boolean traffic=true;
		
		if(!traffic) { //false
			System.out.println("I will come on time");
		}
		
		//4th example:
		boolean traffic1=false;
		
		if(!traffic1) { //true
			System.out.println("I will come on time");
		
		//5th example:
		String day="Monday";
		
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		
		}
		
	}

}
