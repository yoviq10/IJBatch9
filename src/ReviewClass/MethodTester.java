package ReviewClass;

public class MethodTester {

    public static void main(String[] args) {


       MethodsDemo obj= new MethodsDemo();

       obj.simpleMethod();
        System.out.println(obj.simpleIntMethod());

        obj.onlyTakesInput(100);

        obj.methodWithTwoInputs("yovanna",  180000);

        System.out.println(obj.sum(12,12));

        System.out.println(obj.isNumberPositive(12));
        System.out.println(obj.isNumberPositive(-12));

    }
}
