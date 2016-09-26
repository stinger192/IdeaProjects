package packagename;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import java.io.File;

/**
 * Created by d.pavlov on 02/09/2016.
 */
public class CreateDriver {
    public  WebDriver createChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium3.0\\chromedriver.exe");
        return new ChromeDriver();
    }
    public  WebDriver createFFDriver()
    {
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium3.0\\geckodriver.exe");
        return new FirefoxDriver();
    }
    public WebDriver createFF38Driver() {
        System.setProperty("webdriver.firefox.marionette","C:\\Selenium3.0\\geckodriver.exe");
        FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox38.0\\firefox.exe"));
        FirefoxProfile profile = new FirefoxProfile();
        return new FirefoxDriver(binary,profile);
    }
    public WebDriver createEdgeDriver()
    {
        System.setProperty("webdriver.edge.driver","C:\\Selenium3.0\\MicrosoftWebDriver.exe");
        return new EdgeDriver();
    }
    public WebDriver createNewDriver(String browser)
    {
        switch (browser)
        {
            case "chrome":
                return createChromeDriver();
              //  break;
            case "firefox":
                return createFFDriver();
                //break;
            case "edge":
                return createEdgeDriver();
               // break;
            case "firefox38" :
                return createFF38Driver();
            default:return createChromeDriver();
        }
    }
}
