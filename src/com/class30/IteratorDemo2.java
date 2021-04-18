package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("TestNG");

        Iterator<String> iterator=subjects.iterator();
        while (iterator.hasNext()){  //while there are still elements in iterator
            System.out.println(iterator.next());// Prints all elements
        }
       // System.out.println(iterator.next());//ERROR, already consumed elements, you need to create another ITERATOR

    }
}
