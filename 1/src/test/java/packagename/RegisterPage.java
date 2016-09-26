package packagename;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by d.pavlov on 02/09/2016.
 */
public class RegisterPage {
    private   WebDriver driver;
    @FindBy(name = "registration[gender]" )
    private List<WebElement> genderRadio;
    @FindBy(id = "registration_firstname")
    private   WebElement firstName;
    @FindBy (id = "registration_lastname")
    private WebElement lastname;
    @FindBy(id = "registration_company")
    private WebElement companyName;
    @FindBy(id="registration_kvk")
    private WebElement cocNumber;
    @FindBy(id = "registration_btw")
    private   WebElement vatNumber;
    @FindBy(id = "registration_street")
    private WebElement addresStreet;
    @FindBy(id = "registration_number")
    private WebElement addressNumber;
    @FindBy(id = "registration_addition")
    private WebElement addressAddition;
    @FindBy(id = "registration_extra")
    private  WebElement addressExtra;
    @FindBy(id= "registration_zipcode")
    private  WebElement zipCode;
    @FindBy(id = "registration_city")
    private  WebElement city;
    @FindBy(id = "registration_country")
    private WebElement countries;
    @FindBy(id = "registration_phonenumber")
    private WebElement phonenumber;
    @FindBy(id = "registration_email")
    private WebElement email;
    @FindBy(id = "registration_password")
    private WebElement password;
    @FindBy(id = "registration_submit")
    public WebElement submitButton;

    public  RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void selectGender(String gender)
    {
        /*
        If I use standard mechanism for handling and operationing radiobutton driver says that element is not clickable
        so I decided to solve the problem in the way of using JS executor
         */
        JavascriptExecutor js = (JavascriptExecutor)driver;
        switch (gender)
        {
            case "male":
                js.executeScript("arguments[0].click();", genderRadio.get(0));
                break;
            case "female" :
                js.executeScript("arguments[0].click();", genderRadio.get(1));
                break;
            default: return ;
        }
    }
    private void fillEdit(String value, WebElement element)
    {
        element.clear();
        element.sendKeys(value);
    }
    private void fillDropdown(String value, WebElement element)
    {
        Select dropdown= new Select(element);
        dropdown.selectByValue(value);
    }
    private void clearEdit(WebElement element)
    {
        element.clear();
    }
    public void fillName(String name)
    {
        fillEdit(name,firstName);
    }
    public void fillLastname(String lname)
    {
        fillEdit(lname,lastname);
    }
    public void fillCompany(String company)
    {
        fillEdit(company,companyName);
    }
    public void fillCocNumber(String coc)
    {
        fillEdit(coc,cocNumber);
    }
    public void fillVat(String vat)
    {
        fillEdit(vat,vatNumber);
    }
    public void fillStreet(String street)
    {
        fillEdit(street,addresStreet);
    }
    public void fillHouseNumber(String number)
    {
        fillEdit(number, addressNumber);
    }
    public void fillAddressAddition(String addition)
    {
        fillEdit(addition, addressAddition);
    }
    public void fillExtraAddress(String address)
    {
        fillEdit(address, addressExtra);
    }
    public void fillZip(String zip)
    {
        fillEdit(zip,zipCode);
    }
    public void fillCity(String _city)
    {
        fillEdit(_city,city);
    }
    public void selectCountry(String country)
    {
        fillDropdown(country, countries);
    }
    public void fillPhoneNumber(String phone)
    {
        fillEdit(phone, phonenumber);
    }
    public void fillEmail(String login)
    {
        fillEdit(login, email);
    }
    public void fillPassword(String passwd)
    {
        fillEdit(passwd, password);
    }
    public void submitForm()
    {
        JavascriptExecutor je = (JavascriptExecutor) this.driver;
        je.executeScript("arguments[0].scrollIntoView(true);",submitButton);
        submitButton.click();
    }

    public void clearName()
    {
        clearEdit(firstName);
    }
    public void clearLastname()
    {
        clearEdit(lastname);
    }
    public void clearCompany()
    {
        clearEdit(companyName);
    }
    public void clearCoC()
    {
        clearEdit(cocNumber);
    }
    public void clearVAT()
    {
        clearEdit(vatNumber);
    }
    public void clearZip()
    {
        clearEdit(zipCode);
    }
    public void clearCity()
    {
        clearEdit(city);
    }

}
