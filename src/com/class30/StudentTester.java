package com.class30;

import java.util.ArrayList;

public class StudentTester {
    public static void main(String[] args) {

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"Amna",35));
        students.add(new Student(2,"Aman",25));
        students.add(new Student(3,"Ksenia",105));
        students.add(new Student(4,"Azfal",35));
        students.add(new Student(5,"Asghar",18));
        students.add(new Student(6,"Nazir",40));

        Student student=new Student(3,"Ksenia",105); //creating a new Object

        students.remove(student); //removing Ksenia
        System.out.println(students);


        Student student1=new Student(5,"Asghar",18);
        students.remove(student1); //removing Asghar and Ksenia should already be removed
        System.out.println(students);
    }
}
