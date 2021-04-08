package com.class25.Overriding;

public class ChildYovi extends FatherOverriding{

    ChildYovi(String name){
        super(name);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+" likes beans as well");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println(name+" likes to sleep 12 hours");
    }
}
