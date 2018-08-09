package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CheckoutTest extends BaseTest {
    @Steps
    public AllSteps allSteps;
    @Steps
    public CheckoutSteps checkoutSteps;

    /*Tests*/
    @Test
    public void placeOrder() {
        checkoutSteps.placeOrder();
    }

    //TODO: Data driven checkout form filling
    //TODO: Check displayed info
    //TODO: Input field validation
}
