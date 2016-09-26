/**
 * Created by d.pavlov on 26/08/2016.
 */
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class tst {
    public static void main()
    {
        WebDriver a= new FirefoxDriver();
        a.get("http://www.google.com");
    }
}
