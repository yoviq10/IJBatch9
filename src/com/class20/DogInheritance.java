package com.class20;

public class DogInheritance extends Animals{

   DogInheritance(String name){
       this.name=name;
   }

    void run(){
        System.out.println(name+" is running");
    }


    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }


}
