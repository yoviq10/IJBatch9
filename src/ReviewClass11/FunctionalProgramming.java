package ReviewClass11;

import java.util.ArrayList;

public class FunctionalProgramming {
    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("DC");
        cities.add("KIEV");
        cities.add("MOSCOW");
        cities.add("LA");
        cities.add("NEW YORK");
        cities.add("MIAMI");
        System.out.println(cities);

     cities.removeIf(city-> city.contains("M")); //removing cities with "M" if true
        System.out.println(cities);





    }
}
