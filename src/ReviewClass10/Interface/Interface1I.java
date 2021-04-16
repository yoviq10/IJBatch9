package ReviewClass10.Interface;

public interface Interface1I {
    
    int number1 = 10;

    void method1();

    default void method2() {  //default methods must have body
        System.out.println("method 1");
    }
    static void method3(){  //static must have body
        System.out.println("static method");
    }

}
