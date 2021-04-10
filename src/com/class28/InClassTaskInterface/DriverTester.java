package com.class28.InClassTaskInterface;

public class DriverTester {
    public static void main(String[] args) {

        WebDriver webDriver=new FireFox();
        webDriver.openBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        webDriver.closeBrowser();


    }
}
