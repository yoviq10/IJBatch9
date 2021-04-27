package com.class32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        HashMap<Integer, String> students=new HashMap<>();
        students.put(1,"Karina");
        students.put(2,"Roheen");
        students.put(3,"Bryan");
        students.put(4,"Ariana");

        Collection<String> values= students.values();  //values will return a collection
        for (String student: values) {
            System.out.println(student);  //will now get all the values
        }

        System.out.println("--printing values & keys with For lOOP");
        Set<Integer> keys= students.keySet();
        for (Integer key:keys) {    //use loops to iterate through all values
            System.out.println(key + " " + students.get(key));  //printing values

        }

        System.out.println("--printing ONLY keys with For lOOP");
            Set<Integer> Keys = students.keySet();
            for (Integer key: keys){
                System.out.println(key);
            }






    }
}
