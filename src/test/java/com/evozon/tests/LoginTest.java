package com.evozon.tests;

import com.evozon.entities.User;
import com.evozon.steps.AllSteps;
import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozon.factories.UserFactory.generateUser;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {
    @Steps
    public LoginSteps loginSteps;

    /*Tests*/
    @Test
    public void loginWithInvalidCredentials() {
        User user = generateUser();
        loginSteps.loginWithInvalidCredentials(user.getEmail(), user.getPassword());
    }
    @Test
    public void loginWithOnlyEmailAddressFieldFilled() {
        User user = generateUser();
        loginSteps.loginWithOnlyEmailAddressFieldFilled(user.getEmail());
    }
    @Test
    public void loginWithOnlyPasswordFieldFilled() {
        User user = generateUser();
        loginSteps.loginWithOnlyPasswordFieldFilled(user.getPassword());
    }
    @Ignore
    public void isWelcomeMessageDisplayedInHeader() {
        loginSteps.isWelcomeMessageDisplayed();
    }
}
