package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class HWReview {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("10");
        words.add("negotiation");
        words.add("love");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("help");
        Iterator<String> iterator=words.iterator(); //creating iterator
        System.out.println(words);
        //best practice
        while(iterator.hasNext()){
            String word=iterator.next();
            if(word.endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(words);


    }
}
