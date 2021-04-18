package com.class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        subjects.add("Manual Testing"); //index 1
        subjects.add("Java"); //index 2
        subjects.add("Git"); //index 3
        subjects.add("Selenium"); //index 4
        subjects.add("TestNG"); //index 5
        System.out.println(subjects);

        for (String subject:subjects
             ) {
            System.out.println(subject);
        }
        subjects.remove("Selenium");
        System.out.println(subjects);
        subjects.add(4,"Selenium");
        System.out.println(subjects);






    }
}
