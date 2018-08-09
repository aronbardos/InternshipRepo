package com.evozon.steps;

import com.evozon.entities.User;
import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;

public class UserSteps {
    /*Pages*/
    private HomePage         homePage;
    private RegistrationPage registrationPage;
    private ProductPage      productPage;
    private HeaderPage       headerPage;
    private CartPage         cartPage;
    private CheckoutPage     checkoutPage;
    private LoginPage        loginPage;
    private CatalogPage      catalogPage;

    /*Steps*/
    @Step
    public void changeLanguage(final String changeToLanguage) {
        homePage.open();
        headerPage.clickLanguageDropdown();
        headerPage.selectLanguageOption(changeToLanguage);
        Assert.assertTrue(headerPage.isLanguageChangeSuccessful(changeToLanguage));
    }

    /*Registration*/
    @Step
    public void registrate(String firstname, String lastname, String email, String password, String confirmation) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(firstname, lastname, email, password, confirmation);
        registrationPage.clickRegisterButton();
        Assert.assertTrue(registrationPage.isRegistrationSuccessful());
    }
    @Step
    public void registrate(User user) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(user);
        registrationPage.clickRegisterButton();
        Assert.assertTrue(registrationPage.isRegistrationSuccessful());
    }

    /*Login*/
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

    /*Cart*/
    @Step
    public void addProductToCart() {
        homePage.open();
        homePage.selectNewProduct();
        productPage.selectOptions();
        productPage.clickAddToCart();
        Assert.assertTrue(cartPage.isProductSuccessfullyAdded());
    }

    /*Checkout*/
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
        Assert.assertTrue(checkoutPage.isOrderSuccessful());
    }

    /*Search*/
    public void searchByName(String query) {
        homePage.open();
        headerPage.clickSearchbar();
        headerPage.fillSearchbar(query);
        headerPage.clickSearchbarButton();
        Assert.assertTrue(catalogPage.isProductFound(query));
    }
    public void searchResultContainsOnlyRelevantProducts(String query) {
        homePage.open();
        headerPage.clickSearchbar();
        headerPage.fillSearchbar(query);
        headerPage.clickSearchbarButton();
        Assert.assertTrue(catalogPage.isOnlyRelevantProductsFound(query));
    }

    /*StepGroups*/
    @StepGroup
    public void orderItem(){
        addProductToCart();
        placeOrder();
    }
}
