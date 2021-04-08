package com.class27.Demo2;

public class VehicleTester {
    public static void main(String[] args) {

        BMW bmw=new BMW("123ysq","coupe","BMW","M4");

        bmw.start(); //BMW can start with remote
        bmw.stop();  //vehicle can stop comes from grandfather class
        bmw.speed(); //  BMW can go max 3000km/H
        bmw.drive();//  Car can drive
        bmw.display();// We build bmw model m4 coupe 123ysq


        Vehicle vehicle=new Toyota("1234","coupe","Toyota","Supra");
        vehicle.drive();
        vehicle.start();
     //   vehicle.display(); CE ERROR


        Car car=new Toyota("1234","coupe","Toyota","supra");
        car.speed();
    }
}
