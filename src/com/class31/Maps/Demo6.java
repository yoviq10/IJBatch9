package com.class31.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo6 {
    public static void main(String[] args) {

        //remove anything with the letter "o"

        HashMap<String, Double> groceries= new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("Potato",10.0);
        System.out.println(groceries);

        //Lamda functional programming shorter way
        //removing that element if contains "o"
        groceries.keySet().removeIf(key -> key.contains("o"));
        System.out.println(groceries);  //prints out eggs=12.0 and Milk=15.0


        //THE OTHER WAY
        Iterator<String> iterator=groceries.keySet().iterator();
        while(iterator.hasNext()){
            String key= iterator.next();
            if(key.contains("o")){
                iterator.remove(); //removing that element if contains "o"
            }
        }
        System.out.println(groceries);  //prints out eggs=12.0 and Milk=15.0



    }
}
