package com.class15;

public class ContainsDemo {

	public static void main(String[] args) {
		
		
		String var="This is a demo, it contains #";
		System.out.println(var.contains("#")); //false output
		if (var.contains("#")) {
			System.out.println("# are not allowed");
		}

		System.out.println("---another example---");
		
		String var1="This is a demo, it contains method";
		System.out.println(var1.contains("#")); //false output
		//since it doesn't contain a #
		
		System.out.println("-----another example---");
		
		System.out.println(var.contains("demo")); //true on line 16
		
		
		
		
		System.out.println("--another example with 2 --");
		
		
		String var3="This is a demo, it contains #";
		System.out.println(var3.contains("#")); //true output
		if (var3.contains("%") || var.contains("#")) {
			System.out.println("%, # are not allowed");
		}
		
		
		System.out.println("---Star Switch---");
		
		System.out.println(var.startsWith("contain")); //checks only starting part
		System.out.println(var.endsWith("#")); //TRUE -it does end with # on line 8
		
		
		
	}

}
