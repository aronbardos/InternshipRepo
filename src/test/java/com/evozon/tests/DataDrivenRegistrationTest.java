package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.RegistrationSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/Test00_Register.csv")
public class DataDrivenRegistrationTest extends BaseTest {
    @Steps
    public RegistrationSteps registrationSteps;

    /*CSV fields*/
    String firstname;
    String lastname;
    String email;
    String password;
    String confirmation;

    /*Tests*/
    @Test
    public void registrateSpecificUser() {
        registrationSteps.registrate(firstname, lastname, email, password, confirmation);
    }
}
