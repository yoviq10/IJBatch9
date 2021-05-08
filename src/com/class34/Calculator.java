package com.class34;

public class Calculator {

    public void Calculate(){
        System.out.println(10/0);
        String name=null;
        name.length();
    }
}


/*
Example: accessing a file from remote location could possibly throw file not found exception
        It is the programmer's responsibility to handle the checked exception for successful compilation
        So,if any exception is raised during execution then respective handling code will be executed **
        Note: if it isn't handled then program will throw compile-time error*/

  //  Checked means try and catch and unchecked means like if else

    //unchecked exception can be handle by dev but check exception can not be handle by programmer
