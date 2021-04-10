package com.class28.InterfaceDemo2;

public class PersonTester {
    public static void main(String[] args) {

        SyntaxEmployee syntaxEmployee=new Emp(); //you can call all 4 syntax
        syntaxEmployee.sleep();
        syntaxEmployee.eat();
        syntaxEmployee.work();
        syntaxEmployee.teach();

        System.out.println("-----------------");
        Person person=new Emp();  //can only call sleep & eat
        person.sleep();
        person.eat();



    }
}
