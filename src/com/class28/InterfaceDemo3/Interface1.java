package com.class28.InterfaceDemo3;

public interface Interface1 {

    void method();
}
 interface Interface2{
    void method();
 }

 class Child implements Interface1,Interface2{

     @Override
     public void method() {   //Does not matter which method it is being called from since it will be same
         System.out.println("Same method for all the interface ");
     }
 }