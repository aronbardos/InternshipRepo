package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.CartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CartTest extends BaseTest {

    @Steps
    public AllSteps allSteps;
    @Steps
    public CartSteps cartSteps;

    /*Tests*/
    @Test
    public void addProductToCart() {
        cartSteps.addRandomNewProductToCart();
    }

    //TODO: Modify the quantity of an item
    //TODO: Check displayed cart info
}

