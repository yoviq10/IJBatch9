package com.class34;

public class TryAndCatchDemo6 {
    public static void main(String[] args) {

        //exception class is the parent class of all exceptions, which is why it is always at the end catch
        try{
            int arr[]={10,60};
            System.out.println(arr[5]);
            String var2="abs";
            var2.charAt(10);
        } catch (NullPointerException e){  //different remedies depending on the issue/lots of flexibility
            System.out.println("Can not call methods on a null object");
        }catch (ArithmeticException arithmeticException){
            System.out.println("Can not divide by zero, please contact Saleem");
        }catch (Exception e){  // this will print to handle any other errors..best approach
        System.out.println("To handle any other error");



    }
}
}
