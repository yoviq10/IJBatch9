package com.class10;

public class Task2Arrays {

	public static void main(String[] args) {
		
		/*Create an array of names and store all names of your group. 
		 * Then print your name from that array. 
		 * (use 2 different ways of creating an array).
		 */
		
		
		String[] names=new String[7];
		names[0]="Yovanna";
		names[1]="Nelson";
		names[2]="Elizabeth";
		names[3]="Ariana";
		names[4]="Jonathan";
		names[5]="Lilly";
		names[6]="Dris";
		
		System.out.println(names[0]);
		
		System.out.println("----Another Way------");
		
		String[] name={"Yovanna","Nelson","Elizabeth","Ariana","Jonathan","Lilly","Dris"};
		
		System.out.println(name[0]);
		
		System.out.println("-------------------------------------------");
		System.out.println("all elements from an Array");

		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
			
		}
		
		
		
		
		
		System.out.println("----Task#3------");
		
		/*Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 */
		
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="Coding";
		words[4]="is";
		
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+ words[3]+" "+ words[2]);
		
	
		
		
		
	}

}
