package ReviewClass9;

public class Employee {

    public void method1(){
        System.out.println("line 6");
        method3();
    }
    public void method3(){
        System.out.println("line 10");
    }
}
class Secretary extends Employee{
    public void method3(){
        System.out.println("line 15");
        super.method3();
    }
}

class Lawyer extends Employee{
    public void method2(){
        System.out.println("line 22");
    }
    public  void method3(){
        System.out.println("line 25");
    }
}
class LegalSecretary extends Secretary{
    public void method2(){
        System.out.println("line 30");
    }
    public  void method3(){
        System.out.println("line 33");
    }


}
