package com.class26;

public class Task1 {

    final int number;   // you can either assign a constant value directly or
    int var1=20;

    Task1(int number){   //you can assign the value with constructor NOT METHODS
        this.number=number;
    }

   // void init(int number){ //Not through methods
     //   this.number=number;  //CE variable is final can not change it
   // }

    public static void main(String[] args) {

        final Task1 var1=new Task1(10);
        var1.var1=45555;

        final int[] a={10,20};
       // a={20,445};  CE can't change both at the same time
        a[1]=30; //this is just changing one index


    }
}
