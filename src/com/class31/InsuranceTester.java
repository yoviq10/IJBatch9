package com.class31;

import java.util.ArrayList;

public class InsuranceTester {
    public static void main(String[] args) {

        Car car=new Car("Geico","Tesla");
        Pet pet=new Pet("Geico","Dog");
        Health health=new Health("AAA");
        ArrayList<InsuranceHW> arrayList=new ArrayList<>();
        arrayList.add(car);
        arrayList.add(pet);
        arrayList.add(health);
        for (InsuranceHW insurance:arrayList) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }

}
