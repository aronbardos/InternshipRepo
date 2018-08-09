package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.LanguageSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LanguageTest extends BaseTest {
    @Steps
    public LanguageSteps languageSteps;

    /*Tests*/
    @Test
    public void changeLanguageToEnglish() {
        languageSteps.changeLanguage(Constants.LANGUAGE_ENG);
    }
    @Test
    public void changeLanguageToFrench() {
        languageSteps.changeLanguage(Constants.LANGUAGE_FRA);
    }
    @Test
    public void changeLanguageToGerman() {
        languageSteps.changeLanguage(Constants.LANGUAGE_GER);
    }

    //TODO: Verify on multiple pages
}
