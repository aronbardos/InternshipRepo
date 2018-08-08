package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl(Constants.URL_REGISTER)
public class LoginPage extends PageObject {
    /*Input fields*/
    @FindBy(id = "email")
    private WebElement emailAddressField;
    @FindBy(id = "pass")
    private WebElement passwordField;

    /*Buttons*/
    //@FindBy(css = ".last [title=Log In]")
    @FindBy(css = "button[title='Login']")
    private WebElement loginButton;

    public void inputEmailAddress() {
        emailAddressField.sendKeys(Constants.VALID_EMAIL_ADDRESS);
    }
    public void inputPassword() {
        passwordField.sendKeys(Constants.VALID_PASSWORD);
    }
    public void fillFields() {
        inputEmailAddress();
        inputPassword();
    }
    public void clickLoginButton() {
        loginButton.click();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_MY_ACCOUNT);
    }
}
