package com.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW2 {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
         item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
         Retrieve all keys and values from a Best Buy map using EntrySet.
          */
        Map<Integer, String> bestBuyMap = new LinkedHashMap<>();
        bestBuyMap.put(0112245,"Printer");
        bestBuyMap.put(122333,"TV");
        bestBuyMap.put(223358,"Movie");
        bestBuyMap.put(456330,"Laptop");
        bestBuyMap.put(884320,"PS5");

        //a set which inside contains another data structure that contains Map.Entry. Map.Entry can hold 2 vales at the same time
        // then we need to specify what kind of data to use, so Integer & String
        Set<Map.Entry<Integer,String>> entrySet=bestBuyMap.entrySet();  //returns us a Set and inside that set we have these entries //BECAUSE i WANT TO ITERATE THIS MAP
        for (Map.Entry<Integer,String> entry: entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println("----Iterator way------");
       Iterator<Map.Entry<Integer, String>> iterator = bestBuyMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry= iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
