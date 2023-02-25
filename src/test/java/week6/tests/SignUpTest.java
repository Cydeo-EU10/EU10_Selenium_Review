package week6.tests;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;
import week6.pages.*;

import java.util.concurrent.*;

public class SignUpTest {

    SignUpPage signUpPage = new SignUpPage();
    ConfirmationPage confirmationPage = new ConfirmationPage();


    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");


        // first way to use singup page
//        signUpPage.nameInput.sendKeys("John");
//        signUpPage.emailInput.sendKeys("abc@abc.com");
//        signUpPage.btn.click();

        // second way to use signup page
        signUpPage.login("John","abc@abc.com");


        String actualText = confirmationPage.text.getText();
        String expectedText = "Thank you for signing up. Click the button below to return to the home page.";
        Assert.assertEquals(actualText,expectedText);

        driver.close();



    }
}
