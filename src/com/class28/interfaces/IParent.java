package com.class28.interfaces;

public interface IParent {

    //private int number= 10; all variables in interface are public

    public int number=10; //No need to make the variables as public or static and final
                            //because they are already public,static, & final.


    int number2=20;

//  IParent(){  interface cannot have constructors because they don't have instance fields

//    }

    void method1();
}

interface IParent2{
    void method2();
}

class AdvanceChild implements IParent,IParent2{

    @Override
    public void method1() {
        System.out.println("from IParent");
    }

    @Override
    public void method2() {
        System.out.println("IParent2");
    }
}