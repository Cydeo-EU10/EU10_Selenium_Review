package week5;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class AlertReview extends TestBase {


    // information alert
    @Test
    public void test1() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }


    // confirmation alert
    @Test
    public void test2() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();
    }

    // prompt alert
    @Test
    public void test3() throws InterruptedException {
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.xpath("//input[@name='prompt']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.sendKeys("Cydeo");
        Thread.sleep(3000);

//        alert.accept();


    }

}
