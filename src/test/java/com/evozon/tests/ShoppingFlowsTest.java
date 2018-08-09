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

    /*Tests*/
    @Test
    public void placeASimpleOrder() {
        userSteps.orderItem();
    }

    //TODO: create more happy flows
    //TODO: create #sadFlows
}
