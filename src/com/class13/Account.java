package com.class13;

public class Account {

	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserNameWhenLogging,String passedPasswordWhenLogging) {
	if(userName.equals(passedUserNameWhenLogging)&&password.equals(passedPasswordWhenLogging)) {
		System.out.println("Welcome to Wells Fargo your balance is "+balance);
	}else {
		System.out.println("username or password is not correct");
	}
	
	}
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your account number is "+accountNumber+" your balance is "+balance);
		}
	}
	
	
	
	
	
	
}
