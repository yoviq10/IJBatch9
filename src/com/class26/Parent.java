package com.class26;

//public final class Parent{ } won't be able to inherit from parent class (Final)
public class Parent {

    final void method1(){
        System.out.println(" No child is allowed to change me");
    }

    final void method1(String name){   //WE CAN OVERLOAD WITH FINAL
        System.out.println(" No child is allowed to change me");
    }
}

class Child extends Parent{

 //   @Override                ERROR CAN'T OVERRIDE since final is with method in PARENT class line 5
  //  void method1() {
   //     System.out.println(" from child class");

}
