package com.class23;

public class sampleTask3 {

    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.


    static void printInfo(String name){
        System.out.println(name);
    }
    static void printInfo(String name, String address){
        System.out.println(name+address);
    }
    static void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+address+phoneNumber);
    }

    public static void main(String[] args) {

        printInfo("yovi");
        printInfo("yovi"," address 123");
        printInfo("yovi"," address 123","1234567");
    }

}
