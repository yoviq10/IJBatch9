package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		num=20; //re assigning the value
		System.out.println(num);
		
		int [] array=new int[5]; //preferable way 
		
		array[0]=10;
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		
		System.out.println(array[2]);
		System.out.println(array[0]+array[4]);
		
		System.out.println("--Double WAY--------");
	
		double [] numbers=new double[2];
		numbers[0]=10.99;
		numbers[1]=19.01;
		
		numbers[0]=11.99;// re assigning the value, you can always change the value
		System.out.println(numbers[0]);
		
		System.out.println("--String way--------");
		// Arrays are fixed in SIZE
		String[] names=new String[3];
		names[0]="Yovanna";
		names[1]="Nelson";
		names[2]="Asel";
		
		System.out.println(names[2]);
		
		System.out.println("--the error way--");
		
		String[] names1=new String[3];
		names1[0]="Yovanna";
		names1[1]="Nelson";
		//names1[2]="Asel"; null
		//names1[3]="Eli"; ArrayIndexOutOfBoundsException
		
		System.out.println(names1[2]);
		
		System.out.println("--Boolean WAY--");
		
		boolean[] b=new boolean[3];
		b[0]=true;
		b[1]=true;
		b[2]=false;
		
		System.out.println(b[2]);
		
		int size=b.length;
		System.out.println("The size of my array is "+ size); //Gives you the size of an array
	}

}
