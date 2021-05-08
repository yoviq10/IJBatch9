package com.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryandCatch {


    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Important code");
        System.out.println("Important code");

        String path = "C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\UserData.xlsx";
        try {
            System.out.println("Inside try block");
            FileInputStream fileInputStream = new FileInputStream(path); //if path is correct it will execute thr try block amd skip catch block

        }catch (FileNotFoundException fileNotFoundException){ //will only execute when specific error is encountered
            System.out.println("Catch Block");
        }
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
        System.out.println("Important code after try catch");
    }

}