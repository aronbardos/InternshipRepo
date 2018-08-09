package com.evozon.steps;

import com.evozon.entities.CheckoutUser;
import com.evozon.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {
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
    public void placeOrder() {
        //TODO: Remove hardcoded parts
        homePage.open();
        homePage.selectNewProduct2();
        productPage.selectOptions();
        productPage.clickAddToCart();
        Assert.assertTrue(cartPage.isProductSuccessfullyAdded());
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
    @Step
    public void placeOrder(CheckoutUser checkoutUser) {
        homePage.open();
        homePage.selectNewProduct2();
        productPage.selectOptions();
        productPage.clickAddToCart();
        Assert.assertTrue(cartPage.isProductSuccessfullyAdded());
        cartPage.proceedToCheckout();
        checkoutPage.fillBillingInformationForm(checkoutUser);
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
}
