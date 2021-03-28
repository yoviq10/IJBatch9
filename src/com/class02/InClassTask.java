package com.class02;

public class InClassTask {

	public static void main(String[] args) {
		
		
		//1.)
		double a=5.0;
		double b=15.99;
		
		double sumOf= a + b;
		double subOf=a-b;
		double multOf=a*b;
		double divOf=a/b;
		System.out.println("The addition of 2 numbers " +a + " and " + b+ " is equal to "+ sumOf );
		System.out.println("The subtraction of 2 numbers " +a + " and " + b+ " is equal to "+ subOf );
		System.out.println("The multiplication of 2 numbers " +a + " and " + b+ " is equal to "+ multOf );
		System.out.println("The division of 2 numbers " +a + " and " + b+ " is equal to "+ divOf );
	
		
		//2.)
		float c=10.1f;
		float d=2.99f;
				
		System.out.println(c*d);
		 float add= c+d;
		 System.out.println("the addition of " + add);
		 
		 double lettuce=3.99;
		double tomatoes=2.50;
		double salad=lettuce + tomatoes;
		System.out.println("the cost of salad is" + " $"+ salad);
		
		double shirt=50.00;
		double pants=200.97;
		double shoes=658.23;
		double outfit=shirt + pants +shoes;
		
		System.out.println("The whole outfit cost me $"+ outfit);
		
		System.out.println("the outfit with pants and shoes cost me $"+ outfit +".");
		System.out.println("The shoes alone cost $" + shoes);
		
		
		int messi=11;
		int neymar=3;
		int total= messi + neymar;
		System.out.println("together they scored "+ total +" goals."); 
		
		char yovanna='y';
		char nelson='n';
		System.out.println("their initials are " + yovanna + " and " +nelson);
		
		
		//new boston notes if else statements
		
		int test=6;
		
		if (test==9);// you need to make sure you have 2 equal signs so that you are not testing the variable above
		if (test <=9); // is 6 less than or equal to 9?
		if (test!=9); // (exclamation means>> not equal to 9  
		if (test >=9);// is greater or equal to 9?
		
		//Example:
		if (test==9) {
			System.out.println("yes");
		}else {
			System.out.println("this is else");
		}
		// in other words, 6 does not equal to 9
		
		
		// Another example if 6 is less than 9>> it will print out "yes"
		if (test < 9) {
			System.out.println("yes");
		}else {
			System.out.println("this is else");
		}
		

	
	long wheels=3000;
	long coilover=1500;
	long s15=22000;
	long price= wheels+coilover+s15;
	
	System.out.println("The wheels cost me "+ wheels+ ", the coilovers cost me " + coilover + ", the car cost me " +s15 + ". so far i've spent " + price);
	


	long engine=4000;
	long brideSeats=1500;
	long parts=engine+brideSeats+price;
	
	System.out.println("I still need the engine, it's " + engine + " plus seats "+ brideSeats);
	System.out.println("I will have spent " + parts+ " to get the car done.");
	
	
		
	
	
	
	
	
}






	}




