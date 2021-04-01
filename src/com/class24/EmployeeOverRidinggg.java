package com.class24;


class EmployeeOverridingExample {

    double salary;

    void work(){
        System.out.println("Employee is working");
    }

    void getPaid(){
        System.out.println("Employee is getting paid "+salary+" and other benefits");
    }

    void goOnLeaves(){
        System.out.println("Employee is going on leave");
    }
}

    class FullTime extends EmployeeOverridingExample {

}

    class PartTimeEmployee extends EmployeeOverridingExample {
    @Override
    void goOnLeaves() {
        System.out.println("part time employee don't get leaves");
    }
}
class Contractor extends EmployeeOverridingExample {
    @Override
    void goOnLeaves() {
        System.out.println("Contractor employee don't ger leaves");
    }

    @Override
    void getPaid() {
        System.out.println("Paid on hourly basis "+salary);
    }
}





