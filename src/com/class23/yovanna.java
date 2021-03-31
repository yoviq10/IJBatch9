package com.class23;

public class yovanna {

    void marry(){
        System.out.println("my boy will mary the girl that me and my wife will choose for him");
    }
}

class son1 extends yovanna{    //creating another class and extending to parent class

    //method above will be copied from above in here (since it refers to parent)

    }

    class son2 extends yovanna{    //creating another class and extending to parent class

        void marry(){
            System.out.println("I want to marry Taylor Swift");
        }




    public static void main(String[] args) {

        son1 son1=new son1();
        son1.marry();

        son2 son2=new son2();
        son2.marry();

    }

}