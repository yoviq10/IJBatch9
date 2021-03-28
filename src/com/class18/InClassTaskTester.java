package com.class18;

public class InClassTaskTester {

	public static void main(String[] args) {
		
		
		InClassTask task1=new InClassTask();
		
		double [] arr= {10,20};  //using default modifier
		task1.sumArrayElements(arr);
		
		System.out.println(task1.sumArrayElements(arr));
		
		
		
		System.out.println("----task #2------");
		InClassTask task2=new InClassTask();
		
		System.out.println(task2.reverseString("abcdef")); //using public modifier
		
		System.out.println("----task #3------");
		InClassTask task3=new InClassTask();
		
		//System.out.println(vowelsOnly("yovanna"));
		//can't be accessed because it is private, needs to be with same class

	}

}
