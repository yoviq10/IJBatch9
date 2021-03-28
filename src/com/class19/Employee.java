package com.class19;

public class Employee {


   private String name;
   private String empID;
   private double Salary;
   private String department;

   Employee(){
       System.out.println("Important line 1");
   }

   public Employee(String name){
       this();
     //  this.name=ValidateName(name);
   }

   public Employee(String name, String empID){
       this(name);
       this.empID=empID;
   }


   public Employee(String name, String empID, double Salary){
       this(name,empID);
       this.Salary=Salary;
   }

    public Employee(String name, String empID, double salary, String department) {
        //this.name = name;
        //this.empID = empID;
        //Salary = salary;
        this(name,empID,salary);
        this.department = department;
    }








    void printInfo(){
        System.out.println("name "+name+"Employee ID"+empID);
    }
       // String ValidateName(String name){
        //if(name.length()<15){
          //  return name;
        //}else{
         //   return null;
       // }
   // }
}
