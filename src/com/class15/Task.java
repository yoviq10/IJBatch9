package com.class15;

public class Task {

	public static void main(String[] args) {
		
		
		
		String userName="yoviq10";
		String passWord="12345678";
		String confirmPassword="12345678";
		
		if(userName.isEmpty() || passWord.isEmpty() ) {
			System.out.println("Username and Password cannot be empty");
		}else if (passWord.length()<8) {
			System.out.println("Password is too short");
		}else if(passWord.contains("userName")) {
			System.out.println("Password cannot contain username");
		}else if (!passWord.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		}else {
			System.out.println("Your username and password has been created");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
