package com.class10;

public class Task1Arrays {

	public static void main(String[] args) {
		/*Create an array of Char
		 * And store grades into it: A,B,C,D,E,F
		 * then print grade B
		 */

		
		
		//char [] grades;  --->Declaration
		//grades=new char[6]; ---> Assigning the value
		
		char [] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println("your grade is "+ grade[1]);
		
		System.out.println("---Another way of creating an array----");
		
		char [] grades= {'A','B','C','D','E','F','G','H'}; //shorter way
	
		System.out.println("your grade is "+ grades[6]);
		System.out.println("Number of elements in 2 array "+ grades.length);
		
		
		
	}

}
