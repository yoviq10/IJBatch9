package com.class23;

public class CreditCardHW {

   /*Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes

    */
    double balance;    //creating instance variables
    double interest;

    void total(double balance){
        interest=balance*0.20;
        System.out.println("total with interest is: "+interest);
    }
}

class Visa extends CreditCardHW{
 //same method as line 17 will print out

}

class AX extends CreditCardHW{

    void total(double balance){   //override interest rate
     interest=balance*0.25;
        System.out.println("total with interest is: "+interest);
    }
}

class CreditCardTester{
    public static void main(String[] args) {

        CreditCardHW creditcard=new CreditCardHW();
        creditcard.total(8000);

        Visa visa=new Visa();
        visa.total(8000);

        AX ax=new AX();
        ax.total(8000);

    }

}