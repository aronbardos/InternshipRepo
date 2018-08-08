package com.evozon.pages;

import com.evozon.entities.UserRegister;
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
    @FindBy(css = "#form-validate > div.buttons-set > button")
    private WebElement registerButton;

    /*Inputs*/
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

    /*Fills*/
    public void fillFields(String firstname, String lastname, String email, String password, String confirmation) {
        fillFirstname(firstname);
        fillLastname(lastname);
        fillEmailaddress(email);
        fillPassword(password);
        fillPasswordConfirmation(confirmation);
    }
    public void fillFields(UserRegister user) {
        fillFirstname(user.getFirstname());
        fillLastname(user.getLastname());
        fillEmailaddress(user.getEmail());
        fillPassword(user.getPassword());
        fillPasswordConfirmation(user.getConfirmation());
    }

    /*Clicks*/
    public void clickRegisterButton() {
        registerButton.click();
    }
}
