package com.class27;


    abstract class Phone{

        void makeCalls(){
            System.out.println("Calling");
        }

        void sendText(){
            System.out.println("Sending Text");
        }
        abstract void displayPictures();
        abstract void unlockPhone();
    }


    class Iphone extends Phone{   //child class implementing details

    void displayPictures(){
        System.out.println("Iphone uses photo app to display pictures");
    }

        @Override
        void unlockPhone() {
            System.out.println("Iphone users can unlock phone by faceID");
        }
    }

    class Samsung extends Phone{
        @Override
        void unlockPhone() {
            System.out.println("Can unlock with face ID and FingerPrint");
        }

        @Override
        void displayPictures() {
            System.out.println("Use the Gallery App to display the pictures");
        }
    }




