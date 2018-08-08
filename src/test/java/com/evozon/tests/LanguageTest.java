package com.evozon.tests;

import com.evozon.steps.UserSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LanguageTest extends BaseTest {
    @Steps
    public UserSteps userSteps;

    /*Tests*/
    @Test
    public void changeLanguageToEnglish() {
        userSteps.changeLanguage(Constants.LANGUAGE_ENG);
    }
    @Test
    public void changeLanguageToFrench() {
        userSteps.changeLanguage(Constants.LANGUAGE_FRA);
    }
    @Test
    public void changeLanguageToGerman() {
        userSteps.changeLanguage(Constants.LANGUAGE_GER);
    }

    //TODO: Change language on multiple pages
}
