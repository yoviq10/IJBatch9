package ReviewClass7;


public class MethodDemo2 {

    static void methodWithStaticModifier(){
        System.out.println("You can call me by just writing the name of the class");
    }

    void instanceMethod(){
        System.out.println("You need an object of my class if you want to call outside of this class or in the static method");
        methodWithStaticModifier(); //I can call it
    }

    void instanceMethod2(){
        methodWithStaticModifier();
        instanceMethod();
        String [] a= {"bla bla bla"};
        main(a);
    }

    public static void main(String[] args) {
        methodWithStaticModifier();
    }
}
