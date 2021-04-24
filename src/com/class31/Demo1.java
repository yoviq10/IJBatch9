package com.class31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>(1000); //

        LinkedList<String > LinkedLise=new LinkedList<>();


        //computer stores a special number based on the letter or special character
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Z");
        treeSet.add("B");
        treeSet.add("C");
        System.out.println(treeSet);
        treeSet.add("a");
        treeSet.add("d");
        treeSet.add("$");
        System.out.println(treeSet);//$,B,C,Z, a, d


        System.out.println("-----ANOTHER EXAMPLE---");
        TreeSet<String> treeSet1=new TreeSet<>();
        treeSet1.add("ABZ");
        treeSet1.add("AC");
        treeSet1.add("AD");
        System.out.println(treeSet1); //based on the second character
        //prints out ABZ,AC,AD

    }
}
