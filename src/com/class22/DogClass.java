package com.class22;

public class DogClass extends Animal {

    String breed;


    DogClass(){
        System.out.println("child");
    }

    DogClass(String name, int age, String color, String breed){

       super(name, age, color);
       this.breed=breed;

    }

    void printInfo(){
        System.out.println(name+"age"+"breed"+breed);
    }

}
