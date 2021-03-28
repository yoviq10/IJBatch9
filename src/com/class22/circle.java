package com.class22;

public class circle extends shape {


    circle(double radius){
        super(radius);
    }


    void calculateArea(){
        System.out.println(Math.pow(radius,2)*Math.PI);
        System.out.println(radius*radius*3.14);
    }

    public static void main(String[] args) {

        circle circleObj=new circle(2);
        circleObj.calculateArea();



    }


}
