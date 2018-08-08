package com.evozon.tests;

import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/Test01_Login.csv")
public class LoginTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*CSV fields*/
    String email;
    String password;

    @Test
    public void loginWithValidCredentials() {
        userSteps.login(email, password);
    }
}
