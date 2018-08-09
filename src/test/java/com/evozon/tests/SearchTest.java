package com.evozon.tests;

import com.evozon.steps.UserSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Tests*/
    @Test
    public void searchByName() {
        userSteps.searchByName(Constants.QUERY_CHELSEA_TEE);
    }
    @Test
    public void searchResultContainsOnlyRelevantProducts() {
        userSteps.searchResultContainsOnlyRelevantProducts(Constants.QUERY_CHELSEA_TEE);
    }

    //TODO: search by category
}
