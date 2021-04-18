package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HWReview3 {
    public static void main(String[] args) {

        //4.)Create an arrayList of even numbers from 1 to 50.
        // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers=new ArrayList<>();

        for (int i = 1; i <=50 ; i++) {
            if(i%2==0){
                numbers.add(i);
            }
        }

        System.out.println(numbers); //Prints out even numbers 2-50
        Iterator<Integer> iterator= numbers.iterator();
        while(iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }

        System.out.println(numbers); //prints out numbers by 5






    }
}
