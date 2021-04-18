package com.class29;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        subjects.add("Manual Testing"); //index 1
        subjects.add("Java"); //index 2
        //subjects.add("TestNG"); will print out false with this

       ArrayList<String> allSubjects=new ArrayList<>();
        allSubjects.add("SDLC");  //index 0
        allSubjects.add("Manual Testing"); //index 1
        allSubjects.add("Java"); //index 2

        System.out.println(allSubjects.containsAll(subjects)); // will print out TRUE







    }
}
