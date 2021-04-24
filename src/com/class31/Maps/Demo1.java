package com.class31.Maps;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Azizi"); //index 0
        arrayList.add("Ram");  //index 1
        arrayList.add("Danilo"); // index 2
        arrayList.add("Mike"); //index 3
        //arrayList.indexOf("Mike");  >>> instead of indexof, use Maps

        Map<Integer, String> map = new HashMap<>();
        map.put(123456,"Azizi");
        map.put(123457,"Ram");
        map.put(123458,"Danilo");
        map.put(123459,"Mike");
        map.put(123410,"Jon");

        System.out.println(map.get(123458)); //specifying key, prints out Danilo
        System.out.println(map);// prints out keys and names


        System.out.println("---LinkedHash Map example---");
        //LinkedHashMap prints in order of insertion
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(123456,"Azizi");
        map1.put(123457,"Ram");
        map1.put(123458,"Danilo");
        map1.put(123459,"Mike");
        map1.put(123410,"Jon");
        System.out.println(map1);


        System.out.println("...Treemap Example...");
        //TreeMap prints based on order of Keys
        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(123456,"Azizi");
        map2.put(123457,"Ram");
        map2.put(123458,"Danilo");
        map2.put(123459,"Mike");
        map2.put(123410,"Jon");
        System.out.println(map2);

        map2.remove(123456);//removing by key
        System.out.println(map2);  // removed Azizi










    }
}
