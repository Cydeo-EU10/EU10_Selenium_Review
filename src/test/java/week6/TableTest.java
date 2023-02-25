package week6;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import week5.*;

import java.util.*;

public class TableTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://afd.calpoly.edu/web/sample-tables");
        WebElement address1 = driver.findElement(By.xpath("//td[.='Building 99 Room 1']"));
        Assert.assertEquals("Building 99 Room 1",address1.getText());
    }

    @Test
    public void test2(){
        driver.get("https://afd.calpoly.edu/web/sample-tables");

        String drName = "Dr. Steve";
        List<WebElement> info = driver.findElements(By.xpath("//td[contains(text(),'" + drName + "')]/following-sibling::td"));
        Assert.assertEquals("555-5678",info.get(0).getText());
        Assert.assertEquals("steve@calpoly.edu",info.get(1).getText());
        Assert.assertEquals("56-78",info.get(2).getText());
    }


}
