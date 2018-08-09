package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.LinksSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LinksTest extends BaseTest {
    @Steps
    public LinksSteps linksSteps;

    /*Tests*/
    @Test
    public void verifyHomepageHomeDecorCategoryLink() {
        linksSteps.verifyHomepageHomeDecorCategoryLink();
    }
    @Test
    public void verifyHomepagePrivateSalesCategoryLink() {
        linksSteps.verifyHomepagePrivateSalesCategoryLink();
    }
    @Test
    public void verifyHomepageTravelGearCategoryLink() {
        linksSteps.verifyHomepageTravelGearCategoryLink();
    }

}
