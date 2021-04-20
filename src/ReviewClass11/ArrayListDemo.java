package ReviewClass11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> cities=new ArrayList<>(); //Arraylist is implementing from list

        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Casablanca");

        for (String city:cities
             ) {
            System.out.println(city);
        }

        System.out.println("====2======"); //printing out the odd city names from list
        //in for loop
        for (int i = 0; i <cities.size() ; i++) {
            if(i%2==0) {
                System.out.println(cities.get(i));
            }
        }

        System.out.println("====3======");
        //with while loop

        int counter=0;  //declaring a variable
        while (counter<cities.size()){
            System.out.println(cities.get(counter));
            counter++;  //stops the repetition
        }

        System.out.println("====4======");
        //with Iterator

        Iterator<String> iterator=cities.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());  //to call next name on list or all list
        }

    }
}
