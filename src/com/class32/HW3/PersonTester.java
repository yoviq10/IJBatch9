package com.class32.HW3;

import java.util.Collection;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {


        TreeMap<Integer, Person> treeMap=new TreeMap<>(); //inserting Person from other class
        treeMap.put(1,new Person("Jahanzeb","Shah",25, 10000));
        treeMap.put(2,new Person("Eugene","Markadanov",28, 12000));
        treeMap.put(3,new Person("Tijana","Rakic",18, 11000));
        Collection<Person> personCollection= treeMap.values(); //inserting Person from line 10
        for (Person person: personCollection) {
           // person.printDetails();
        }

    }
}
