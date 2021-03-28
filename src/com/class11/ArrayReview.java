package com.class11;

public class ArrayReview {

	public static void main(String[] args) {
		

	System.out.println("First way");
		
		int a,b,c;
		
		a=10;
		b=12;
		c=14;
		
		int [] array;
		array=new int [3];
		array[0]=10;
		array[1]=12;
		array[2]=14;
		
		System.out.println("Second way");
		
		int[] nums={10,12,14,44,23,78};
		int total=nums.length;
		
		int forthElement=nums[3];
					// To retrieve multiple elements, need to use FOR LOOP
		
			for(int i=0;i<nums.length;i++) {
				System.out.println(nums[i]);
				
			}
		
			
			System.out.println("--Printing backwards---");
			
		for(int i=nums.length-1;i>=0;i--) {
			
			System.out.println(nums[i]);
		}	
		
		System.out.println("--Advance For Loop---"); //This loop never gets an index out of Bounds
		
		//SYNTAX -->for(datatype variable:nameOfTheArray){}
			
		for(int num:nums) {
			System.out.println(num);
		}
		
		
		
		
		
		
		
	}

}
