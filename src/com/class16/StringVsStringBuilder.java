package com.class16;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		// String pool inside memory
		//.equals never compares the addresses / doesn't search in HEAP, jumps straight to String pool
		//STRINGS OBJECTS ARE IMMUTABLE >TO SAVE MEMORY BCAUSE WE CAN'T CHANGE THE VALUE
		//VARIABLES ARE MUTTABLE
		//objects are created inside HEAP
		
		String var1="USA";
		String var2="USA";
		String var3="USA";
		String var4= new String ("USA");
		System.out.println(var1==var2);//not preferred way
		System.out.println(var1==var4);
		System.out.println(var1.equals(var2)); //recommended method, doesn't check address location
		System.out.println(var1.equals(var4)); //recommended 
		
		System.out.println();
		System.out.println("---StringBuilder class---");//Preferred way!!
		//String Builder are mutable -->things WILL CHANGE
		
		StringBuilder sb=new StringBuilder("USA");
		
		
		
		
		
	}

}
