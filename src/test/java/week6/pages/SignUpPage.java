package week6.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.*;
import utilities.*;
import week5.*;

public class SignUpPage {

    public SignUpPage() {       //driver
        PageFactory.initElements(Driver.getDriver(), this);
    }
    // alt + insert

    @FindBy(xpath = "//input[@name=\"full_name\"]")
    public WebElement nameInput;

    @FindBy(xpath="//input[@name=\"email\"]")
    public WebElement emailInput;

    @FindBy(xpath="//button[@name=\"wooden_spoon\"]")
    public WebElement btn;

    public void login(String username, String email){
        emailInput.sendKeys(email);
        nameInput.sendKeys(username);
        btn.click();
    }




}
