package com.class31.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class demo4 {
    public static void main(String[] args) {


        HashMap<String, Double> groceries= new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("Potato",10.0);
;

//getting all set of keys from map, and go 1 by 1 using the get method will get the next value
        Set<String> mapKeys= groceries.keySet();
        for (String key:mapKeys) {    //use loops to iterate through all values
            System.out.println(key+" "+groceries.get(key));  //printing values
        }



    }
}
