package com.class32;

import java.util.LinkedHashSet;
import java.util.Set;

public class HW5 {
    public static void main(String[] args) {
        /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
         */

        Set<String> set =new LinkedHashSet<>();
        set.add("Ram ");
        set.add("Bryan Espejo");
        set.add(" Darya Nazarenko");

        StringBuilder var= new StringBuilder();  //using string builder
        for (String name: set) {
            var.append(name);
        }
        System.out.println(var);

    }
}
