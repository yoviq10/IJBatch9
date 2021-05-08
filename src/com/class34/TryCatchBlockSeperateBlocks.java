package com.class34;

public class TryCatchBlockSeperateBlocks {
    public static void main(String[] args) {
//you can also do nested try loops
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Can not divide by 0");
        }

        try{
            String name=null;
            System.out.println(name.indexOf(10));
        }catch (NullPointerException nullPointerException){
            System.out.println("Null Object");
        }

    }

}
