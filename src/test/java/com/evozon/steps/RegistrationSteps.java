package com.evozon.steps;

import com.evozon.entities.User;
import com.evozon.factories.UserFactory;
import com.evozon.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class RegistrationSteps extends ScenarioSteps {
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
    public void registrate(String firstname, String lastname, String email, String password, String confirmation) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(firstname, lastname, email, password, confirmation);
        registrationPage.clickRegisterButton();
        Assert.assertTrue(registrationPage.isRegistrationSuccessful());
    }
    @Step
    public void registrateRandomUser() {
        User user = UserFactory.generateUser();
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(user);
        registrationPage.clickRegisterButton();
        Assert.assertTrue(registrationPage.isRegistrationSuccessful());
    }
    @Step
    public void registrateSpecificUser(User user) {
        homePage.open();
        headerPage.clickAccountbutton();
        headerPage.clickRegisterOption();
        registrationPage.fillFields(user);
    }
}
