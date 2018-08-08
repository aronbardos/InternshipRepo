package com.evozon.tests;

import com.evozon.entities.User;
import com.evozon.factories.UserFactory;
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
    public void createSpecificUser() {
        userSteps.registrate(firstname, lastname, email, password, confirmation);
    }
    @Test
    public void createRandomUser() {
        User user = UserFactory.generateUser();
        userSteps.registrate(user);
    }
}
