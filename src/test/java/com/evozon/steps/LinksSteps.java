package com.evozon.steps;

import com.evozon.pages.*;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LinksSteps extends ScenarioSteps {
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

    public void verifyHomepageHomeDecorCategoryLink() {
        homePage.open();
        homePage.clickHomeDecorLink();
        Assert.assertTrue(categoryPage.verifyHomeDecorLinkFunctionality());
    }
    public void verifyHomepagePrivateSalesCategoryLink() {
        homePage.open();
        homePage.clickPrivateSalesLink();
        Assert.assertTrue(categoryPage.verifyPrivateSalesLinkFunctionality());
    }
    public void verifyHomepageTravelGearCategoryLink() {
        homePage.open();
        homePage.clickTravelGearLink();
        Assert.assertTrue(categoryPage.verifyTravelGearLinkFunctionality());
    }
    public void verifyHomePageCategoryLinks() {
        verifyHomepageHomeDecorCategoryLink();
        verifyHomepagePrivateSalesCategoryLink();
        verifyHomepageTravelGearCategoryLink();
    }
}
