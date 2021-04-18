package com.class29;

public class WrapperClassesDemo2 {
    public static void main(String[] args) {

        int a =10;
        Integer aa=a;   //converted to non primitive type (Wrapper class >Integer)
        a=aa; //or reverse way from primitive to non primitive

        Integer integer=new Integer(10); //Boxing longer way, put primitive into wrapper
        Integer integer1=45;   //AutoBoxing is shorter way > 45 is primitive type but assigning it to Integer

        int abc=integer.intValue();//UnBoxing Longer way, from wrapper class to return primitive
        abc=integer; //auto Unboxing
    }
}
