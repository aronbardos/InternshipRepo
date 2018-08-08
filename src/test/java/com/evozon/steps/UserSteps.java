package com.evozon.steps;

import com.evozon.entities.User;
import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class UserSteps {
    /*Pages*/
    private HomePage         homePage;
    private RegistrationPage registrationPage;
    private ProductPage      productPage;
    private HeaderPage       headerPage;
    private CartPage         cartPage;
    private CheckoutPage     checkoutPage;
    private LoginPage        loginPage;

    @Step
    public void changeLanguage() {
        homePage.open();
        headerPage.clickLanguageDropdown();
        headerPage.selectLanguageOption(Constants.LANGUAGE_ENGLISH);
    }
    @Step
    public void registrate(String firstname, String lastname, String email, String password, String confirmation) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(firstname, lastname, email, password, confirmation);
        registrationPage.clickRegisterButton();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_SUCCESSFUL_REGISTRATION);
    }
    @Step
    public void registrate(User user) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(user);
        registrationPage.clickRegisterButton();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_SUCCESSFUL_REGISTRATION);
    }
    @Step
    public void login(String email, String password) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillFields(email, password);
        loginPage.clickLoginButton();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_MY_ACCOUNT);
    }
    @Step
    public void addProductToCart() {
        homePage.open();
        homePage.selectNewProduct();
        productPage.selectOptions();
        productPage.clickAddToCart();
    }
    @Step
    public void placeOrder() {
        addProductToCart();
        cartPage.proceedToCheckout();
        checkoutPage.fillBillingInformationForm();
        checkoutPage.clickContinueButton();
        checkoutPage.waitForBillingFormToBeLoaded();
        checkoutPage.fillShippingMethodForm();
        checkoutPage.clickShippingMethodContinueButton();
        checkoutPage.fillPaymentInformationForm();
        checkoutPage.clickPaymentMethodContinueButton();
        checkoutPage.waitForPaymentInformationFormToBeLoaded();
        checkoutPage.clickPlaceOrderButton();
        checkoutPage.waitForOrderProcessing();
        Assert.assertEquals(checkoutPage.getDriver().getCurrentUrl(), Constants.URL_SUCCESSFUL_ORDER);
    }

    @StepGroup
    public void group(){
        addProductToCart();
        placeOrder();
    }
}
