package com.class24;

public class PersonTester {
    public static void main(String[] args) {

    Person person=new Student();
    Person person1=new Teacher();
    Person person2=new Employee();

   // Student student=new Person(); error
   // Student student=(Student) person1; RunTime error because student is not a teacher
       Student student=(Student)person;  //this is true because student is a student
    }

}
