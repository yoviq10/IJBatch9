package com.class23;

public class DegreeHW {

    /*Create a class 'Degree'
    having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'.
    In Masters class override method 'getPrerequisite'.
    Call the method by creating an object of each of the three classes.
     */
    void getPrerequsisite(){
        System.out.println("To get a degree you need your high School diploma");
    }
}

    class Bachelor extends DegreeHW{

// taking same method from parent/DegreeHW class in here (line 12) invisible

}

    class Masters extends DegreeHW {

    void getPrerequsisite() {
        System.out.println("To get a Masters degree, you need your Bachelors diploma");
    }

}
    class DegreeTest{
    public static void main(String[] args) {

    DegreeHW degree=new DegreeHW();
        degree.getPrerequsisite();

      Bachelor bach=new Bachelor();
      bach.getPrerequsisite();

      Masters master=new Masters();
        master.getPrerequsisite();
     }
    }