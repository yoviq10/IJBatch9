package com.class29;

import java.util.ArrayList;

public class IteratorDemo {
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
            if(subject.length()>4){
                subjects.remove(subject); //RUNTIME ERROR
            }
        }

        System.out.println(subjects);

    }
}
