package com.class29;

import java.util.ArrayList;

public class HWThreeAndFour {
    public static void main(String[] args) {

        //3.)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks=new ArrayList<>(); //storing only Strings
        drinks.add("Pepsi");  //index 0
        drinks.add("Coca Cola"); //index 1
        drinks.add("Orange Juice"); //index 2
        drinks.add("Apple Juice");

        if(drinks.contains("a" )|| drinks.contains("e")){

        }




        drinks.set(0,"Water");
        System.out.println(drinks);

        drinks.set(2,"Water");
        System.out.println(drinks);

        drinks.set(3,"Water");
        System.out.println(drinks);





        //4.)Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(2); //index 0
        numbers.add(4); //index 1
        numbers.add(6); //index 2










    }
}
