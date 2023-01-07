package week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FindElementMethod {

    public static WebElement dynamicLoading = null;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        // find element
        // this method is using locator to locate web elements
        // we have 8 types of locator
        //1. id
//        WebElement foot = driver.findElement(By.id("page-footer"));
//        System.out.println(foot.getText());
//        System.out.println(foot.getTagName());

        //2. link text
//        WebElement brokenLink = driver.findElement(By.linkText("Broken Images"));
//        System.out.println(brokenLink.getText());
//        brokenLink.click();

        // 3. partial link text
        WebElement checkBox = driver.findElement(By.partialLinkText("Check"));
        System.out.println(checkBox.getText());

        dynamicLoading = driver.findElement(By.partialLinkText("Dynamic"));
        System.out.println(dynamicLoading.getText()); // dynamic loading

        // 4. name


    }
}
