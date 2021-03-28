package ReviewClass;

import java.util.Scanner;

public class AccountTester {

    public static void main(String[] args) {


        Account YovannaAccount=new Account();

        YovannaAccount.signUp();

     boolean  isSuccessful=YovannaAccount.signIn();
        if(isSuccessful){
            System.out.println("enter the amount you want to transfer");
            Scanner scanner=new Scanner(System.in);
            YovannaAccount.withDraw(scanner.nextDouble());

        }

    }


}
