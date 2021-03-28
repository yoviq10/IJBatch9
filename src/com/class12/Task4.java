package com.class12;

public class Task4 {

	public static void main(String[] args) {
		
		String[][] country= {
				{"USA", "Kanada", "Mexico"},
				{"Brazil", "Argentina", "Chile", "Peru", },
				{"France", "Italy", "Spain", "Germany"},
				{"Egypt", "Nigeria", "Tanzania"}
		};
		
		for (int i=0; i<country.length; i++) {
			for (int j=0; j<country[i].length; j++) {
				System.out.print(country[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------second way---------------");
		
		for (String[] count:country) {
			for (String c:count) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		int number=country.length+country[1].length+country[2].length+country[3].length;
		
		System.out.println("---------------------");
		
		System.out.println("a total of "+number+" countries.");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
