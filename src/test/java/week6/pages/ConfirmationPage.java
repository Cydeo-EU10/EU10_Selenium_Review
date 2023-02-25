package week6.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class ConfirmationPage {

    public ConfirmationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "subheader")
    public WebElement text;
}
