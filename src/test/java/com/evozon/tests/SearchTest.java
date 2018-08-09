package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.SearchSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class SearchTest extends BaseTest {
    @Steps
    public SearchSteps searchSteps;

    /*Tests*/
    @Test
    public void searchByFullName() {
        searchSteps.searchByName(Constants.QUERY_CHELSEA_TEE);
    }
    @Test
    public void searchByKeyword() {
        searchSteps.searchByKeyword(Constants.QUERY_EYEGLASSES);
    }
    @Test
    public void searchResultContainsOnlyRelevantProducts() {
        searchSteps.searchResultContainsOnlyRelevantProducts(Constants.QUERY_CHELSEA_TEE);
    }

    //TODO: search by category
}
