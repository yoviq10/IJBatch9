package com.class25.Overriding;

public class StaticOverRiding {

    static void printInfo(){
        System.out.println("bla bla");
    }

}

class Child extends StaticOverRiding{

    static void printInfo(){
        System.out.println("blah blah from child class");
    }

    //static void printInfo(){  Compiler Error because no static
      //  System.out.println("blah blah from child class");
    }




