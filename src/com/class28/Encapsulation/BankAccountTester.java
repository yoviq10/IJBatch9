package com.class28.Encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount("Asghar", "abc","123",1000);
        bankAccount.login("abc","123");
      //  bankAccount.password="456"; CE
        System.out.println(bankAccount.getBalance("abc","123"));


    }

}
