package com.class25.CastingDemo;

public class AnimalTester {
    public static void main(String[] args) {

        Animal animal=new Cat();
        animal.eat();
        animal.sleep();
     //   animal.speak(); no place to hold from Cat class
       //Narrowing loss of data


        Cat cat=(Cat) animal; //forcing ()
        //so everything gets inherit from cat and animal class
        //converting animal to cat class
        cat.speak();
    }




}
