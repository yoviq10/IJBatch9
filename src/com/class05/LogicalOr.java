package com.class05;

public class LogicalOr {

	public static void main(String[] args) {

		/*Variable day
		 * If day is Tuesday or Wednesday--> Manual class
		 * If day is Monday or Friday--> no class
		 * If Saturday or Sunday--> Java =class
		 * If day is Thursday--> review class
		 */

		String day="Saturday";
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today I have no class");
			
		}else if (day.equals("Tueday")|| day.equals("Wednesday")) {
			
		}else if (day.equals("Thursday")) {
			System.out.println("Today I have review class");
			
		}else if (day.equals("Saturday") || day.equals("Saturday")) {
			System.out.println("Today I have Java class");
			
		}else {
			System.out.println(day +" is invalid");
		}
		
	}

}
