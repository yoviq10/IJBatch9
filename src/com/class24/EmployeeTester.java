package com.class24;

public class EmployeeTester {
    public static void main(String[] args) {

        EmployeeOverridingExample employee = new EmployeeOverridingExample();
        employee.salary = 1000;
        employee.getPaid();

        Contractor contractor = new Contractor();
        contractor.salary = 50;
        contractor.getPaid();


        //Widening
        double var1=10;
        System.out.println(var1);// 10.0

        int var2=(int)10.0;
        System.out.println(var2);

        //Widening Upcasting
        EmployeeOverridingExample contractor2=new EmployeeOverridingExample();


    }
}
