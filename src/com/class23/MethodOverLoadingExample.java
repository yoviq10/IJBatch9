package com.class23;

public class MethodOverLoadingExample {
//Method OverLoading is having the same method name, within the SAME CLASS

//1) by passing different amount of parameters
    public void add(int num1, int num2){     //The add method
        System.out.println(num1+num2);
    }
    public void add(int num1, int num2, int num3){   //THE add method again on line 9
        System.out.println(num1+num2+num3);
    }


    //2) by having different types of parameters
    public void add(double num1,double num2){
        System.out.println(num1+num2);
    }

    public double add(int num1, double num2){
        double sum=num1+num2;
        return sum;                             //WITH RETURN TYPE
    }

    public void add(double num1, int num2){
        System.out.println(num1+num2);
}


    public static void main(String[] args) {

        MethodOverLoadingExample obj=new MethodOverLoadingExample();
        obj.add(12,13);   //arguments passing inside ()
        obj.add(12,13,14);
        obj.add(12.09,12.10);



        //method overloading is also built in Strings   (substring) with different actions being performed
        String str="hello";
        System.out.println(str.substring(3));
       System.out.println(str.substring(1,3));


    }



}
