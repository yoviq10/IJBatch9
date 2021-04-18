package com.class30;

import java.util.*;

public class SetsDemo {
    public static void main(String[] args) {

        Set<String> names=new HashSet<>(); //Upcasting, Hashset must have implements all from Set
        names.add("Afzal");
        names.add("Gul");
        names.add("Yarina");
        names.add("Caner");
        names.add("Ty");
        names.add("Gul");

        System.out.println(names); //will print out Gul only once, Set doesn't duplicate entries
        //insertion order is not the same too

        Set<String> names1=new LinkedHashSet<>(); //maintains insertion order, no duplicates
        names1.add("Afzal");
        names1.add("Gul");
        names1.add("Yarina");
        names1.add("Caner");
        names1.add("Ty");
        names1.add("Gul");
        System.out.println(names1);


        Set<String> names2=new TreeSet<>(); //Prints out alphabetically in order & no duplicates too
        names2.add("A");
        names2.add("G");
        names2.add("Y");
        names2.add("C");
        names2.add("T");
        names2.add("G");

        ArrayList<String> listFromSet=new ArrayList<>(names2);
        System.out.println(names2);
        for (String name: names2
             ) {
            System.out.println(name);
        }
        for (int i = 0; i < names2.size(); i++) {
            System.out.println(listFromSet.get(i));

        }

    }
}
