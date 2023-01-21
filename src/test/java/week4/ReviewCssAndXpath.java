package week4;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ReviewCssAndXpath {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        1. Css locator
          tagName[attributeName='value']
          tagName#idValue    or tagName.classValue

          div[type='text']     li.list-group-item:nth-of-type(1)
          div#radio   using id value
          div.radio   using class value

          use > sign to go from parent to child
          div.radio > h1   first way is using >
          div.radio h1     second way is using a space

          nth-of-type(index number)




          2, xpath locator

          1) absoulute xpath -- start from the first element (which is html)
          then go to your element step by step
           start with /, continue with /


           2) relative xpath -- start wherever you want
           start with //, continue with //, when want to child element, then use /

           //li[@class='list-group-item']


            frequently used syntax for xpath

            //tagName[@attribute='value’]
            //tagName[contains(@attribute, 'value’)]
            //tagName[.='text'] (same as //tagName[text()='text’], . represents text)
            //*[@attribute='value’] ( use * when we don't want use tag name)


            go from parent to child
         */

    }
}
