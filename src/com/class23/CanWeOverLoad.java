package com.class23;

public class CanWeOverLoad {

    //can we overload a private Method?   ANSWER YES

    private void methodOne(){
        System.out.println("I am a method 1");
    }
    private void methodOne(String str){
        System.out.println("I am a method one with"+ str);
    }

    //Can we overload a main method? ANSWER YES, just change the type or number of parameters
    //Can we overload a static method? ANSWER YES, change type or # of parameters
    public static void main(String[] args) {
        System.out.println("I am a main method with String Array");

        main("String"); //to call "I am main method with string arguments/parameters"

        String [] array={"A","B"};// to call "I am main method with 2 parameters)
        main("Hello", array);
    }

    public static void main(String str){
        System.out.println("I am a main method with String arguments/parameters");
    }

    public static void main(String str,String[] args) {   //another form of Main method of overloading >>Main with 2 parameters
        System.out.println("I am a main method with 2 parameters");
    }
//compiler looks at your method signature, Will first print out " I am main method with String array" because of public static void main(String[] args) {
}
