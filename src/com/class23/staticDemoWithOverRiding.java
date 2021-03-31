package com.class23;

public class staticDemoWithOverRiding {

    static void printInfo(String name){

        System.out.println("name from parent "+name);
    }
}
class child extends staticDemoWithOverRiding {
    static void printInfo(String name) {
        System.out.println("name from child " + name);
    }

    public static void main(String[] args) {
        child.printInfo("yovanna"); //taking info from child class above
    }
}

//output: name from child yovanna