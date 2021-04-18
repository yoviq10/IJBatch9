package com.class30;

import java.util.ArrayList;

public class HWReview2 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("fanta"); //index 0
        drinks.add("juice"); //index 1
        drinks.add("beer"); //index 2
        drinks.add("sprite"); //index 3
        drinks.add("cola"); //index 4
        drinks.add("soda"); //index 5
        //with advance loop
      //  for (String drink:drinks
        //     ) {
          // if(drink.contains("a")|| drink.contains("e")){
            //   drinks.set(drinks.indexOf(drink),"water"); //replacing it with water
         //  }
     //  }

        //with for loop    (Both loops works)
       System.out.println(drinks);
        for (int i = 0; i <drinks.size() ; i++) {
            if(drinks.get(i).contains("e")|| drinks.get(i).contains("a")){ //the element on this index
               drinks.set(i,"water");  //will loop through each index
           }
        }

        System.out.println(drinks); //prints out now water


    }
}
