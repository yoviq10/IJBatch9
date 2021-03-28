package repl74;

public class ArrayYears {

	public static void main(String[] args) {
		
	/*
	 * 	Write a program that creates an array of integers of size 11.
	 *  Add the years 2010 to 2020 to your array one by one using a for loop 
	 *  and then print all those values.
	 */
		
		
		
		 
	    
		int [] array=new int[11];
		int sum=0;

	      for(int i =2010; i<=2020; i++ ){
	         for(int j = i+1; j<=2020; j++){

	        	 sum+=array[i];
	         }
	      }	 
	     
		System.out.println(sum);
		
	

		
		
		
		
		
		
		

	}

}
