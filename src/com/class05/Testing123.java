package com.class05;

import java.util.Scanner;

public class Testing123 {

	public static void main(String[] args) {
		
		Scanner names=new Scanner(System.in);
		
		String sport,team = null;
		
		System.out.println("Please enter name");
		sport=names.nextLine();
		
		if (sport.equalsIgnoreCase("Messi") || sport.equalsIgnoreCase("Ronaldo") || sport.equalsIgnoreCase("Neymar")) {
			team="Soccer";
		}else if (sport.equalsIgnoreCase("GSP") || sport.equalsIgnoreCase("Mcgreggor") || sport.equalsIgnoreCase("Silva")) {
			team="MMA";
		}else if (sport.equalsIgnoreCase("Jordan") || sport.equalsIgnoreCase("James") || sport.equalsIgnoreCase("Harden")) {                               
			team="basketball";
		}
		
		System.out.println(team);
		


		

	}

}
