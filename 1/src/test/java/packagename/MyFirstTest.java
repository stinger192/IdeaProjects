package packagename;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.*;

import java.util.List;

/**
 * Created by d.pavlov on 26/08/2016.
 */
public class MyFirstTest {
    private static WebDriver driver;
    private String browser="chrome";
    private String url="https://printdeal-be.acc.ppg.nu/nl";
    private String destination="/registration";
    @Before
    public void createDriver()
    {
        CreateDriver newDriverInstance = new CreateDriver();
        driver = newDriverInstance.createNewDriver(browser);
        driver.manage().window().maximize();
    }
    @After
    public void closeDriver()
    {
        if(driver!=null)
            driver.quit();
    }
    @Test
    public void startWebdriwer() throws InterruptedException
    {

        driver.get(url+destination);
        RegistrationValidFill registrationValidFill = new RegistrationValidFill(driver);
        registrationValidFill.netherlands();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.submitForm();
        Thread.sleep(15000);
    }
    @Test
    public void zipSuccessfulValidation() throws InterruptedException
    {
        driver.get(url+destination);
        RegistrationValidFill registrationValidFill = new RegistrationValidFill(driver);
        registrationValidFill.sweden();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clearZip();
        registerPage.fillZip(Consts.swedenZipValid1);
        registerPage.submitForm();
        Thread.sleep(15000);
        driver.manage().deleteAllCookies();
        driver.get(url+destination);
        registrationValidFill.sweden();
        registerPage.clearZip();
        registerPage.fillZip(Consts.swedenZipValid2);
        registerPage.submitForm();
        Thread.sleep(15000);
    }
}
