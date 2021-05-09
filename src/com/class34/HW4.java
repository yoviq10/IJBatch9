package com.class34;

import java.util.Scanner;

public class HW4 {

    /*Create a method checkUserName that will throw a runtime exception.
    Method should throw an exception when entered username is less than 5 characters*/

    public static void checkUserName(String name){
        if(name.length()<5){
            throw new RuntimeException("Name should be more then 5 characters");
        }else{
            System.out.println("Valid input");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you user name");
        String name=scanner.nextLine();
        checkUserName(name);
    }

}
