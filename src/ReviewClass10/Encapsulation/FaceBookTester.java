package ReviewClass10.Encapsulation;

public class FaceBookTester {
    public static void main(String[] args) {

        FaceBookAccount faceBookAccount=new FaceBookAccount("abc@yahoo.com","123");

        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.getBalance("abcd"));


        // interview problem> another way if if else statement
        int age=0;

        int var1=10;
      /*  if(var1>20){
            age=100;
        }else{
            age=50;
        }*/

        age=(var1>20)?100:50;

        System.out.println(age);


    }
}
