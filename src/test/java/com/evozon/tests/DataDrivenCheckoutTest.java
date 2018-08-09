package com.evozon.tests;

import com.evozon.entities.CheckoutUser;
import com.evozon.steps.AllSteps;
import com.evozon.steps.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/Test03_Checkout.csv")
public class DataDrivenCheckoutTest extends BaseTest {
    @Steps
    public CheckoutSteps checkoutSteps;

    /*CSV fields*/
    String firstname;
    String lastname;
    String address;
    String email;
    String city;
    String postalcode;
    String phone;
    int state;
    int country;

    /*Tests*/
    @Test
    public void placeOrder() {
        CheckoutUser checkoutUser = new CheckoutUser(firstname, lastname, address, email, city, postalcode, phone, state, country);
        checkoutSteps.placeOrder(checkoutUser);
    }
}
