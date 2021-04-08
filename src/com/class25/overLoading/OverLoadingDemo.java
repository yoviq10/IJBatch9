package com.class25.overLoading;

public class OverLoadingDemo {

    void printInfo(String name){
        System.out.println("name "+name);
    }

    void printInfo(String name, String address){
        System.out.println("Name "+name+"Address "+address);
    }
    void printInfo(String name, int phoneNumber, String address){
        System.out.println("Name "+name+"Phone Number "+phoneNumber+"Address "+address);
    }







}
