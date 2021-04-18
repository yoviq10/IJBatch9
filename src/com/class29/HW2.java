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

        //the right way with iterator
        ArrayList<String> words1=new ArrayList<>();
        words1.add("10");
        words1.add("negotiation");
        words1.add("love");
        words1.add("nine");
        words1.add("great");
        words1.add("like");
        words1.add("help");
        Iterator<String>iterator=words1.iterator(); //creating iterator
        System.out.println(words1);
        //best practice
        while(iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
              iterator.remove();
            }
        }

        System.out.println(words1);



    }
}
