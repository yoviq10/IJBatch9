package com.class03;

public class IfElseIf {
	// main= Ctrl + space= to print out main
	public static void main(String[] args) {
		// compare 2 numbers--> 3 possible conditions
		double num1 = 100.20;
		double num2 = 15.20;

		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println("Double value " + num2 + " is larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}
		// 2. Based on the day number, define a day

		int day = 6;

		if (day == 1) {
			System.out.println("Today is Monday");
		} else if (day == 2) {
			System.out.println("Today is Tuesday");
		} else if (day == 3) {
			System.out.println("Today is Wednesday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else {
			System.out.println("Today is Sunday");
		}
		// to format code neatly organized: ctrl+ shift +f---> Windows

		int month = 11;

		if (month == 1) {
			System.out.println("Today is January");
		} else if (month == 2) {
			System.out.println("Today is February");
		} else if (month == 3) {
			System.out.println("Today is March");
		} else if (month == 4) {
			System.out.println("Today is April");
		} else if (month == 5) {
			System.out.println("Today is May");
		} else if (month == 6) {
			System.out.println("Today is June");
		} else if (month == 7) {
			System.out.println("today is July");
		} else if (month == 8) {
			System.out.println("today is August");
		} else if (month == 9) {
			System.out.println("Today is September");
		} else if (month == 10) {
			System.out.println("Today is October");
		} else if (month == 11) {
			System.out.println("Today is November");
		} else if (month==12)
			System.out.println("Today is December");
	}

}
