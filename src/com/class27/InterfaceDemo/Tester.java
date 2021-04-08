package com.class27.InterfaceDemo;

public class Tester implements Test {

    @Override
    public void display() {
        System.out.println("Blah blah blah");

    }

    public static void main(String[] args) {

        Test test = new Tester();
        test.display();
        test.method2();
        Test.method1();
    }
}