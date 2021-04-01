package com.class24;

public class Car {
    String make;
    String model;
    void start(){
        System.out.println("use the key to start me");
    }
    void stop(){
        System.out.println("use the breaks to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}

    class BMW extends Car {
    void start() {
        System.out.println("use the button to start me");
    }
    void drifting(){
        System.out.println("I can drift really good in the rain");  //won't get printed in Test class
    }
}

    class Tesla extends Car{
    void start(){
        System.out.println("use app to start me");
    }
    void park(){
        System.out.println("park me using sensor and camera");
    }
}
    class Toyota extends Car{

}