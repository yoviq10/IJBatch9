package ReviewClass9;

public class Exam {
    public static void main(String[] args) {
        Employee var1=new Secretary();
        LegalSecretary var2= new LegalSecretary();
        Employee var3=new Lawyer();
        Employee var4 =new LegalSecretary();
        Employee var5= new Employee();
        Object var6=new Secretary();

         var1.method1();
         var2.method2();
        //var3.method1();
        //var4.method1();
        // var5.method1();
        // var6.method1(); think twice
        // var3.method2();
        // var1.method3();
        // var3.method3();
        // ((LegalSecretary)var6).method1();
        // ((Secretary)var3).method2();
        // ((LegalSecretary)var4).method2();
        // ((Employee)var6).method3();
        //((Secretary)var4).method3();

        // ((Lawyer)var3).method2();


    }
}
