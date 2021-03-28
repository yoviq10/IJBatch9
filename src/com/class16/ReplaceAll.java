package com.class16;

public class ReplaceAll {

	public static void main(String[] args) {
		// regex=regular expression
		
		String var1="Syntax is best34343. Batch nine is great"; //messy string
		System.out.println(var1.replace("34343",""));//numbers replaced to nothing

		System.out.println("--Another example--");
		
		String var2="Syntax is best34343. Batch nine is great";
		System.out.println(var1.replaceAll("[0-9]",""));
		var2="976543647efhffb";
		System.out.println(var2.replaceAll("[a-z]","")); //replace all lower case letters
		
		System.out.println("--another example--");
		
		String var3="Syntax is best34343. Batch nine is great";
		System.out.println(var3.replaceAll("[0-9]",""));
		var3="976543647efAhDfFfGHbJ";
		System.out.println(var3.replaceAll("[a-zA-Z]",""));//replaces all lower & upperCase letters
		
		System.out.println("--- the ^ character----");
		
		String var4="Syntax is best34343. Batch nine is great";
		System.out.println(var4.replaceAll("[0-9]",""));
		var4="976543647efAhDfFfGHbJ";
		System.out.println(var4.replaceAll("[^a-z]",""));//leaves only lowercase
		
		
		System.out.println("--- the ^ character----");
		
		String var5="Syntax is best34343. Batch nine is great";
		System.out.println(var5.replaceAll("[0-9]",""));
		var5="976543647efAhDfFfGHbJ";
		System.out.println(var5.replaceAll("[^A-Z]",""));//leaves only uppercase
		
	System.out.println("--- the ^ character----");
		
		String var6="Syntax is best34343. Batch nine is great";
		System.out.println(var6.replaceAll("[0-9]",""));
		var6="976543647$!efA$hDfF&*fGHbJ";
		System.out.println(var6.replaceAll("[^0-9]",""));//leaveS ONLY NUMBERS		
		
		System.out.println(var6.replaceAll("[a-zA-Z0-9]",""));//leaves special characters
		
		
		
	}

}
