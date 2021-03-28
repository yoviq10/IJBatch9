package com.class11;

public class Array2DCountries {

	public static void main(String[] args) {
		
		/* 
		 *Create 2D array of countries: north america countries, south america * countries, europe countries, asian countries, african countries.
		 *Then print all values from that array using 2 different loops 
		 *and calculate how many total countries have been stored.
		 */	
		
		
		int count=0;String[][] countries = {
				{ "USA", "Canada", "Mexico" }, 
				{ "Brazil", "Colombia", "Peru", "Bolivia", "Argentina" },
				{ "France", "Spain", "Italy", "UK", "Germany", "Sweden" },
				{ "UEA", "Sudi", "Palestine", "Syria" },
				{ "Algeria", "Morocco", "Senegal", "Lybia", "Tunisia", "Sudan", "Malawi", "South Africa" },
			};
		
		for (String[] country : countries){
			
		
			{for (String c : country){
				
				System.out.print(c + " ");
				count++;}
			}
		System.out.println();		
	}
		
	
		
		System.out.println("---------");
		System.out.println("---another way");
		
		for (int i=0;i<countries.length;i++) {
			for(int j=0;j<countries[i].length;j++) {
				System.out.println(countries[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The total of the countries stored is:"+ count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


