package week5;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class IFrameReview extends TestBase{




    // providing iframe id
    @Test
    public void test1(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }


    // locage iframe, then provide the web element

    @Test
    public void test2(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebElement iframe = driver.findElement(By.name("iframeResult"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }


    // provide index of that frame
    @Test
    public void test3(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

}
