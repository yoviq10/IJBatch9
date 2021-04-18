package com.class30;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo2 {
    public static void main(String[] args) {

        //remove duplicates from an array
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(102);
        arrayList.add(10);
        arrayList.add(120);
        arrayList.add(120);
        arrayList.add(100);
        arrayList.add(100);

        Set<Integer>set=new LinkedHashSet<>(arrayList);
        ArrayList<Integer> removedElements=new ArrayList<>(set);
        System.out.println(removedElements);

        //or with Treeset similar to HashSet, but in order
        Set<Integer>set1=new TreeSet<>(arrayList);
        ArrayList<Integer> removedElements1=new ArrayList<>(set1);
        System.out.println(removedElements1);



    }
}
