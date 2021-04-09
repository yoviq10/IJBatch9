package ReviewClass8.Constructors;

public class Employee {

    String name;
    String empID;
    String grade;
    String departments;

    public void method1(){
        System.out.println("important code");
    }

    public Employee(String name, String empID, String grade, String departments){ //too many 4
       // this.name=name;
       // this.empID=empID;
        //this.grade=grade;
        this(name, empID, grade);
        this.departments=departments;
        this.method1();
    }
    public Employee(String name, String empID, String grade) { //too many 4
        // this.name=name;
        this(name, empID);
        this.grade = grade;

    }


    public Employee(String name, String empID){
       // this.name=name;
        this(name);
        this.empID=empID;

    }
    public Employee(String name){ //too many 4
        this();   //this will call constructor
        this.name=name;
    }
    public Employee(){
        System.out.println("Important line of code must be executed whenever an object of this class is created");
        System.out.println("Important line of code must be executed whenever an object of this class is created");
        System.out.println("Important line of code must be executed whenever an object of this class is created");
        System.out.println("Important line of code must be executed whenever an object of this class is created");
        System.out.println("Important line of code must be executed whenever an object of this class is created");
        System.out.println("Important line of code must be executed whenever an object of this class is created");
    }

    public static void main(String[] args) {

        Employee employee=new Employee("Roheen","123","M4","IT");
        Employee employee1=new Employee();
    }
}

