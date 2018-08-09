package com.evozon.tests;

import com.evozon.entities.User;
import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozon.factories.UserFactory.generateUser;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Tests*/
    @Test
    public void loginWithInvalidCredentials() {
        User user = generateUser();
        userSteps.loginWithInvalidCredentials(user.getEmail(), user.getPassword());
    }
    @Test
    public void loginWithOnlyEmailAddressFieldFilled() {
        User user = generateUser();
        userSteps.loginWithOnlyEmailAddressFieldFilled(user.getEmail());
    }
    @Test
    public void loginWithOnlyPasswordFieldFilled() {
        User user = generateUser();
        userSteps.loginWithOnlyPasswordFieldFilled(user.getPassword());
    }
    @Ignore
    public void isWelcomeMessageDisplayedInHeader() {
        userSteps.isWelcomeMessageDisplayed();
    }
}
