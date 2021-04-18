package com.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class HWThreeAndFour {
    public static void main(String[] args) {

        //3.)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks=new ArrayList<>(); //storing only Strings
        drinks.add("fanta"); //index 0
        drinks.add("juice"); //index 1
        drinks.add("beer"); //index 2
        drinks.add("sprite"); //index 3
        drinks.add("cola"); //index 4
        drinks.add("soda"); //index 5
        //with advance loop
         for (String drink:drinks
             ) {
        if(drink.contains("a")|| drink.contains("e")){
           drinks.set(drinks.indexOf(drink),"water"); //replacing it with water
          }
         }
         System.out.println(drinks);

         //Something Random I did
         //drinks.set(0,"Water");
        //System.out.println(drinks);

        //drinks.set(2,"Water");
        //System.out.println(drinks);

        //drinks.set(3,"Water");
        //System.out.println(drinks);



        //4.)Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers=new ArrayList<>();

        for (int i = 1; i <=50 ; i++) {
            if(i%2==0){
                numbers.add(i);
            }
        }

        System.out.println(numbers); //Prints out even numbers 2-50
        Iterator<Integer> iterator= numbers.iterator();
        while(iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }

        System.out.println(numbers); //prints out numbers by 5




    }
}
