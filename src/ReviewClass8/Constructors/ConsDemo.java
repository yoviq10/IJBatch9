package ReviewClass8.Constructors;

public class ConsDemo {

    String name;
    String address;

    public ConsDemo(){

    }

    ConsDemo(String name){
        this.name=name;
    }

    protected ConsDemo(String name, String address){

    }

    void method1(){
        System.out.println("Method with default access");
    }
    protected void method2(){   //can access another package by calling them directly, but not by creating the object
        System.out.println("Method with protected access");
    }
    private void method3(){
        System.out.println("Method with private access");
    }
    public void method4(){  //can access any package
        System.out.println("Method with public access");
    }



}

