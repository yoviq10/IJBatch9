package com.class23;

public class BankTester {

    public static void main(String[] args) {

        BankOfAmerica bankOfAmerica=new BankOfAmerica();
        bankOfAmerica.chargeTransferFee(1000);

        Chase chase=new Chase();
        chase.chargeTransferFee(1000);

        Citizen citizen=new Citizen();
        citizen.chargeTransferFee(1000);

//Sequence of order matters when calling the method but not in the method class
    }




}
