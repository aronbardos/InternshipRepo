package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl(Constants.URL_REGISTER)
public class LoginPage extends PageObject {
    /*Input fields*/
    @FindBy(id = "email")
    private WebElement emailAddressField;
    @FindBy(id = "pass")
    private WebElement passwordField;

    /*Buttons*/
    @FindBy(css = "button[title='Login']")
    private WebElement loginButton;

    /*Verifications*/
    public boolean isLoginSuccessful() {
        return getDriver().getCurrentUrl().equals(Constants.URL_MY_ACCOUNT);
    }

    /*Fills*/
    public void fillEmailAddressField(String email) {
        emailAddressField.sendKeys(email);
    }
    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    public void fillFields(String email, String password) {
        fillEmailAddressField(email);
        fillPasswordField(password);
    }

    /*Clicks*/
    public void clickLoginButton() {
        loginButton.click();
    }
}
