package com.class32.file;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws IOException {

        //properties extends HashTable Map, which contain key value pairs

   String path ="C:\\Users\\yoviq\\IdeaProjects\\Java Batch 9\\Files\\Configuration.properties";
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path); //
        Properties properties=new Properties(); //creating a connection
        properties.load(fileInputStream);//opening file "fileinputStream"
        System.out.println(properties.get("URL"));//program will read data from file
        System.out.println(properties.get("userName"));
        int iterations= Integer.parseInt(properties.getProperty("loop")); //cast to int

        for (int i = 0; i <iterations ; i++) {  //will loop 10 times, depending on what was inserted in file
            System.out.println("Dynamic program");

        }

        FileOutputStream fileOutputStream=new FileOutputStream(path); //need to mention path
        properties.setProperty("name","Ghulam");
        properties.store(fileOutputStream,"Added new property in the file");

    }
}
;