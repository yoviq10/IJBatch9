package com.class23;

import java.util.concurrent.Callable;

public class ConstructorOverLoading {



    //with different amount of parameters
    ConstructorOverLoading(){         //Example 1  has no para.
        System.out.println("I am non-argument constructor");
    }

    ConstructorOverLoading(String str){    //example 2  has 1 para.
        System.out.println("I am constructor with 1 String parameter");
    }


    //having different types of parameters
    ConstructorOverLoading(int num){
        System.out.println("I am a constructor with 1 int parameter");
    }



}
