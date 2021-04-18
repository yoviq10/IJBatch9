package com.class29;

import java.util.ArrayList; //comes from Java > then util (utilities) package> within there ArrayList

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> subjects=new ArrayList<>(); //storing only Strings
        subjects.add("SDLC");  //index 0
        System.out.println(subjects.size());//checks for the size of the array
        subjects.add("Manual Testing"); //index 1
        subjects.add("Java"); //index 2
        subjects.add("Git"); //index 3
        subjects.add("Selenium"); //index 4

        //With ArrayList, index's are automatically imported

        System.out.println(subjects.get(2)); //will get Java

        subjects.add("TestNG"); //index 5
        System.out.println(subjects.get(5)); //will get TestNG
       // System.out.println(subjects.get(6));//Runtime Error, NO 6 index

        System.out.println("Size before removal "+subjects.size());
        subjects.remove("Git");
        System.out.println("Size after removal "+subjects.size());


    }
}
