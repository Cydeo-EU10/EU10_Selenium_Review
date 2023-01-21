package week4;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.*;

public class RadioBtnPractice {

    public static void main(String[] args) {

        clickbtn("Email");


    }

    public static void clickbtn(String btnName){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.tutorialstonight.com/html-radio-button");

        WebElement btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//        switch (btnName){
//            case ("Email"):
//                btn = driver.findElement(By.xpath("//input[@type='radio'][1]"));
//                break;
//            case("Phone"):
//                btn = driver.findElement(By.xpath("//input[@type='radio'][2]"));
//                break;
//            case("Mail"):
//                btn = driver.findElement(By.xpath("//input[@type='radio'][3]"));
//                break;
//        }

        btn.click();
    }
}
