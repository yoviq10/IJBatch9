package ReviewClass11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        List<String> cities=new ArrayList<>(); //Arraylist is implementing from list

        cities.add("Marrakech");
        cities.add("Chicago");
        cities.add("Orlando");
        cities.add("Virginia");
        cities.add("Palm Beach");
        cities.add("Casablanca");

        int index=cities.indexOf("Virginia"); ///converting an int index
        cities.add(index+1,"New York");// adding new york with index +1
        cities.add(0,"Alexandria"); //specifying index and will be inserted after that
        System.out.println(cities);// after insertion prints out: Alexandria,Marrakech, Chicago, Orlando, VA, ny, pb, casaBla..

        System.out.println(cities.size());//prints out size of array =8

        System.out.println(cities.indexOf("Chicago"));//gets first index of list
        System.out.println(cities.lastIndexOf("Chicago"));//gets last index of list

        System.out.println(cities.remove("jnlkjabflaj")); //will print out false, because garbage not in list
        System.out.println(cities.remove("Chicago"));//will print out True
        System.out.println(cities); //print out with chicago removed


        System.out.println("===SubList=====");
        //selecting a certain
        int firstIndex=2;
        int lastIndex=3;
        System.out.println(cities.subList(firstIndex,lastIndex)); //subList required 2 indexes



    }
}
