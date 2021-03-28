package com.class22;

public class Animal {

    String name;
    int age;
    String color;


    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    public Animal(){
        System.out.println("parent");
    }

}
