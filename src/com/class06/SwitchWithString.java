package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		/*We need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * based on the country, identify favorite food
		 */

		Scanner input;
		String country,food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "usa":
			food="burger";
			break;
		case "afghanistan":
			food="kebab";
			break;
		case "vietnam":
			food="pho";
			break;
		case "poland":
			food="pierogi";
			break;
		case "japan":
			food="ramen";
			break;
		case "mexico":
			food="tacos";
			break;
		default:
			food="unknown";
			}
		
		System.out.println("Your favorite food is "+ food);
		
		
	}

}
 