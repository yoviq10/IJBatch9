package GroupProject;

//#5 Group Project

public interface WebDriver {

    void open();
    void close();
    void getTitle();

}
interface RemoteWebDriver extends WebDriver,TakesScreenshot{

    void navigate();
}
interface TakesScreenshot{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening on ChromeDriver");
    }

    @Override
    public void close() {
        System.out.println("Closing on ChromeDriver");
    }

    @Override
    public void getTitle() {
        System.out.println("Getting title from Chrome Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to ChromeDriver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting a screenshot on ChromeDriver");
    }
}

class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening on FireFox Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing on Firefox Driver");
    }

    @Override
    public void getTitle() {
        System.out.println("Getting title from FireFox Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating on FireFox Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get a screenshot on Firefox");
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening on Safari Driver");
    }

    @Override
    public void close() {
        System.out.println("Closing on Safari Driver");
    }

    @Override
    public void getTitle() {
        System.out.println("Getting title from Safari Driver");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating on Safari Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get screenshot on Safari Driver");
    }
}
