package com.evozon.steps;

import com.evozon.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class SearchSteps extends ScenarioSteps {
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
}
