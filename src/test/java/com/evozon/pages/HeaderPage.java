package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
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

    @FindBy(css = "[title=Register]")
    private WebElement registerLink;
    /*Links*/
    //@FindBy(css = ".last [title=Log In]")
    @FindBy(css = "#header-account > div > ul > li.last > a")
    private WebElement loginLink;

    /*Texts*/
    @FindBy(css = "h2")
    private WebElement newProductsTitle;

    /*Pictures*/
    @FindBy(css = ".large")
    private WebElement logoPicture;


    public void selectLanguageOption(final String option) {
        String languageCheck = new String();
        switch(option) {
            case Constants.LANGUAGE_ENGLISH:
                languageCheck = "PRODUCTS";
                break;
            case Constants.LANGUAGE_FRENCH:
                languageCheck = "PRODUITS";
                break;
            case Constants.LANGUAGE_GERMAN:
                languageCheck = "PRODUKTE";
                break;
        }

        Select languageSelection = new Select(languageDropdown);
        languageSelection.selectByVisibleText(option);
        Assert.assertTrue(newProductsTitle.getText().contains(languageCheck));
    }
    public void clickLanguageDropdown() {
        languageDropdown.click();
        Assert.assertTrue(languageDropdown.isDisplayed());
    }
    public void clickAccountbutton() {
        accountDropdownButton.click();
        Assert.assertTrue(accountDropdown.isDisplayed());
    }
    public void clickRegisterOption() {
        registerLink.click();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_REGISTER);
    }
    public void clickLoginOption() {
        loginLink.click();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_LOGIN);
    }
}
