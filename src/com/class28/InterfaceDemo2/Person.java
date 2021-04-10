package com.class28.InterfaceDemo2;

public interface Person {

    void sleep();
    void eat();
}

interface Employee{
    void work();
}

interface SyntaxEmployee extends Person,Employee{
   void teach();
}

class Emp implements SyntaxEmployee{   //pulls from person,employee A total of (3) interfaces
    @Override
    public void sleep() {
        System.out.println("Syntax employees sleep");
    }

    @Override
    public void eat() {
        System.out.println("Syntax employees eat");
    }

    @Override
    public void work() {
        System.out.println("Syntax employees work");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employees teach");
    }
}