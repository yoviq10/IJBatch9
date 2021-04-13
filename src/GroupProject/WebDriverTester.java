package GroupProject;

public class WebDriverTester {

    //#5

    public static void main(String[] args) {

      RemoteWebDriver[] wdrivers={new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for(RemoteWebDriver driver:wdrivers ){
            driver.open();
            driver.close();
            driver.getTitle();
            driver.navigate();
            driver.getScreenshot();
        }



    }
}
