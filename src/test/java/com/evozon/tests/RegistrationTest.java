package com.evozon.tests;

import com.evozon.entities.User;
import com.evozon.factories.UserFactory;
import com.evozon.steps.AllSteps;
import com.evozon.steps.RegistrationSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class RegistrationTest extends BaseTest {
    @Steps
    public RegistrationSteps registrationSteps;

    /*Tests*/
    @Test
    public void registrateRandomUser() {
        registrationSteps.registrateRandomUser();
    }
    @Test
    public void registrateSpecificUser() {
        //override the fields you want to specify
        User user = UserFactory.generateUser();
        registrationSteps.registrateSpecificUser(user);
    }

    //TODO: Check registration with invalid credentials
}
