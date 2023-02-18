package week5;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.*;

public class DropdownTest {

    static WebDriver driver;

    @BeforeClass
    public static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://getbootstrap.com/docs/5.0/forms/select/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select select = new Select(dropdown);

        System.out.println(select.getFirstSelectedOption().getText());
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());

        }

        // selecting by index
        select.selectByIndex(2);
        select.selectByIndex(0);
        Thread.sleep(1000);

        // select by visibleText
        select.selectByVisibleText("One");
        Thread.sleep(1000);
        select.selectByVisibleText("Two");
        Thread.sleep(1000);


        // selecting by value
        select.selectByValue("3");
        Thread.sleep(1000);

        select.selectByValue("1");
        Thread.sleep(1000);

        System.out.println(select.getFirstSelectedOption().getText());


    }

    @Test
    public void test2() {
        driver.get("https://getbootstrap.com/docs/5.0/forms/select/");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select select = new Select(dropdown);

        select.selectByIndex(3);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Three","Validating Dropdown 4th option");
        Assert.assertFalse(select.isMultiple());
    }


}
