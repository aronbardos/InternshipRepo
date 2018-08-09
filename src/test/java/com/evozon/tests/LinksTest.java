package com.evozon.tests;

import com.evozon.steps.UserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LinksTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Tests*/
    @Test
    public void verifyHomepageHomeDecorCategoryLink() {
        userSteps.verifyHomepageHomeDecorCategoryLink();
    }
    @Test
    public void verifyHomepagePrivateSalesCategoryLink() {
        userSteps.verifyHomepagePrivateSalesCategoryLink();
    }
    @Test
    public void verifyHomepageTravelGearCategoryLink() {
        userSteps.verifyHomepageTravelGearCategoryLink();
    }

}
