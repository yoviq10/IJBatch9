package com.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapsDemo4 {
    public static void main(String[] args) {

        LinkedHashMap<String,Double> items=new LinkedHashMap<>();
        items.put("soap",5.2);
        items.put("shirt",10.2);
        items.put("pillow",12.0);
        items.put("blanket", 8.3);
        System.out.println(items); //this items is a map

        //always use collection to retrieve all the values
        Collection<Double> values=items.values(); //converted items/map to collection
        Iterator<Double> iterator=values.iterator(); //from values, we got the iterator
        while(iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){ //if price ir more than 10, remove
                iterator.remove();
            }
        }
        System.out.println(items);//prints out soap=5.2, & blanket=8.3
    }
}
