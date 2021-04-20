package ReviewClass11;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {


        LinkedList<String> cities =new LinkedList<>();
        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Casablanca");

         System.out.println(cities.getFirst());//gets first name of list
       System.out.println(cities.getLast()); //gets last name of list

        System.out.println("===reverse order===");
        Iterator<String> iterator=cities.descendingIterator(); //reverse order
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
