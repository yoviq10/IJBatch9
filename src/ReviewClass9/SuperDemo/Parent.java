package ReviewClass9.SuperDemo;

public class Parent {

    String name;
    String address;

    public Parent(String name, String address){
        this.name=name;
        this.address=address;
    }
    void printInfo(){
        System.out.println("Name "+name+"Address "+address);
    }
}
class Child extends Parent{

    public Child(String name, String address) {
        super(name, address); //need super to call constructor (access parent class)
    }

}

class Main{
    public static void main(String[] args) {

        Child child=new Child("Aziz","1234");
        child.printInfo();
    }
}