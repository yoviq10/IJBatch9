package com.class23;

public class parentOverriding {

    public void printSomething(){
        System.out.println("parent");
    }
}


class Child extends parentOverriding{  //created another class within a class

    public void printSomething() {
        System.out.println("child");
    }

    public static void main(String[] args) {

        Child child=new Child();

        child.printSomething();
    }


}