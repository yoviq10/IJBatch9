package com.class32;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {


        Map<String, Integer> map =new HashMap<>(); //random values due to HashMap
        map.put("Apple", 10);
        map.put("orange", 12);
        map.put("Banana", 24);
        map.put("Mango", 20);
        map.put("Kiwi", 20);

        System.out.println(map);
        System.out.println(map.get("Mango")); //will print out 20
        System.out.println(map.remove("Banana")); // removed banana, prints only value since key was removed
        System.out.println(map);
        System.out.println(map.containsKey("Banana"));//will return false, since banana has been removed
        System.out.println(map.containsKey("orange"));//will print out true
        System.out.println(map.isEmpty()); //prints out false
        System.out.println(map.replace("Apple", 50)); //shows the value 10 from apple
        System.out.println(map); //replaces the 10 with 50 value: apple=50

    }
}
