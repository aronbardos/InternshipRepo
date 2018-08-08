package com.evozon.tests;

import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    @Test
    public void loginWithValidCredentials() {
        userSteps.login();
    }
}
