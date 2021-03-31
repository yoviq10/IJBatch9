package com.class23;

public class FullTimeChildClass extends EmployeeMethodOverRidingExample{

    int bonus;

    public void getPaid(){
        System.out.println("Full time employee gets paid "+salary+" and bonus "+bonus);
    }
}
