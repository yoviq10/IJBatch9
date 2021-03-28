package com.class11;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		
		
		String [][] usa= {
				
				{"Alexandria", "Oakton","Arlington","Virgina Beach","Fairfax"},
				{"Philly","strassburg","pittsburg"},
				{"Boston","Quincy","Springfield","Burlington"},
				{"Los Angeles","Long Beach","San Francisco", "Sacramento","Sanata Barbara"},
				{"Miami","Orlando","Tampa","Tallahasee"},
					
			};
				
		System.out.println(usa.length); //result = 5 total of single arrays or 5 ROWS
		System.out.println(usa[0].length); // 5 elements inside 1 array/ 5 columns in 1 row
		System.out.println(usa[1].length); // 3 elements inside 2 array/ 3 columns in 2 row
		System.out.println(usa[2].length); // 4 elements inside 3 array/ 4 columns in 3 row
		
		for(int r=0;r<usa.length;r++) { //iterates over rows
			
			for(int c=0;c<usa[r].length;c++) {
				System.out.print(usa[r][c]+", ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("-----using nested for each loop------");
			
			for(String[] cities:usa) {
				
				for(String city:cities) {
					
					System.out.print(city+", ");
				}
				System.out.println();
			}
			
		
		
		
		
		

	}

}
