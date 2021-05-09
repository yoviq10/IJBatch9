package com.class34;

import java.util.ArrayList;
import java.util.List;

public class HW2 {

    public static List<Exception> getExceptionList() {

        /* Create a static method that will return a List of Exceptions.
       Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
       Call your method inside main and print name and details of all Exception objects.
    */

        List<Exception> list=new ArrayList<>();  //List=Interface & Array=class..storing Arraylist inside List like inheritance, both can be ArrayList
        try{
            System.out.println(10/0);
        }catch (ArithmeticException arithmeticException){
            list.add(arithmeticException);
        }
        try{
            String str=null;
            str.charAt(10);
        }catch (NullPointerException nullPointerException){
            list.add(nullPointerException);
        }
        try{
            int[]arr=new int[2];
            arr[5]=12;
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            list.add(arrayIndexOutOfBoundsException);
        }
        try{
            int num=Integer.parseInt("Test");
            System.out.println(num);
        }catch (NumberFormatException numberFormatException){
            list.add(numberFormatException);
        }

        return list;

    }

    public static void main(String[] args) {


        for (Exception e:getExceptionList()) {
            System.out.println(e.getMessage()); //only description of errors
            System.out.println(e); //package name + class name + description
            e.printStackTrace();//complete stacktrace

        }



    }
}
