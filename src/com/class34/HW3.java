package com.class34;

public class HW3 {
    public static void main(String[] args) {

        /*Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
    */

        int x=10;
         if(x<16){
            throw new RuntimeException("You should study"); //with info about issue and line will print automatically for us
             //System.out.println("Error you should study"); NOT PREFERRED way, you don't get info of issues
         }else{
             System.out.println("You should work");
         }




    }
}
