package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.CompareSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CompareTest extends BaseTest {
    @Steps
    public CompareSteps compareSteps;

    /*Tests*/
    @Test
    public void addProductToComparisonList() {
        compareSteps.addProductToComparisonList(Constants.NEW_PRODUCT_ELIZABETH_KNIT_TOP);
    }
}
