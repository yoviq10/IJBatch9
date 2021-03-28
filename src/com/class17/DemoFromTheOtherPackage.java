package com.class17;

import com.class18.AccessModifierDemo;
import com.class18.InClassTask;

public class DemoFromTheOtherPackage {

	public static void main(String[] args) {
		
		AccessModifierDemo obj1=new AccessModifierDemo();
		
	//	System.out.println(obj1.bankAccountPassword);//not available due to private
		System.out.println(obj1.name);
	//	System.out.println(obj1.SSNumber);
		
		
		InClassTask task1=new InClassTask();
		
		double [] arr= {10,20};
	//	task1.sumArrayElements(arr); >> not accessible becuase not public
		
		//System.out.println(task1.sumArrayElements(arr));
		
		
		
		
		
		

	}

}
