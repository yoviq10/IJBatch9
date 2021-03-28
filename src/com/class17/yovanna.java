package com.class17;

public class yovanna {

	public static void main(String[] args) {
		
		//how to reverse an int 
		int salary=10001002;
		StringBuilder sb=new StringBuilder(String.valueOf(salary));//static method> salary converts to String
		sb.reverse();
		
		salary=Integer.parseInt(sb.toString());
		System.out.println(salary);
		
		
		
		//how to reverse a double to string
				double salary1=123456;
				StringBuilder sb1=new StringBuilder(String.valueOf(salary1));//converting a double to String and a string to String Builder
				sb1.reverse();
				
				salary1=Double.parseDouble(sb1.toString());
				System.out.println(salary1);
		
		
		
		
		
		
		
		
		
		
	}

}
