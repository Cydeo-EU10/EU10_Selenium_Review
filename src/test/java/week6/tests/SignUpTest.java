package week6.tests;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import utilities.*;
import week6.pages.*;

import java.util.concurrent.*;

public class SignUpTest {

    SignUpPage signUpPage = new SignUpPage();


    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        signUpPage.nameInput.sendKeys("John");
        signUpPage.emailInput.sendKeys("abc@abc.com");
        signUpPage.btn.click();



    }
}
