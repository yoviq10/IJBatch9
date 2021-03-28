package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MoreMethodsExamples obj1=new MoreMethodsExamples();	
	
	System.out.println(obj1.print());	
	System.out.println(obj1.doubleTheValue(10));	
	obj1.isRaining(true); //simply printing-void
	obj1.print5Times();  //simply printing-void
	System.out.println(obj1.returnGreater(12,14));
	obj1.printEvenOdd(10); //simply printing-void
	
	double [] arr= {10.2,25,30};
	System.out.println(obj1.returnTheArraySum(arr));
	
	
	System.out.println(obj1.isMirror("aba"));
	System.out.println(obj1.isMirror("abcdef"));
	
	
	
	
	}

 
	
	
	
	
	
	
	
	
	
	
}
