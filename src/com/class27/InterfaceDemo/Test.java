package com.class27.InterfaceDemo;

public interface Test {

    int number=10;
    void display();

    static void method1(){
        System.out.println("Hi I am a static method");
    }

    default void method2(){   //default here is not an access modifier, it's something different
        System.out.println("I am a default method");
    }


}
