package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Methods {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");

        WebElement searchBar = driver.findElement(By.id("global-enhancements-search-query"));
        searchBar.sendKeys("Wooden Spoon");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        String title = driver.getTitle();

        if(title.equals("Wooden spoon - Etsy")){
            System.out.println("Test is passed");
        }else {
            System.out.println("Test is failed.");
        }



    }
}
