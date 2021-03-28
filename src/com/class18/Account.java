package com.class18;

public class Account {

	//ALWAYS try to make your properties PRIVATE &
	//then define methods to change those properties, so we have more control over properties
	private double actualAccountBalance;
	private String actualUserName;
	private String actualPassWord;
	
	
	public boolean login(String enteredUserName, String enteredPassWord) {
		return enteredUserName.equals(actualUserName)&& enteredPassWord.equals(actualPassWord);
	}
	
	public boolean signUp(String enteredUserName, String enteredPassWord, double enteredBalance) {
		
		if (enteredUserName.length()>15) {
			return false;
		}else{
		
		actualUserName=enteredUserName;
		actualPassWord=enteredPassWord;
		actualAccountBalance=enteredBalance;
		return true;
	}
	}
	
	
	boolean transferFunds(String PassWord, double enteredAccountBalance) {
		if(PassWord.equals(actualPassWord)&& enteredAccountBalance<=actualAccountBalance){
			
			actualAccountBalance=actualAccountBalance-enteredAccountBalance;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
}
