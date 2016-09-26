package packagename;

import org.openqa.selenium.WebDriver;
import java.util.Random;

public class RegistrationValidFill {
    private WebDriver driver;
    RegistrationValidFill(WebDriver driver)
    {
        this.driver=driver;
    }
    public void netherlands()
    {
        RegisterPage registerPage = new RegisterPage(this.driver);
        Random rand = new Random();
        registerPage.selectGender("male");
        registerPage.fillName(Consts.name);
        registerPage.fillLastname(Consts.lastName);
        registerPage.fillStreet(Consts.netherlandsStreet);
        registerPage.fillHouseNumber(Consts.netherlandsHouseNumber);
        registerPage.fillZip(Consts.netherlandsZipValid1);
        registerPage.fillCity(Consts.netherlandsCity);
        registerPage.selectCountry(Consts.selectNetherlands);
        registerPage.fillPhoneNumber(Consts.netherlandsPhoneCode+Consts.netherlandsPhoneValid);
        registerPage.fillEmail("d.pavlov"+rand.nextInt()+"@levi9.com");
        registerPage.fillPassword(Consts.password);
    }
    public void sweden()
    {
        RegisterPage registerPage = new RegisterPage(this.driver);
        Random rand = new Random();
        registerPage.selectGender("male");
        registerPage.fillName(Consts.name);
        registerPage.fillLastname(Consts.lastName);
        //registerPage.fillStreet(Consts.swedenCityDiacriticks);
        registerPage.fillStreet(Consts.swedenCity);
        registerPage.fillHouseNumber(Consts.swedenHouseNumber);
        registerPage.fillAddressAddition(Consts.swedenAddressAddition);
        registerPage.fillZip(Consts.swedenZipValid1);
        registerPage.fillCity(Consts.swedenCity);
        registerPage.selectCountry(Consts.selectSweden);
        registerPage.fillPhoneNumber(Consts.swedenPhoneCode+Consts.swedenPhoneValid);
        registerPage.fillEmail("d.pavlov"+rand.nextInt()+"@levi9.com");
        registerPage.fillPassword(Consts.password);
    }
}
