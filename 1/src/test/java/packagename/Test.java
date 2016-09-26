package packagename;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by d.pavlov on 15/09/2016.
 */
public class Test {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium3.0\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
