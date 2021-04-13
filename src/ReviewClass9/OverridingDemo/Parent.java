package ReviewClass9.OverridingDemo;

public class Parent {

    void method(){
        System.out.println("Implementation from the parent class");
        System.out.println("code that is old, not needed anymore");
    }
}
class Child extends Parent{
    @Override
    void method() {
        System.out.println("Implementation from the child class");
    }
}
class Main{
    public static void main(String[] args) {

        Child child=new Child();//print out:Implementation from the child class
        child.method();
        

    }
}