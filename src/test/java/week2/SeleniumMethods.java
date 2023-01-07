package week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.sql.*;

public class SeleniumMethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com");
//        Thread.sleep(1000);
//        driver.get("https://www.cydeo.com");
//        Thread.sleep(1000);
//
//
//        driver.navigate().back();   // google
//        Thread.sleep(1000);
//
//        driver.navigate().forward(); // cydeo
//        Thread.sleep(1000);
//
//        driver.navigate().refresh(); // cydeo again
//
//        driver.navigate().to("https://www.ebay.com");
//
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.abc.com");
        String actualTitle = driver.getTitle();
        String actualUrl = driver.getCurrentUrl();

        if(actualTitle.equals("ABC Home Page - ABC.com")){
            System.out.println("First test is passed");
        }else {
            System.out.println("First test is failed");
        }

        if(actualUrl.equals("https://abc.com/")){
            System.out.println("Second test is passed");
        }else {
            System.out.println("Second test is failed");
        }








    }

}
