package com.class17;

public class StringBuilderString {

	public static void main(String[] args) {
		// String
		String var1="yovanna";
		String var2="nelson";
		String var3="yovi";
		String var4="brian";// recommended approach
		String var5=new String("yoviq10");//not good approach, when it come to creating string objects
		var4="diana";
		
		
		
		//String builer
		StringBuilder sb1=new StringBuilder(var1);//taking it from String class and making it a StringBuilder
		StringBuilder sb2=new StringBuilder("nelson");
		StringBuilder sb3=new StringBuilder("yovi");
		StringBuilder sb4=new StringBuilder("brian");
		
		System.out.println(sb1.reverse());
		
			var1=sb1.toString();
			
			System.out.println(var1);

	}

}
