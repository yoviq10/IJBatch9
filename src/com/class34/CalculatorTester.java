package com.class34;

public class CalculatorTester {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();

        try{
            calculator.Calculate();
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by 0");
        }

        catch (NullPointerException e){
            System.out.println("");
        }
        catch (Exception e){
            System.out.println("Generic Exception");
        }
    }
}
