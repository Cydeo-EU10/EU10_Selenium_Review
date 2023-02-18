package week5;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;

public class WindowsReview extends TestBase {

    @Test
    public void test1() {
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.findElement(By.linkText("new window")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals("Selenium")){
                break;
            }

        }
        System.out.println(driver.getCurrentUrl());
    }
}
