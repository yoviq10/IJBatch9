package com.class12;

public class Task8 {

	public static void main(String[] args) {
		
		
		/* Maximum and minimum in the array?
		 * 
		 * (has to be placed in different loops)
		 */

	
		int[] largeArray = { 158698, 564, 7894, 15216, 41161, 51651651 };
		
		int smallest=largeArray[0];
		int largest=largeArray[0];
		
		for(int i=0; i<largeArray.length; i++) {
			
			if(largeArray[i]<smallest) {
				smallest=largeArray[i];
			}
			if (largeArray[i]>largest){
				largest=largeArray[i];
			}
		}
		
		System.out.println(smallest+" is minimum number in the array");
		System.out.println(largest+" is maximum number in the array");
		
	System.out.println("---Another way------------------------------");
		
		
		
	int [] num4=  {4,3,-2,4,7,12,13,15,};
	
	int small= num4[0];
	int large=num4[0];
	
	for (int i=0; i<num4.length; i++) {
	
	if (num4[i] <small) small= num4[i];
	if (num4[i] >large) large=num4[i];
	
		
	
	}
	System.out.println(" the smallest number is  "+small+" and the largest number is "+large);
		
		
		
		
		
		
		
		
		
		
	}

}
