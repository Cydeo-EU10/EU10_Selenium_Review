package week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class XpathLocators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // xpath is another custom locators
        // we have two types of syntax of xpath
        // 1. absolute xpath
        // it starts with single slash ( / ), starts from html tag, go down the element you want to locate , step by step


        //2. relative xpath
        //    //tagName[@attributeName='value']
        // frequently used syntax
        /*
            //tagName[contains(@attribute, 'value’)]
//ta        tagName[.='text'] (same as //tagName[text()='text’], . represents text)
//*[        //*[@attribute='value’] ( use * when we don't want use tag name)
         */
    }


}
