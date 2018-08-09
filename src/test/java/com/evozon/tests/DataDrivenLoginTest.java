package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/Test01_Login.csv")
public class DataDrivenLoginTest extends BaseTest {
    @Steps
    public LoginSteps loginSteps;

    /*CSV fields*/
    String email;
    String password;

    /*Tests*/
    @Test
    public void loginWithValidCredentials() {
        loginSteps.loginWithValidCredentials(email, password);
    }
}
