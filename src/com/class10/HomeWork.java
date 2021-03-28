package com.class10;

public class HomeWork {

	public static void main(String[] args) {
		
		System.out.println("--Hw #1--");
		/*Create an array of cars and store 6 elements into it. 
		 *Using 2 different loops print all values from the array.
		 */
		
		String[] cars={" BMW", "NISSAN", "HONDA", "TOYOTA", "PORSHE", "ACURA"};
	
		for(int i=0; i<cars.length; i++) {
			
			System.out.print(cars[i]+" ");
		}
			System.out.println();
			System.out.println("-----Another Way----");
			
		for(String car:cars) {
				
				System.out.print(car+" ");
			}
			
			
		System.out.println();
		System.out.println("--------HW #2 ---------");
		 
		/*Create an array of animals and store 6 elements into it.
		 * Using 2 different loops print all elements from the array.		
		 */
		
		String[] animals=new String[6];
		animals[0]=" lion ";
		animals[1]=" cheetah ";
		animals[2]=" leapord ";
		animals[3]=" jaguar ";
		animals[4]=" dog ";
		animals[5]=" tiger ";
		
		System.out.print(animals[0]+animals[1]+animals[2]+animals[3]+animals[4]+animals[5]);
		
		System.out.println();
		System.out.println("--------Second way---------");
		
		String[] animal= {" lion ","cheetah"," leapord"," jaguar"," dog ","tiger "};
		
		for(String anim:animal) {
			
			System.out.print(anim+" ");
		}
		
		System.out.println();
		System.out.println("--------HW #3 ---------");
		
		/*Create an array on integers and calculate the sum of all elements in an array.
		 */
		 
		int[] elements= {1,2,3,4,5,6};
		int sum=0;
		
		for(int num:elements) {
			
			sum+=num;
		}
		
		System.out.println("sum of all elements in a array is "+sum);
		
		
	}

}
