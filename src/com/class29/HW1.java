package com.class29;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {

        /*  Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
         */


        ArrayList<String> names=new ArrayList<>(); //storing only Strings
        names.add("Yovanna");  //index 0
        names.add("Diana"); //index 1
        names.add("Michelle"); //index 2
        names.add("Brian"); //index 3
        names.add("yovi"); //index 4
        System.out.println(names);

        System.out.println(names.isEmpty()); //false, it's not empty
        System.out.println(names.contains("Yovanna"));  // will print out true
        System.out.println(names.size()); //size of array = 6
    }










}
