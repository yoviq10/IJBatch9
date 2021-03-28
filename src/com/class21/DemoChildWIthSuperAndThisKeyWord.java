package com.class21;

public class DemoChildWIthSuperAndThisKeyWord extends DemoparentwithSuperandThisKeyowrd {


    public DemoChildWIthSuperAndThisKeyWord(int num1, int num2, int num3) {
        super(num1, num2, num3);
    }

    int average(){
      return  super.add()/2;
    }
}
