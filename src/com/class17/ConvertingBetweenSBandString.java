package com.class17;

public class ConvertingBetweenSBandString {

	public static void main(String[] args) {
		
		String var1="nelson";
		StringBuilder sb1=new StringBuilder(var1);
		sb1.reverse();
		var1=sb1.toString(); //toString converts stringBuilder to String
		System.out.println(var1);
		

	}

}
