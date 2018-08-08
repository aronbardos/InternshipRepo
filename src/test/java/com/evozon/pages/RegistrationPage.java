package com.evozon.pages;

import com.evozon.entities.User;
import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

@DefaultUrl(Constants.URL_REGISTER)
public class RegistrationPage extends PageObject {
    /*Input Fields*/
    @FindBy(id = "firstname")
    private WebElement firstnameField;
    @FindBy(id = "lastname")
    private WebElement lastnameField;
    @FindBy(id = "email_address")
    private WebElement emailAddressField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(id = "confirmation")
    private WebElement passwordConfirmationField;

    /*Buttons*/
    @FindBy(css = "button[title=Register]")
    private WebElement registerButton;

    /*Verifications*/
    public boolean isRegistrationSuccessful() {
        return getDriver().getCurrentUrl().equals(Constants.URL_SUCCESSFUL_REGISTRATION);
    }

    /*Fills*/
    public void fillFirstname(String firstname) {
        firstnameField.sendKeys(firstname);
    }
    public void fillLastname(String lastname) {
        lastnameField.sendKeys(lastname);
    }
    public void fillEmailaddress(String email) {
        emailAddressField.sendKeys(email);
    }
    public void fillPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void fillPasswordConfirmation(String confirmation) {
        passwordConfirmationField.sendKeys(confirmation);
    }
    public void fillFields(String firstname, String lastname, String email, String password, String confirmation) {
        fillFirstname(firstname);
        fillLastname(lastname);
        fillEmailaddress(email);
        fillPassword(password);
        fillPasswordConfirmation(confirmation);
    }
    public void fillFields(User user) {
        fillFirstname(user.getFirstname());
        fillLastname(user.getLastname());
        fillEmailaddress(user.getEmail());
        fillPassword(user.getPassword());
        fillPasswordConfirmation(user.getPassword());
    }

    /*Clicks*/
    public void clickRegisterButton() {
        registerButton.click();
    }
}
