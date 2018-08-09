package com.evozon.steps;

import com.evozon.entities.User;
import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class UserSteps {
    /*Pages*/
    private CartPage         cartPage;
    private CatalogPage      catalogPage;
    private CheckoutPage     checkoutPage;
    private HeaderPage       headerPage;
    private HomePage         homePage;
    private LoginPage        loginPage;
    private ProductPage      productPage;
    private RegistrationPage registrationPage;
    private WishlistPage     wishlistPage;

    /*Steps*/
    /*Regional*/
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
        homePage.selectNewProduct2();
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
    @Step
    public void searchByName(String query) {
        homePage.open();
        headerPage.clickSearchbar();
        headerPage.fillSearchbar(query);
        headerPage.clickSearchbarButton();
        Assert.assertTrue(catalogPage.isProductFoundByFullName(query));
    }
    @Step
    public void searchByKeyword(String query) {
        homePage.open();
        headerPage.clickSearchbar();
        headerPage.fillSearchbar(query);
        headerPage.clickSearchbarButton();
        Assert.assertTrue(catalogPage.isProductFoundByKeyword(query));
    }
    @Step
    public void searchResultContainsOnlyRelevantProducts(String query) {
        homePage.open();
        headerPage.clickSearchbar();
        headerPage.fillSearchbar(query);
        headerPage.clickSearchbarButton();
        Assert.assertTrue(catalogPage.isOnlyRelevantProductsFound(query));
    }

    /*Wishlist*/
    @Step
    public void addProductToWishlist(String productName) {
        //hardcoded login, cause verification is not the point here
        loginWithValidCredentials(Constants.VALID_EMAIL_ADDRESS, Constants.VALID_PASSWORD);
        homePage.open();
        homePage.selectNewProduct(productName);
        productPage.clickAddToWishlist();
        Assert.assertTrue(wishlistPage.isProductInWishlist(productName));
    }
    @Step
    public void accessWishlistFromHeader() {
        loginWithValidCredentials(Constants.VALID_EMAIL_ADDRESS, Constants.VALID_PASSWORD);
        headerPage.clickWishlistOption();
        Assert.assertTrue(wishlistPage.isPageOpened());
    }
}
