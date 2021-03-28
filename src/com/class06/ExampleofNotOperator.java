package com.class06;

import java.util.Scanner;

public class ExampleofNotOperator {

	public static void main(String[] args) {
		
		
		/*we need to calculate final price after discount
		 * First we check if there is a sale
		 * If no sale,-->"I am not going shopping"
		 * otherwise if there is a sale we will ask the item & for price,-->"What is the price?"
		 * If price is less than $10, then -->apply 5% discount
		 * If price is between 10 and 100, then-->apply 10% discount
		 * If price is between 100 and 500 then-->apply 20% discount
		 * If price is more than $500, then-->apply 30% discount
		 */
		
		Scanner price=new Scanner(System.in);
		
		String item;
		double itemPrice,discPrice = 0,finalPrice = 0;
	
		System.out.println("Is there a sale today?");
		boolean sale=price.nextBoolean();
		
		
		if(!sale) {
			System.out.println("I am not going shopping");
		}else {
			System.out.println("Do you have the item");
			item=price.next();
			System.out.println("What is the price of the item?");
			itemPrice=price.nextDouble();
			
			if(itemPrice>0 && itemPrice<10) {
				discPrice=itemPrice*0.05;
			
			}else if (itemPrice>=10 && itemPrice<100) {
				discPrice=itemPrice*0.1;
				
			}else if(itemPrice>=100 && itemPrice<=500) {
				discPrice=itemPrice*0.2;
			
			}else if(itemPrice>500) {
				discPrice=itemPrice*0.3;
				
				
			}
			
			finalPrice=itemPrice-discPrice;
			System.out.println("You are buying "+ item+" with original price="+itemPrice+" after discount "+discPrice+" your final price is=$"+finalPrice);
			
		}
		
		if (finalPrice<500) {
			System.out.println("I did not do crazy shooping");
		}
		
		

	}

}
