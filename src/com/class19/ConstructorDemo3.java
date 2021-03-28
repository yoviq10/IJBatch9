package com.class19;

public class ConstructorDemo3 {

    String name;
    ConstructorDemo3(){
        System.out.println("Empty parameter constructor");
    }

    ConstructorDemo3(String name){
        this();
        System.out.println("parameterized constructor");
    }

    public static void main (String[] args){

       // new ConstructorDemo3();
        new ConstructorDemo3("Yovanna");




    }




}
