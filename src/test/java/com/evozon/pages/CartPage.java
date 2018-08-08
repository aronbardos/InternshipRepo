package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CartPage extends PageObject {
    /*Buttons*/
    @FindBy(css = "[title='Proceed to Checkout']")
    private WebElement proceedToCheckoutButton;
    @FindBy(id = "onepage-guest-register-button")
    private WebElement continueButton;

    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }
    public void clickContinue() {
        continueButton.click();
    }
    public void proceedToCheckout() {
        clickProceedToCheckoutButton();
        clickContinue();
    }
}
