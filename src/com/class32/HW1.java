package com.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW1 {
    public static void main(String[] args) {

    /*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.
    */
        Map<String, String> countries = new TreeMap<>();
        countries.put("Tokyo","Japan");
        countries.put("Washington DC","USA");
        countries.put("Beijing","China");
        countries.put("Seoul","South Korea");

        System.out.println("--printing values & keys with For lOOP");
        Set<String> count= countries.keySet();
        for (String key:count) {    //use loops to iterate through all values
            System.out.println(key+" "+countries.get(key));  //printing values
        }
        System.out.println("--printing values & keys Iterator way---");
        Iterator<String> iterator= count.iterator();
        while (iterator.hasNext()){
            String country=iterator.next();
            System.out.println(country+" "+ countries.get(country));
        }
        System.out.println("--Printing only values with for loop---");
        Set<Map.Entry<String, String>>set=countries.entrySet();
        for (Map.Entry<String, String> country:set) {
            System.out.println(country.getValue());
        }
        System.out.println("--Printing only values with Iterator---");
        Iterator<String> iterator1= count.iterator();
        while (iterator1.hasNext()){
             String country=iterator1.next();
            System.out.println(countries.get(country));
        }

        System.out.println("===Another Way=====");
        Map<String,String> countries1=new TreeMap<>();
        countries1.put("Ukraine","Kiev");
        countries1.put("United States","Washington DC");
        countries1.put("Albania","Tirana");
        countries1.put("Algeria","Algiers");
        countries1.put("Angola","Luanda");
        countries1.put("Mali","Bamako");
        countries1.put("Malta","Valletta");
        countries1.put("Mexico","Mexico City");
        countries1.put("Morocco","Rabat");
        countries1.put("Nepal","Kathmandu");

        Set<String>mapCountries=countries1.keySet();
        for(String key:mapCountries){
            System.out.println(key+": "+countries1.get(key));
        }

        System.out.println("--printing values & keys Iterator way---");
        Iterator<String> it=mapCountries.iterator();
        while(it.hasNext()){
            String country= it.next();
            System.out.println(country+" "+countries.get(country));
        }




    }
}
