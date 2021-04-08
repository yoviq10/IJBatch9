package com.class27;

public class PhoneTester {

    public static void main(String[] args) {

        Phone iphone = new Iphone();
        iphone.unlockPhone();

        Phone samsungPhone=new Samsung();
        samsungPhone.displayPictures(); //use gallery app to display the pictures
        samsungPhone.makeCalls(); //calling
        }


    }
