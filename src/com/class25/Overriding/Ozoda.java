package com.class25.Overriding;

public class Ozoda extends FatherOverriding {

    public Ozoda(String name){
        super(name);
    }

    @Override
    void sleep() {
        System.out.println(name+" like to sleep "+16);
    }

    @Override
    void eat() {
        super.eat();
        System.out.println(name+"likes to eat burger");
    }
}
