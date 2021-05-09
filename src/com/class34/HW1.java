package com.class34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

  /* How would handle InputMismatchException?
    Input Mismatch Exception when user enters mismatch value then programmer expected.*/

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers");

        while(true) {


            try {
                int x = scanner.nextInt();
                System.out.println(x);
            } catch (InputMismatchException e) {
                System.out.println("Wrong Input");
                break;
            }

        }


    }
}
