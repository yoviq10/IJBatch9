package com.class29;

import java.util.ArrayList;

public class IteratorDemo2 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        subjects.add("Manual Testing"); //index 1
        subjects.add("Java"); //index 2
        subjects.add("Git"); //index 3
        subjects.add("Selenium"); //index 4
        subjects.add("TestNG"); //index 5
        System.out.println(subjects);


        for (int i = 0; i < subjects.size() ; i++) {
            if(subjects.get(i).length()>4){
                subjects.remove(subjects.get(i));
            }
        }
        System.out.println(subjects);
    }
}
