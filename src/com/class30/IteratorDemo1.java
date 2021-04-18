package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        //arraylist contains 2 elements
        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        subjects.add("Manual Testing"); //index 1

        System.out.println(subjects);

        //Iterator is an interface, stores object returned by iterator
        Iterator<String>iterator=subjects.iterator();  //returns iterator
        System.out.println(iterator.hasNext());//Prints out TRUE, there are 2 elements in your iterator
        System.out.println(iterator.next());//Prints out SDLC, you get elements by using next()
        iterator.remove();//SDLC is removed from list
        System.out.println(subjects); //prints results again from subject class
        System.out.println(iterator.hasNext());//Prints out TRUE, there are still elements in the list
        System.out.println(iterator.next());//advances to the next, Prints out Manual Testing
        System.out.println(subjects);//Prints results again [Manual Testing] since its still there
        System.out.println(iterator.hasNext());// Consumed all elements from list, Prints out FALSE, even though there is still an element, because you can only USE THEM ONCE
        //System.out.println(iterator.next());//No more elements, already consumed from iterator, can only happen once
        //System.out.println(iterator.remove()); //returns void, can't print CE

        iterator=subjects.iterator(); //creating a new Iterator
        System.out.println(iterator.hasNext());
    }
}
