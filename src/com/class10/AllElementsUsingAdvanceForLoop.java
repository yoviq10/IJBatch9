package com.class10;

public class AllElementsUsingAdvanceForLoop {

	public static void main(String[] args) {
		
		//for each element, enhanced for loop, advance for loop
		// USED ONLY WITH ARRAYS!! OR COLLECTIONS!!!
		
		int[]numbers= {10,14,78,5,90,};
		
		for(int num:numbers) {
			
			System.out.print(num+" ");
		}
		
		System.out.println();
		System.out.println("---------Array of Names-----------");
		
		String[] name={"Yovanna","Nelson","Elizabeth","Ariana","Jonathan","Lilly","Dris"};
		
		for(int i=0; i<name.length; i++) {
		
		System.out.print(name[i]+" ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		
		for(String n:name) {
			
			System.out.print(n+" ");
			
		}
		
		System.out.println();
		System.out.println("-----Char---------------");
		
		char [] grades= {'A','B','C','D','E','F','G','H'};
		
		for(char grade:grades) {
			
			System.out.print(grade+" ");
		}
		
		System.out.println();
		System.out.println("-----Boolean--------------");
		
		boolean [] boo= {true,false,false,false,true};
		
			for(boolean b:boo) {
				
				System.out.print(b+" ");
			}
		
		
		
		
		
		
	}


}
