package week6;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;
import week5.*;

public class ActionsTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement hover = driver.findElement(By.id("sub-menu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        driver.findElement(By.id("link2")).click();
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You double clicked me!!!, You got to be kidding me");
        Thread.sleep(3000);
        alert.accept();
    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.moveToElement(doubleClick).perform();
        actions.doubleClick().perform();
        Thread.sleep(3000);
    }


}
