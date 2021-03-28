package com.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		/*We have to identify if number is small, medium, large, XL
		 * If number is between 1 and 10-->small
		 * If number is between 11 and 100 --> medium
		 * If number is between 101 and 1000---> large
		 * If number is between 10001 and 100000--->XL
		 */
		
		int num=100;
		
		if(num>=1 && num<=10) {
			System.out.println(num + " is a small number");
		} else if (num>=11 && num<=100) {
			
			System.out.println(num +" is a medium number");
		}else if (num >=101 && num<=1000) {
			
			System.out.println(num +" is a large number");
		} else if (num>=1001 && num<=100000) {
			
			System.out.println(num +" is a XL number");
		} else {
			System.out.println(num + " is A HUGE number");
		}

		
		
	}

}
