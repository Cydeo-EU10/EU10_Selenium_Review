package week4;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class StaleElementRefrenceException {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement gmail = driver.findElement(By.partialLinkText("mail.google.com"));

        System.out.println(gmail.getText());

        driver.navigate().refresh();

        System.out.println(gmail.getText());
    }
}
