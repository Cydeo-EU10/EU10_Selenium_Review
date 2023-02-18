package week5;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class AlertReview extends TestBase {

    @Test
    public void test1() {
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onClick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

}
