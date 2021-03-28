package com.class13;

public class BankApplication {

	public static void main(String[] args) {
		// from Account class
		
		
		Account YovannaAccount= new Account();
		
		YovannaAccount.accountNumber="123";
		YovannaAccount.userName="Yovi123";
		YovannaAccount.password="pass123";
		YovannaAccount.balance=1400;
		YovannaAccount.login("Yovi123", "pass123");
		

	}

}
