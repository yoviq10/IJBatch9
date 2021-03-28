package com.class04;

import java.util.Scanner;

public class HomeWorkTemperature {

	public static void main(String[] args) {
		
		
		Scanner info=new Scanner(System.in);
		
		
		System. out. println("Enter the city you live in");
		
		String city=info.nextLine();
		System.out.println("What is the temperature in Fahrenheit?");
		
		double fahrenheit= info.nextDouble();
		
		double celsius = (fahrenheit-32)*(0.5556);
		
		System. out. println("The temperature in the city "+ city +" is "+ celsius);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
