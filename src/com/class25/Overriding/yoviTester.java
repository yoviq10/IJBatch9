package com.class25.Overriding;

public class yoviTester {
    public static void main(String[] args) {

        FatherOverriding obj1=new FatherOverriding("Carlos");
        obj1.eat();  //will print out from parent class
        obj1.sleep();


        FatherOverriding obj2=new ChildYovi("Yovanna"); // Will print out from childyovi class since object was changed
        obj2.eat();
        obj2.sleep();


        FatherOverriding obj3=new Ozoda("Ozoda"); // Will print out from ozoda child class since object was changed
        obj3.eat();
        obj3.sleep();






    }
}
