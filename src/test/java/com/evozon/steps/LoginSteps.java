package com.evozon.steps;

import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LoginSteps extends ScenarioSteps {
    /*Pages*/
    private CartPage         cartPage;
    private CatalogPage      catalogPage;
    private CategoryPage     categoryPage;
    private CheckoutPage     checkoutPage;
    private HeaderPage       headerPage;
    private HomePage         homePage;
    private LoginPage        loginPage;
    private ProductPage      productPage;
    private RegistrationPage registrationPage;
    private WishlistPage     wishlistPage;

    @Step
    public void loginWithValidCredentials(String email, String password) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillFields(email, password);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLoginSuccessful());
    }
    @Step
    public void loginWithInvalidCredentials(String email, String password) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillFields(email, password);
        loginPage.clickLoginButton();
        Assert.assertFalse(loginPage.isLoginSuccessful());
    }
    @Step
    public void loginWithOnlyEmailAddressFieldFilled(String email) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillEmailAddressField(email);
        loginPage.clickLoginButton();
        Assert.assertFalse(loginPage.isLoginSuccessful());
    }
    @Step
    public void loginWithOnlyPasswordFieldFilled(String password) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillPasswordField(password);
        loginPage.clickLoginButton();
        Assert.assertFalse(loginPage.isLoginSuccessful());
    }
    @Step
    public void isWelcomeMessageDisplayed() {
        //TODO: Remove hardcoded parts later
        loginWithValidCredentials(Constants.VALID_EMAIL_ADDRESS, Constants.VALID_PASSWORD);
        Assert.assertTrue(headerPage.isWelcomeMessageCorrectlyDisplayed(Constants.VALID_FIRSTNAME));
    }
}
