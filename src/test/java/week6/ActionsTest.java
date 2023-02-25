package week6;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
import org.testng.annotations.*;
import week5.*;

public class ActionsTest extends TestBase {


    // hover
    @Test
    public void test1() {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement hover = driver.findElement(By.id("sub-menu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hover).perform();
        driver.findElement(By.id("link2")).click();
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    // double click
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClick).perform();
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You double clicked me!!!, You got to be kidding me");
        Thread.sleep(3000);
        alert.accept();
    }


    // double click in chain
    @Test
    public void test3() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement doubleClick = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.moveToElement(doubleClick).doubleClick().perform();
//        actions.doubleClick().perform();
        Thread.sleep(3000);
    }


    // drag and drop
    @Test
    public void test4() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement target = driver.findElement(By.id("droptarget"));
        WebElement source = driver.findElement(By.id("draggable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
    }


    // keyboard actions
    @Test
    public void test5() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/key_presses");
        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.SHIFT).perform();
        Thread.sleep(2000);


    }


}
