package com.class23;

public class OverloadingTask {

    //Create a class in which create a methods that will calculate the volume (area)
    //of the: rectangle, Square, Box
    //use separate class to test your code

    public void area(int a, int b){
        System.out.println("area of rectangle is "+(a*b));
    }

    public void area(int a){
        System.out.println("Area of square is "+(a*a));
    }

    public void area(int a, int b, int c){
        System.out.println("Volume of a box is "+(a*b*c));
    }

}
