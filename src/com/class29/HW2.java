package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    public static void main(String[] args) {

        //1.)Create an arraylist of cars and retrieve all the values using 3 different ways.
        ArrayList<String> cars=new ArrayList<>(); //storing only Strings
        cars.add("Mazda RX7");  //index 0
        cars.add("Honda NSX"); //index 1
        cars.add("Honda S2000"); //index 2

        System.out.println("---First way---");
        System.out.println(cars);  //1st way

        System.out.println("---Second way---");
        for (String car:cars  //2nd way
        ) {
            System.out.println(car);
        }

        System.out.println("-Third way--");
        for (int i = 0; i <cars.size() ; i++) { //3rd way
                System.out.println(cars.get(i));
            }


        //2.)Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> words=new ArrayList<>();
        words.add("we");
        words.add("Batch");
        words.add("Nine");

        words.removeIf(word -> word.contains("e"));  //prints out ONLY batch
        System.out.println(words);



    }
}
