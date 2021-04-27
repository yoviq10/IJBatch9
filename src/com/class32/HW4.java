package com.class32;

import java.util.HashMap;
import java.util.Set;

public class HW4 {
    public static void main(String[] args) {

/*Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000

*/
        HashMap<String, Integer> empMap = new HashMap<>();
        empMap.put("Alec Diaz", 120000);
        empMap.put("Anastasia", 130000);
        empMap.put("Afzal Rumon", 150000);
        empMap.put("Saleem Sadat", 100000);

        Set<String> empKeys = empMap.keySet(); //String because Strings are keys & we declared it up on line 15

        Integer maxSalary = Integer.MIN_VALUE;   //containing the minimum number that the Integer can hold. using Wrapper classes
       // Integer maxSalary = 0; or you can initialize the value by using 0

        String maxSalaryKey=" ";

        for (String key : empKeys) {
            if (empMap.get(key) > maxSalary) {
                maxSalary = empMap.get(key);
                maxSalaryKey = key;
            }
        }

        System.out.println(maxSalaryKey+" earns the max Salary "+ empMap.get(maxSalaryKey));

    }
}