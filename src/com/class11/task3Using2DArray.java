package com.class11;

public class task3Using2DArray {

	public static void main(String[] args) {
		
		/*Create 2D array of cars : american, german, korean, italian.
		 * Then retrieve all values from that array using 2 different loops
		 */
		
		
		String [][] cars= {
				{"ford","chevorle",},
				{"kia","hyundai"},
				{"BMW", "volkswagen"},
				{"ferrari","lambergini"}
						
					};

		
	for (int r=0; r<cars.length;r++) {	
		
		for(int c=0;c<cars[r].length;c++) {
			
			System.out.print(cars[r][c]+" ");
			
		}
		System.out.println();
	}
				
				
				
		System.out.println("---2nd way-----");
		
		
		for(String[] brand:cars) {
			 for(String logo:brand) {
				 
				 System.out.print(logo+" ");
			 }
			
			System.out.println();
		}
		
		
		System.out.println("----task----");
		/*
		 * Using 2D array create a grocery list.
		 *Inside you should have an array of veggies, fruits, dairy and sweets. 
		 *Retrieve all values from that array using 2 different loops
		 */
		
		
		
		String [] [] groc= {
				
				{"Tomota" , "Onion", "Carrot"},
				{" Apple" , "Orange", "Grapes"},
				{"Milk", "Cheese"},
				{"Custurd", "Cupcakes"}
		};
		
		for (int r=0; r<groc.length; r++) {
			for (int c=0; c<groc[r].length; c++) {
				System.out.println(groc[r][c]+" ");
			}
		System.out.println();
		
	}
		
		
		
		
		
		
		
		

	}

}
