package com.class14;

public class Calculator {

	int add(int num1,int num2) {
		return num1+num2;
	}
	
	// with double and subtraction
	
	double sub(double num1, double num2) {
		return num1-num2;
		}
	
	//adding a few more methods
	
	double multiply(double num1,double num2) {
		return num1*num2;
	}
	
	//using if condition another example of methods
	double div(double num1,double num2) {
		if(num2!=0) {
			return num1/num2;
		}else {
			return 0;
		}
	}
	
}
