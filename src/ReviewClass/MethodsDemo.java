package ReviewClass;

public class MethodsDemo {

    /*
    Return types
    void if methods do not return any type we use VOID
    */
    void simpleMethod(){
        System.out.println("How are you?");
    }

    int simpleIntMethod(){
        return 10;
    }

    void onlyTakesInput(int x){
        System.out.println(x);
    }

    void methodWithTwoInputs(String name, double salary){
        System.out.println(name+" earns "+salary);
    }

    int sum(int num1, int num2){
        return num1+num2;  //widely used
    }

    boolean isNumberPositive(int number){
        return number>0;
    }





}
