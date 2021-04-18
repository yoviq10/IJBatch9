package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2Continued {
    public static void main(String[] args) {


        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("TestNG");

        Iterator<String> iterator=subjects.iterator();
        System.out.println(subjects);
        while (iterator.hasNext()) {  //Print out TRUE: while there are still elements in iterator
            String var = iterator.next();//only call the next method in a LOOP ONCE
            if (var.length() > 4) {
                iterator.remove(); //removing iterator from list
            }
        }
        System.out.println(subjects);
        /*
    Iterator. next=shows that the first element is present or not by true/false.
    Iterator.next =returns the value of first element.
    Iterator.remove= removes that element from list/Iterator, but it's present in the memory
         */
    }
}
