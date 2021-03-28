package com.class17;

public class LocalVariableDemo {

	
	void printinfo(String name) { //also a local variable inside()
		String phoneNumber="1234456";
		System.out.println(name);
	}
	
	
	void printInfoWithAddress(String name, String address) {
		System.out.println(name+address);
		//System.out.println(phoneNumber);//CE not defined
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Local";
		
		System.out.println(name);
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		
		
		{
			int x=10;
			{
		
		int y=20;
		System.out.println(x);
		}
	}
		
		
		
		

	}

}
