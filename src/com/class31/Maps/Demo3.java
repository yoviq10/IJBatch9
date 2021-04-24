package com.class31.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo3 {
    public static void main(String[] args) {

        //linkedHash Map Maintains order insertion
        //type of string is key and type of double is value
        //MAPS don't contain duplicate keys so we used set below
        HashMap<String, Double> groceries= new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("Potato",10.0);
        Set<Map.Entry<String,Double>> entrySet=groceries.entrySet();  //returns us a Set and inside that set we have these entries, of type string & double //BECAUSE i WANT TO ITERATE THIS MAP
        for (Map.Entry<String,Double> entry: entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
