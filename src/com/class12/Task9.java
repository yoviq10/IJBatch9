package com.class12;

public class Task9 {

	public static void main(String[] args) {
		
		
		/*
		 * Write a java program to fin the second largest number in the array?
		 */

		
				int arr[] = { 1, 230, 230,3, 45, 89,76, 45, 125, 36,145};
				
				int largest = 0;
				int secondLargest = 0;
				
				for (int i = 0; i < arr.length; i++) {
					
					if (arr[i] > largest) {
						secondLargest = largest;
						largest = arr[i];
						
					} else if (arr[i] > secondLargest && arr[i]!=largest) {
						secondLargest = arr[i];
					}
				}
				System.out.println("Largest number is " +largest);
				
				System.out.println("Second largest number is " + secondLargest);
				
		
		
		
		
		
		
		
		
		
	}

}
