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

    /*Titles*/
    @FindBy(css = "ul[class=messages]")
    private WebElement cartUpdateMessage;

    /*Clicks*/
    public void clickProceedToCheckoutButton() {
        proceedToCheckoutButton.click();
    }
    public void clickContinue() {
        continueButton.click();
    }

    /*Verifications*/
    public boolean isProductSuccessfullyAdded() {
        return cartUpdateMessage.getText().contains("was added to your shopping cart.");
    }

    /*Complex methods*/
    public void proceedToCheckout() {
        clickProceedToCheckoutButton();
        clickContinue();
    }
}
