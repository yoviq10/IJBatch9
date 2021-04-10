package com.class28.InClassTaskInterface;

public interface WebDriver {

    /*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("Opening the Google Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the Google Chrome browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the elements from the Google Chrome browser");
    }
}

class FireFox implements WebDriver{


    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing the FireFox browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding the elements from the FireFox browser");
    }
}