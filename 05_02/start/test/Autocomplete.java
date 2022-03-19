import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

public class Autocomplete extends FormPage {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "C:/Users/SEIF/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

       submitForm(driver);

       confirmationPage confirm =  new confirmationPage();

       confirm.waitForAlertBanner(driver);


        assertEquals("The form was successfully submitted!", confirm.getAlertBannerText(driver));

        driver.quit();
    }
}
