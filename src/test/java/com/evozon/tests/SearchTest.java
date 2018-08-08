package com.evozon.tests;

import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Tests*/
    //TODO: search for existing product
    //TODO: search for non-existing product
    //TODO: search by name
    //TODO: search by category
}
