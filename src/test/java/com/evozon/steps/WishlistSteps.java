package com.evozon.steps;

import com.evozon.pages.*;
import com.evozon.utils.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class WishlistSteps extends ScenarioSteps {
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
    public void addProductToWishlist(String productName) {
        //hardcoded login, cause verification is not the point here
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillFields(Constants.VALID_EMAIL_ADDRESS, Constants.VALID_PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLoginSuccessful());
        homePage.open();
        homePage.selectNewProduct(productName);
        productPage.clickAddToWishlist();
        Assert.assertTrue(wishlistPage.isProductInWishlist(productName));
    }
    @Step
    public void accessWishlistFromHeader() {
        //hardcoded login, cause verification is not the point here
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickLoginOption();
        loginPage.fillFields(Constants.VALID_EMAIL_ADDRESS, Constants.VALID_PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.isLoginSuccessful());
        headerPage.clickWishlistOption();
        Assert.assertTrue(wishlistPage.isPageOpened());
    }
}
