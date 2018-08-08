package com.evozon.tests;

import com.evozon.entities.UserRegister;
import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/Test00_Register.csv")
public class RegistrationTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Register CSV fields*/
    String firstname;
    String lastname;
    String email;
    String password;
    String confirmation;

    @Test
    public void createUser() {
        UserRegister userRegister = new UserRegister();
        userSteps.registrate(firstname, lastname, email, password, confirmation);
        userSteps.registrate(userRegister);
    }
}
