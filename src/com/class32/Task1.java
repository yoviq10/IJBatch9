package com.class32;

import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {

        TreeMap<Integer,String> building=new TreeMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(1,"Google");
        building.put(3,"Google");
        building.put(1,"IBM");
        building.put(4,"Apple");
        building.put(10,"Amazon");
        System.out.println(building); //prints out the 5 keys/values
        System.out.println(building.get(1)); //will print out the last entry from top to bottom
        System.out.println(building.size());//gets the size # & prints out 5
        building.put(100, "Microsoft"); //put will increase the size, will add
        System.out.println(building);

        building.replace(4, "Netflix");
        System.out.println(building); //no more APPLE on 4th floor, replaced with NETFLIX

        building.remove(100); //removed microsoft
        System.out.println(building);

    }
}
