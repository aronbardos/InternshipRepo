package com.evozon.steps;

import com.evozon.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CompareSteps extends ScenarioSteps {
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
    public void addProductToComparisonList(String productName) {
        homePage.open();
        homePage.selectNewProduct(productName);
        productPage.clickAddToCompare();
        Assert.assertTrue(productPage.isAdditionToComparisonListSuccessful());
    }
}
