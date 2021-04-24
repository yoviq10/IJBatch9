package com.class31;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {

        //with LinkedList

        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("credit card"));
        linkedList.add(new DebitCard("DebitCard card"));
        linkedList.add(new PrePaidCard("PrePaidCard card"));
        for (Card card : linkedList) {
            card.IssueCard(); //calling methods
            card.calculateInterest();  //comes from method of parent
        }




    }
}
