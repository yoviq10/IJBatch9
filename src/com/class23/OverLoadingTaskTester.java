package com.class23;

public class OverLoadingTaskTester {
    public static void main(String[] args) {

        OverloadingTask obj=new OverloadingTask();
        obj.area(10,20);
        obj.area(10);
        obj.area(10,12,13);
    }
}
