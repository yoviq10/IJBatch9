package com.class24;

public class WebSiteTester {
    public static void main(String[] args) {
//Just by changing the object you can execute anything from that method
        //like changing GoogleChrome to FireFox example below


        WebDriver webDriver=new GoogleChrome(); //all functions from object(googleChrome) will be executed
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downLoadAFileFromWebsite();
        webDriver.closeWebsite();

        WebDriver webDriver1=new FireFox(); //changed to FireFox
        webDriver1.openWebsite();
        webDriver1.signupWebsite();
        webDriver1.downLoadAFileFromWebsite();
        webDriver1.closeWebsite();

        System.out.println("--Longer Way code-----");
        //this is the long Way when you are starting with FireFox than WebDriver
        FireFox fireFox=new FireFox();
        fireFox.openWebsite();
        fireFox.signupWebsite();
        fireFox.downLoadAFileFromWebsite();
        fireFox.closeWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signupWebsite();
        googleChrome.downLoadAFileFromWebsite();
        googleChrome.closeWebsite();

        System.out.println("---Another WAY with Array & loop----");

        WebDriver [] webDriverArray={new GoogleChrome(),new FireFox()};
            for(WebDriver webDriver2:webDriverArray){
                webDriver2.openWebsite();
                webDriver2.signupWebsite();
                webDriver2.downLoadAFileFromWebsite();
                webDriver2.closeWebsite();
            }



    }

}
