package com.class23;

public class calculatorMethodOverLoading {

    //based on arguments/ compiler will execute that method
    // (which ever one looks close enough to main method)

    public static void main(String[] args) {
        System.out.println("1");
        main("one");   //will look for method with String parameters, line 12
    }   //so line 8 and line 12 will print out instead of line 9

    public static void main(String args) {
        System.out.println("2");
    }

    public static void main(int args) {
        System.out.println("3");
    }

    public static void main(String args, int a) {
        System.out.println("4");
    }


}
