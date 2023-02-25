package week6;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import week5.*;

public class UploadTest extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://chercher.tech/practice/" +
                "practice-pop-ups-selenium-webdriver");

        String path = "C:\\Users\\Zulpikar\\IdeaProjects\\EU10_Selenium_Review" +
                "\\src\\test\\java\\week6\\test document.txt";
        WebElement uploadLink = driver.findElement(By.name("upload"));
        uploadLink.sendKeys(path);
        Thread.sleep(3000);

    }
}
