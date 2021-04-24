package com.class31.Maps;

import java.util.HashMap;

public class Demo2 {
    public static void main(String[] args) {

        //hashmap maintains NO ORDER
        HashMap<String, Double> groceries= new HashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("Potato",10.0);
        System.out.println(groceries);

        groceries.remove("tomato");
        System.out.println(groceries);  //tomato removed

        groceries.put(null, null);
        groceries.put("Rice",155.0);
        groceries.put("Apple",null);
        groceries.put("Orange", null);
        //groceries.put(null,22.0);  does not
        System.out.println(groceries); //we can have mulitple null values, but ONLY 1 KEY
    }
}
