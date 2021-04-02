package com.class24;

import ReviewClass7.MethodsDemo1;

public class MethodDemo1TesterOnanotherPackage extends MethodsDemo1 {

    public static void main(String[] args) {

        MethodsDemo1.method1();
        // MethodsDemo1.method2(); not accessible because
        MethodsDemo1.method3();
        //MethodsDemo1.method4();  error because of Private in other package and can't leave its class

        MethodsDemo1 method5 = new MethodsDemo1();
     //   method5.method5(); error because its leaving its class/package


    }






}
