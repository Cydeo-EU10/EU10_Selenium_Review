package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CssLocators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // syntax of css
        // 1.tagName[attributeName='Value']

        driver.get("https://practice.cydeo.com/inputs");
        WebElement flash = driver.findElement(By.cssSelector("div[class='large-12 columns']"));

        //2. second way of providing syntax, this one used only for id or className
        //tagName.classValue    or   tagName#id
        // if you use class value, you have to replace the space(if there is) with .


        // sometimes we need to locate one element then go to child element, this time, we have to use > sign
        // div.example>form
        // in the css, we can go from parent to child, but we CAN NOT go from child to parent.

    }
}
