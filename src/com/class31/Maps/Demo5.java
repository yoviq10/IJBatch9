package com.class31.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {

        HashMap<String, Double> groceries= new LinkedHashMap<>();
        groceries.put("eggs",12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("Potato",10.0);
        System.out.println(groceries);

        //we always USE SET IF WE USE LOOPS WITH MAP

        //removing values less than 15.0 by using Set:
        Set<String> mapKeys= groceries.keySet();
       Iterator<String> iterator= mapKeys.iterator();

       while (iterator.hasNext()){       //ypu can use while or for loop
           String key=iterator.next();
            Double value=groceries.get(key);
            if(value<=15){
                iterator.remove();
            }
       }

        System.out.println(groceries);  //prints out Tomato=35.0 since its not less than 0r equal to 15
    }
}
