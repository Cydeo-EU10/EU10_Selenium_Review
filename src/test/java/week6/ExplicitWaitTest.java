package week6;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import week5.*;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/dynamic_loading/3");
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf
                (driver.findElement(By.xpath("//button[@type='submit']"))));

        Assert.assertTrue(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());
    }
}
