package com.class32;

import java.util.ArrayList;

public class HW6 {
    public static void main(String[] args) {

        /*Create a collection of integers in which you can keep duplicates.
          Write a logic to find sum of all integers
           */


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(22);
        arrayList.add(120);

        Integer sum=0;

        for (Integer num: arrayList) {
            sum+=num;
        }

        System.out.println(sum); //prints out 181  all added up


    }
}
