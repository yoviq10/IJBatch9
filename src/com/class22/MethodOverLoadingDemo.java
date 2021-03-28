package com.class22;

public class MethodOverLoadingDemo {

    void add(int a, int b){
        System.out.println(a+b);
    }

    void addDouble(double a, double b){
        System.out.println(a+b);
    }


    void addArrays(int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }


    void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }



    public static void main(String[] args) {
        MethodOverLoadingDemo MethodOverloading=new MethodOverLoadingDemo();
        MethodOverloading.add(10,20);
        MethodOverloading.addDouble(10.5,20.5);

        int[] arr={10,10,10};
        MethodOverloading.addDouble(10.5,20);
        MethodOverloading.addThreeNumbers(10,20,30);


    }

}
