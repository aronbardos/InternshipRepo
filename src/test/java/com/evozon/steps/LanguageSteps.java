package com.evozon.steps;

import com.evozon.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class LanguageSteps extends ScenarioSteps {
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
    public void changeLanguage(final String changeToLanguage) {
        homePage.open();
        headerPage.clickLanguageDropdown();
        headerPage.selectLanguageOption(changeToLanguage);
        Assert.assertTrue(headerPage.isLanguageChangeSuccessful(changeToLanguage));
    }
}
