package com.class25.Overriding;

public class FatherOverriding {
    String name;
    FatherOverriding(String name){
        this.name=name;
    }

    void eat(){
        System.out.println(name+" Like to eat rice");
    }

    void sleep(){
        System.out.println(name+"like to sleep 6 hours");
    }

}
