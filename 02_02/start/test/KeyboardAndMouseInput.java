import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/SEIF/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.get("https://formy-project.herokuapp.com/scroll");

        //WebElement name = driver.findElement(By.id("name"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(name);
        //name.click();
        //name.sendKeys("Seif Kchiche");
        //WebElement date = driver.findElement((By.id("date")));
        //date.click();
        //date.sendKeys("11/02/2022");

        //driver.quit();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        //WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
        //fileUpload.sendKeys("file2.png");


        /**WebElement dropdownMenu = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenu.click();
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("03/03/2022");
        dateField.sendKeys(Keys.RETURN);

        //WebElement button1 = driver.findElement(By.id("radio-button-1"));
        //button1.click();

        //WebElement button2 = driver.findElement(By.cssSelector("input[value='option2']"));
        //button2.click();

        //WebElement button3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        //button3.click();
        //WebElement image = driver.findElement(By.id("image"));

        //WebElement box = driver.findElement(By.id("box"));

        //Actions actions = new Actions(driver);
        //actions.dragAndDrop(image, box).build().perform();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeElement);

         Alert alert = driver.switchTo().alert();
         alert.accept();

        String originalHandle = driver.getWindowHandle();

        //for(String handle1: driver.getWindowHandles()){
        //    driver.switchTo().window(handle1);
        //}
       **/

        //driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
