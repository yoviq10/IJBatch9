package com.class30;

import java.util.Objects;

public class Student {

    int rollno;
    String name;
    int age;

    Student(int rollno,String name, int age){
            this.rollno=rollno;
            this.name=name;
            this.age=age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name, age);
    }

    @Override                    //overriding string method
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
