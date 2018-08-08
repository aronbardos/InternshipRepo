package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage extends PageObject {
    /*Buttons*/
    @FindBy(css = ".skip-link.skip-account")
    private WebElement accountDropdownButton;

    /*Dropdowns*/
    @FindBy(css = "#header-account")
    private WebElement accountDropdown;
    @FindBy(id = "select-language")
    private WebElementFacade languageDropdown;

    /*Links*/
    @FindBy(css = "a[title='Log In']")
    private WebElement loginLink;
    @FindBy(css = "[title=Register]")
    private WebElement registerLink;

    /*Texts*/
    @FindBy(css = "h2")
    private WebElement newProductsTitle;

    /*Pictures*/
    @FindBy(css = ".large")
    private WebElement logoPicture;

    /*Verifications*/
    public boolean isTextUpdatedAfterLanguageChange(final String language) {
        String languageSample = new String();
        switch(language) {
            case Constants.LANGUAGE_ENG:
                languageSample = "PRODUCTS";
                break;
            case Constants.LANGUAGE_FRA:
                languageSample = "PRODUITS";
                break;
            case Constants.LANGUAGE_GER:
                languageSample = "PRODUKTE";
                break;
        }

        return newProductsTitle.getText().contains(languageSample);
    }

    /*Selections*/
    public void selectLanguageOption(final String option) {
        Select languageSelection = new Select(languageDropdown);
        languageSelection.selectByVisibleText(option);
    }

    /*Clicks*/
    public void clickLanguageDropdown() {
        languageDropdown.click();
    }
    public void clickAccountbutton() {
        accountDropdownButton.click();
    }
    public void clickRegisterOption() {
        registerLink.click();
    }
    public void clickLoginOption() {
        loginLink.click();
    }
}
