package ReviewClass7;

public class MethodDemo2Tester {
    public static void main(String[] args) {

        MethodDemo2.methodWithStaticModifier();// you can call a static method by just calling its class
    //you don't need to create an object in order to call a static method.

        MethodDemo2 method2=new MethodDemo2();
        method2.instanceMethod();
        MethodDemo2.methodWithStaticModifier();




    }
}
