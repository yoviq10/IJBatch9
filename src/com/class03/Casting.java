package com.class03;


public class Casting {
	
	
public static void main(String [] args) {
	
	/*CASTING IN JAVA
	 * IS CONVERTING A DATATYPE TO ANOTHER
	 * THERE ARE 2 TYPES
	 * WIDENING AND NARROWING
	 * 
	 * 
	 */
	
	
	
	//widening = this process will happen automatically also known as implicit...expanding numbers like:
	 //byte > short > int >long >float> double
	
	//widening or implict casting example:
	double d=10;
	System.out.println(d);
	
	
	//Narrowing=This process does not happen automatically..YOU NEED TO DO IT EXPLICIT OR (MANUALLY) taking bigger values into smaller ones..example below
		//double>float>long>int>short>byte
//	WITH NARROWING, THERE IS A POTENTIAL LOST OF DATA
	
	//narrowing or explict casting example:
	int i=(int) 12.99;
	System.out.println(i);
	
	byte b=(byte)130;
	System.out.println(b);
	
	
	int cakePiece=11;
	cakePiece/=4;
	System.out.println(cakePiece); //prints out 2.0
	
	int number=12;
	double result=number/5;
	System.out.println(result); //prints out 2.0
	
	double newNum=10;
	newNum=newNum/3;
	System.out.println(newNum);
	
// 	int num1=10+10.5; will not work in this format
	
	//It will run double divided by integer value= double results
	double  num1=10+10.5;
	System.out.println(num1);
	
	
	
	
}
	
}
