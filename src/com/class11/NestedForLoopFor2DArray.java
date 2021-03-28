package com.class11;

public class NestedForLoopFor2DArray {

	public static void main(String[] args) {
		
		int [][] numbers= {
				{10,20,30,40},
				{90,80},
				{1,2,3,4,5,6,7},
			};
		
		System.out.println(numbers.length); //total numbers of single array
		System.out.println(numbers[1].length);
		
		for(int row=0;row<numbers.length;row++) {
			
			for(int columns=0;columns<numbers[row].length;columns++) {
				
				System.out.print(numbers[row][columns]+" ");
			}
				System.out.println();
				
		}
		
		
			System.out.println("=========================");
		
		
		for(int[] array:numbers) {
			
			for(int a:array) {
				System.out.print(a+" ");
				
			}
			System.out.println();
		}
		
			
		
			
			
		
		
		
	}

}
