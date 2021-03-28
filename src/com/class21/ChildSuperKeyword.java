package com.class21;

public class ChildSuperKeyword extends ParentSuperKeyWord {

    public ChildSuperKeyword(int field1, int field2, int field3) {
        super(field1, field2, field3);
        System.out.println("child class constructor is called");
    }
}
