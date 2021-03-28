package com.class11;

public class Task2TwoDArray {

	public static void main(String[] args) {
		
		
		String [][] names= {
				{" Mr "," Mrs "," Ms "," Miss "},
				{" Smith, "," Jordan,"," Jackson, "," Obama, "},
						
					};

		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
	  System.out.println(names[0][3]+" "+names[1][1]);	
				
				
				
				
				
				
				
				
				
		System.out.println("---2nd way-----");
		
		
		
		String [][] num=new String [2][4];
		
		//1 array (1st row)
		num[0][0]="Mr";
		num[0][1]="Mrs";
		num[0][2]="Ms";
		num[0][3]="Miss";

		// 2nd array( 2nd row)
		num[1][0]="Smith";
		num[1][1]="Jordan";
		num[1][2]="Jackson";
		num[1][3]="Obama";
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
