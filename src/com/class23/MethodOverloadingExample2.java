package com.class23;

public class MethodOverloadingExample2 {
    //The return type does not matter (void/return) or the access (private/public)
    //Only the Method Signature Matters>> HAS TO BE THE SAME

    public void hello(){
        System.out.println("hello");
    }

    public void hello (String str){
        System.out.println("hello "+ str);
    }

    private void hello(int num){
        System.out.println("hello "+num);
    }

  //  public String hello(String str){   //NOT OVER LOADING BECAUSE method signature is the same as line 10 it hsa String instead of void
    //    return str;
 //   }

    public static void main(String[] args) {

        MethodOverloadingExample2 obj=new MethodOverloadingExample2();
        obj.hello();
        obj.hello("is it me");
        obj.hello(10);


    }




}
