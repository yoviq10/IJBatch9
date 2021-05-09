package com.class34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1OtherWay {
    public static void main(String[] args) {

  /* How would handle InputMismatchException?
    Input Mismatch Exception when user enters mismatch value then programmer expected.*/

        System.out.println("Enter the numbers");
        Scanner scanner=null;

        while(true) {


            try {
                scanner=new Scanner(System.in);
                int x = scanner.nextInt();
                System.out.println(x);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wrong Input");
            }

        }


    }
}


