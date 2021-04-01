package com.class24;

public class CarTester {
    public static void main(String[] args) {

        Car bmw=new BMW();   //Widening
        bmw.start();   //Method from child will be called because we have over Written behavior
        bmw.stop(); //Method from parent will be called because we have NOT over Written
        //bmw.drifting(); won't get printed from child class since (the drifting is not inherited parent class)

        //   BMW bmw1=new bmw;  This us Narrowing

        BMW bmw1=(BMW) bmw; //can call any methods in child and parent class since we converted our reference back to BMW
        bmw1.drifting();

        Car car=new Tesla();
       // BMW bmw2=(BMW) car;  "() means forcing and will get a RUN TIME Error when executing"
        //Because  BMW is not a tesla


    }


}
