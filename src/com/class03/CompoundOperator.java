package com.class03;

public class CompoundOperator {
	
	public static void main(String[] args) {
	int num=100;
	
	num=num+100;
	System.out.println(num);
	
	
	num=num-50;
	System.out.println(num);
	
	System.out.println("------------------");
	
	//we are executing top from bottom using compounds (short cut-same results as above
	
	int num1=100;
	
	num1+=100; // num1=num1+100;    prints out 200
	System.out.println(num1);
	
	num1-=50;  /// prints 150
	System.out.println(num1);
	
	num1/=5;// prints out 30
	System.out.println(num1);
	
	num1*=10; //prints out 300
	System.out.println(num1);
	
	num1+=20;
	System.out.println(num1); //prints out 320
	
	
	// another example
	int a=1;
	a+=10;
	System.out.println(a);
	
	
	
	int task=500;
	task+=500;
	System.out.println(task);
	
	
	task-=57;
	System.out.println(task);
	
	int cakePiece=11;
	cakePiece/=4;
	
	System.out.println(cakePiece);
	
	
	int cake=25;
	cake%=7;
    System.out.println(cake);
	
    
	
	
	
	
	
	
	
	
	
	
	}

}
