package com.class29;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        subjects.add("Manual Testing"); //index 1
        subjects.add("Java"); //index 2
        System.out.println(subjects.contains("SDLC"));  // will print out true
        System.out.println(subjects.contains("Selenium"));  //false




    }
}
