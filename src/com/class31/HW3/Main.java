package com.class31.HW3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Remove duplicate names

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        Set<String > set =new LinkedHashSet<>(aList); //will convert list to a set, all duplicates removed
        ArrayList<String> removedElements = new ArrayList<>(set);
        System.out.println(removedElements); //prints out: John, Jane, James, Jasmine
    }
}
