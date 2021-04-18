package com.class29;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {

        //Arrays  have consecutive memory location, pointed by a single variable

        int a=2147483647;
        //double [] array=new double[2147483647];

        String [] names=new String[2];
        names[0]="Monika";  //1st element
        names[1]="Yanci";  //2nd element
       // names[2]="MJ"; //3rd element >CE no space to hold this index (ArrayIndexOutOf Bounds)

        //names=new String[3]; //this does not resolve issue by just adding one more
       // System.out.println(Arrays.toString(names));  //will get Null Null

        String[] names2=new String[3];  //created new element with bigger size
        names2[0]=names[0];  //copied all values from first array here
        names2[1]=names[1];
        names2[2]="MJ";  //added MJ

        System.out.println(Arrays.toString(names)); //prints only Monika and Yanci
        System.out.println(Arrays.toString(names2)); //prints Monika,Yance, and MJ


        //functional programming

        int array[]={10,20,30,40,50,60};

        System.out.println( Arrays.stream(array).sum()); //prints out the sum of array

    }

}
