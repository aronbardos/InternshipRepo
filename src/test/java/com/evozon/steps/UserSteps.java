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

    /*Steps*/
    @Step
    public void changeLanguage(final String changeToLanguage) {
        homePage.open();
        headerPage.clickLanguageDropdown();
        headerPage.selectLanguageOption(changeToLanguage);
        Assert.assertTrue(headerPage.isTextUpdatedAfterLanguageChange(changeToLanguage));
    }
    @Step
    public void registrate(String firstname, String lastname, String email, String password, String confirmation) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(firstname, lastname, email, password, confirmation);
        registrationPage.clickRegisterButton();
        //Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_SUCCESSFUL_REGISTRATION);
        Assert.assertTrue(registrationPage.isRegistrationSuccessful());
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
        Assert.assertTrue(cartPage.isProductSuccessfullyAdded());
    }
    @Step
    public void placeOrder() {
        //TODO: Remove hardcoded parts
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

    /*StepGroups*/
    @StepGroup
    public void orderItem(){
        addProductToCart();
        placeOrder();
    }
}
