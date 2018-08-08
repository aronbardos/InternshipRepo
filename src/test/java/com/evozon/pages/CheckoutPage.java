package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckoutPage extends PageObject {
    /*Input fields*/
    @FindBy(id = "billing:firstname")
    private WebElement firstname;
    @FindBy(id = "billing:lastname")
    private WebElement lastname;
    @FindBy(id = "billing:email")
    private WebElement emailAddress;
    @FindBy(id = "billing:street1")
    private WebElement address;
    @FindBy(id = "billing:city")
    private WebElement city;
    @FindBy(css = ".input-box [id='billing:region_id']")
    private WebElementFacade region;
    @FindBy(id = "billing:postcode")
    private WebElement postalcode;
    @FindBy(id = "billing:country_id")
    private WebElementFacade country;
    @FindBy(id = "billing:telephone")
    private WebElement phone;

    /*Buttons*/
    @FindBy(css = ".buttons-set [title=Continue]")
    private WebElement continueButton;
    @FindBy(css = "#review-buttons-container > button")
    private WebElement placeOrderbutton;
    @FindBy(css = ".buttons-set [onclick='payment.save()']")
    private WebElement paymentMethodContinueButton;
    @FindBy(css = ".buttons-set [onclick='shippingMethod.save()']")
    private WebElement shippingMethodContinueButton;

    /*Radio buttons*/
    @FindBy(id = "s_method_flatrate_flatrate")
    private WebElement shippingMethodFixedRadioButton;
    @FindBy(id = "p_method_cashondelivery")
    private WebElement paymentInformationCashOnDeliveryRadioButton;

    /*Titles*/
    @FindBy(id = "shipping-please-wait")
    private WebElementFacade shippingMethodWaitTitle;
    @FindBy(id = "billing-please-wait")
    private WebElementFacade billingMethodFormWaitTitle;
    @FindBy(id = "payment-please-wait")
    private WebElement paymentInformationFormWaitTitle;
    @FindBy(id = "map-popup")
    private WebElement successfulOrderPageTitle;
    @FindBy(id = "checkout-step-review")
    private WebElement orderReviewPageTitle;

    /*Waits*/
    public void waitForBillingFormToBeLoaded() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(billingMethodFormWaitTitle).waitUntilNotVisible();
    }
    public void waitForPaymentInformationFormToBeLoaded() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(paymentInformationFormWaitTitle).waitUntilNotVisible();
    }
    public void waitForOrderProcessing() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(orderReviewPageTitle).waitUntilNotVisible();
    }

    /*Clicks*/
    public void clickContinueButton() {
        continueButton.click();
    }
    public void clickShippingMethodContinueButton() {
        shippingMethodContinueButton.click();
    }
    public void clickPlaceOrderButton() {
        placeOrderbutton.click();
    }
    public void clickPaymentMethodContinueButton() {
        paymentMethodContinueButton.click();
    }

    /*Fills*/
    public void fillBillingInformationForm() {
        fillCountryField();
        fillFirstNameField();
        fillLastNameField();
        fillEmailAddressField();
        fillAddressField();
        fillCityField();
        fillPostalCodeField();
        fillRegionField();
        fillPhoneField();
    }
    public void fillFirstNameField() {
        firstname.sendKeys(Constants.VALID_FIRSTNAME);
    }
    public void fillLastNameField() {
        lastname.sendKeys(Constants.VALID_LASTNAME);
    }
    public void fillEmailAddressField() {
        emailAddress.sendKeys(Constants.VALID_EMAIL_ADDRESS);
    }
    public void fillAddressField() {
        address.sendKeys(Constants.VALID_ADDRESS);
    }
    public void fillCityField() {
        city.sendKeys(Constants.VALID_CITY);
    }
    public void fillPostalCodeField() {
        postalcode.sendKeys(Constants.VALID_POSTAL_CODE);
    }
    public void fillCountryField() {
        country.selectByVisibleText(Constants.VALID_COUNTRY);
        country.sendKeys();
    }
    public void fillRegionField() {
        region.selectByVisibleText(Constants.VALID_REGION);
    }
    public void fillPhoneField() {
        phone.sendKeys(Constants.VALID_PHONE_NUMBER);
    }

    public void fillShippingMethodForm() {
        shippingMethodFixedRadioButton.click();
    }
    public void fillPaymentInformationForm() {
        paymentInformationCashOnDeliveryRadioButton.click();
    }
}
