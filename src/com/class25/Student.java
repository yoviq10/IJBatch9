package com.class25;

public class Student {

    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Write example of achieving run time polymorphism
     */

    void study(){
        System.out.println("Students must study");
    }
    void doHomework(){
        System.out.println(" Students must do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }


}

class SyntaxStudent extends  Student{

    @Override
    void doHomework() {
        System.out.println("Syntax students must do homework to succeed and get a job");
    }

    void practice() {
        System.out.println("Syntax students must practice additional 15 to 20 hours");
    }

    void doResearch(){
        System.out.println("Syntax students must do their own research");
    }
}

class CollegeStudent extends Student{

    @Override
    void doHomework() {
        System.out.println("College students must do homework to get good grades");
    }

}

class SchoolStudent extends Student{

}