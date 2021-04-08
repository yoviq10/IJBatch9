package com.class27.Demo2;

public abstract class Vehicle {   //should be an abstract class

    String vin_number;
    static int totalVehicle;

    Vehicle(String vin_number){
        totalVehicle++; //counting
        this.vin_number=vin_number;
        System.out.println("Grandparent constructor is called");
    }

    public void totalVehiclesCreated(){
        System.out.println("We build "+totalVehicle+" Vehicle");
    }
    public void drive(){
        System.out.println("Vehicle can drive");
    }
    public void stop(){
        System.out.println("Vehicle can stop");
    }
    public abstract void start();  //abstract method from parent class
    }

    abstract class Car extends Vehicle{

        String carType;
        Car(String vin_number, String carType){
            super(vin_number); //accessing vin number from parent class
            this.carType=carType;
            System.out.println("Parent constructor called");
        }

        @Override
        public void drive() {
            System.out.println("Car can drive");
        }

        public abstract void speed();  //abstract from child class
    }

    class BMW extends Car{

    String make;
    String model;

    BMW(String vin_number, String carType, String make, String model){
        super(vin_number, carType);
        this.make=make;
        this.model=model;
        System.out.println("grandchild constructor called");
    }
        @Override
        public void start() {
            System.out.println("BMW can start with remote");
        }

        @Override
        public void speed() {
            System.out.println("BMW can go max speed 300K/H");
        }
        public void display(){
            System.out.println("We build "+make+" Model "+model+" "+carType+" "+vin_number);
        }
    }

    class Toyota extends Car{

    String make;
    String model;

    Toyota(String vin_number, String carType, String make, String model){
        super(vin_number, carType);
        this.make=make;
        this.model=model;
    }

        @Override
        public void start() {
            System.out.println("Toyota can also start with remote");
        }

        @Override
        public void speed() {
            System.out.println("Toyota can go up tp 200Km/H");
        }

        void display(){
            System.out.println("We build "+make+" Model "+model+" "+carType+" "+vin_number);
        }
    }