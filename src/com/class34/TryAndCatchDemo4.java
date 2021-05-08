package com.class34;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryAndCatchDemo4 {

    public static void main(String[] args) throws FileNotFoundException {

        int[] arr={10,20};
        try{
            System.out.println(arr[5]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bound");
        }

        String name=null;

        if(name!=null){
            name.length();
        }else{
            System.out.println("Null Object");
        }

        System.out.println("...checking if file exists.....");

        String path = "C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\UserData.xlsx";

        File file=new File(path);
        if(file.exists()){
            System.out.println("File found");
            FileInputStream fileInputStream=new FileInputStream(path);
        }else{
            System.out.println("Null Object");
        }
    }


}
