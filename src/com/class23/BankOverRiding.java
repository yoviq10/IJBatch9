package com.class23;

public class BankOverRiding {

    void chargeTransferFee(double amount) {
        System.out.println("your fee is " + amount * 0.02);
    }
}
    class BankOfAmerica extends BankOverRiding {  //created another class

        void chargeTransferFee(double amount) {
            System.out.println("your fee is " + amount * 0.05);
        }
    }

class Chase extends BankOverRiding {

    void chargeTransferFee(double amount) {
        System.out.println("your fee is " + amount * 0.03);
    }
}
class Citizen extends BankOverRiding{
 //this method is copied/by default from line 6

}

