package ReviewClass;

import java.util.Scanner;

public class Account {

    String userName;
    String password;
    double balance;

    void signUp(){
        System.out.println("Welcome to bank of America");
        System.out.println("Choose your username");
        Scanner scanner=new Scanner(System.in);
        userName=scanner.next();
        System.out.println("Please choose a password");
        password=scanner.next();
        System.out.println("Enter the amount that you want to deposit");
        balance=scanner.nextDouble();
    }

    boolean signIn(){
        System.out.println("Please enter your username");
        Scanner scanner=new Scanner(System.in);
        String enteredUserName=scanner.next();
        System.out.println("Please enter password");
        String enteredPassWord=scanner.next();
            if(enteredUserName.equals(userName)&& enteredPassWord.equals(password)){
                System.out.println("Welcome to the bank");
                return true;
            }else{
                System.out.println("Either username or password is not correct");
                return false;
            }
    }

    void withDraw(double amountToWithDraw){
        if(amountToWithDraw>balance){
            System.out.println("NOT ENOUGH BALANCE");
        }else{
           balance=balance-amountToWithDraw;
            System.out.println("operational successful");
        }

    }









}
