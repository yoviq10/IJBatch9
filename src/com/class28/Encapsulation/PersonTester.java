package com.class28.Encapsulation;

public class PersonTester {
    public static void main(String[] args) {

        Person person=new Person();
        person.setName("fjkbdfkjab");
        person.setName("hukjbkjbkhdhvjhfkjgbj");//not following rules,since more than 15 characters
        person.setName("Asghar");
        System.out.println(person.getName());

    }
}
