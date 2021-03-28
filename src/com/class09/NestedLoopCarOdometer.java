package com.class09;

public class NestedLoopCarOdometer {

	public static void main(String[] args) {
		
		for(int c=0; c<10; c++) {
			
			for (int d=0; d<=9; d++) {
				System.out.println(c+" "+d);
			
				for(int e=0; e<=9; e++) {
				
					for (int f=0; f<=9; f++) {
						
						System.out.println(c+" "+d +" "+e+" "+f);
				
				}
			}
				
			}
			
		}
		
		System.out.println("-------clock-----------");
		
		
		for(int h=0; h<24; h++) {
			
			for (int m=0; m<=60; m++) {
				
				if(h < 10 && m < 10) {
					System.out.println("0"+h+":0"+m);
				}else if(h < 10 && m >=10) {
					System.out.println("0"+h+":"+m);
				}else if(h >= 10 && m < 10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+ ":"+ m);
				}
			}
			
		}
		
		System.out.println("---Another way---CLOCK--------------");
		

		for(int h=0; h<24; h++) {
			
			for (int m=0; m<=60; m++) {
				
				if(h < 10) {
					
					if(m<10) {
					System.out.println("0"+h+":0"+m);
				}else{
					System.out.println("0"+h+":"+m);
				}
					
				}else {
					if(m<10) {

						System.out.println(h+ ":0"+ m);
					}else {
					System.out.println(h+ ":"+ m);
				}
			}
			}
		}
		
		System.out.println("---Nested Loop multiplication Table---------------");
		
		
		
		int multi;
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
		multi=i*j;
		System.out.println(i+" * "+j+" = "+multi);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
