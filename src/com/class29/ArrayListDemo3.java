package com.class29;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        subjects.add("Manual Testing"); //index 1
        subjects.add("Java"); //index 2
        System.out.println(subjects);

        ArrayList<String> subjects2=new ArrayList<>();

        subjects2.add("Git"); //index 0
        subjects2.add("Selenium"); //index 1
        subjects2.add("TestNG"); //index 2


        //We will merge both objects from both arrays to a single array
         subjects.addAll(subjects2);
        System.out.println(subjects);

        //you can also place the elements in a certain area like up front by using INDEX
        subjects.addAll(0,subjects2);
        System.out.println(subjects);

        subjects.clear(); //will remove the total no of element from the collection
        System.out.println(subjects);

    }
}
