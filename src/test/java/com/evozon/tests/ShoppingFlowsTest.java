package com.evozon.tests;

import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class ShoppingFlowsTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    @Test
    public void addProductToCart() {
        userSteps.addProductToCart();
    }
    @Test
    public void placeOrder() {
        userSteps.placeOrder();
    }

    @StepGroup
    public void placeASimpleOrder() {
        addProductToCart();
        placeOrder();
    }
}
