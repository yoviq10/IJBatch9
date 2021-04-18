package com.class29;

import java.util.ArrayList;

public class CollectionsFrameworkDemo1 {
    public static void main(String[] args) {

    //we are not specifying size of Array
    //ArrayList helps us resolves issues of size, has so many building methods that arrays don't have

        ArrayList arrayList=new ArrayList();  //ArrayList is the name of the class>
        arrayList.add(10); //this is how we add snd store elements to array
        arrayList.add(20);
        arrayList.add(45);
       // arrayList.add("Mounia");

        System.out.println(arrayList.get(0)); //getting index of 0 = 10
        System.out.println(arrayList.size()); //Will print out size of Array


        Object[] objects=new Object[10];
        objects[0]="Strings";
        objects[1]=10;
        objects[2]='c';

    }
}
