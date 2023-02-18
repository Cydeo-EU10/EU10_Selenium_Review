package week5;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.concurrent.*;

public abstract class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
