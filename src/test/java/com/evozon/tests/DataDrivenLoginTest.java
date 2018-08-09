package com.evozon.tests;

import com.evozon.entities.User;
import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozon.factories.UserFactory.generateUser;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/Test01_Login.csv")
public class DataDrivenLoginTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*CSV fields*/
    String email;
    String password;

    /*Tests*/
    @Test
    public void loginWithValidCredentials() {
        userSteps.loginWithValidCredentials(email, password);
    }
}
