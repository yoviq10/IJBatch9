package com.class06;

import java.util.Scanner;

public class ReviewClassLogicalOperatorWithScannerVsINestedIf {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your password");
			String pass=scanner.next();
			
			System.out.println("Enter the amount that you want to transer");
			double transferAmount=scanner.nextDouble();
			
			if(pass.equals("pass123")&& transferAmount<1000) {
				System.out.println("Amount transferred");
			}else {
				System.out.println("Either your password is not correct or you do not have enough balance");
			}
		
			
			//like the above code
			
			if(pass.equals("pass123")) {
				System.out.println("Enter the amount you want to transer");
				transferAmount=scanner.nextDouble();
				if(transferAmount<100) {
					System.out.println("Amount Transferred");
				}else {
					System.out.println("Not enough balance");
				}
				
			}else {
				System.out.println("password is not correct");
			}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
