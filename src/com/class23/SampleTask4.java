package com.class23;

public class SampleTask4 {

   /*Create 1 class with a private method that has 3 overloaded forms.
   Then call each overloaded method with specific arguments and observe result.
    */


    private void printInfo(String name){
        System.out.println(name);
    }
    private void printInfo(String name, String address){
        System.out.println(name+address);
    }
    private void printInfo(String name, String address, String phoneNumber){
        System.out.println(name+address+phoneNumber);
    }

    public static void main(String[] args) {
        SampleTask4 sample=new SampleTask4();
        sample.printInfo("yovi");
        sample.printInfo("yovi"," address 123");
        sample.printInfo("yovi"," address 123","1234567");
    }














}
