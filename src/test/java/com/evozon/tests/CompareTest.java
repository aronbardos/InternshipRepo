package com.evozon.tests;

import com.evozon.steps.UserSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CompareTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Tests*/
    @Test
    public void addProductToComparisonList() {
        userSteps.addProductToComparisonList(Constants.NEW_PRODUCT_ELIZABETH_KNIT_TOP);
    }
}
