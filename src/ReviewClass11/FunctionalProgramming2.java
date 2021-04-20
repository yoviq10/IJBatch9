package ReviewClass11;

import java.util.ArrayList;

public class FunctionalProgramming2 {
    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("DC");
        cities.add("KIEV");
        cities.add("MOSCOW");
        cities.add("LA");
        cities.add("NEW YORK");
        cities.add("MIAMI");
        System.out.println(cities);
/*

       int counter=0;
        for (String city:cities
             ) {
            if(city.contains("M")){
                counter++;
            }
        }
        System.out.println(counter);
*/

        //longer way,
        System.out.println(cities.stream().filter(city->city.contains("M")).count());



    }
}
