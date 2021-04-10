package com.class28.Abstraction;

public abstract class Parent {

    protected abstract void method1();
    final void method2(){
        System.out.println("I am a final method inside an abstract class");
    }

}

class Child extends Parent{

    @Override
    public void method1() {
        System.out.println("Abstract method");
    }
}
