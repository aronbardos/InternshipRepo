package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProductPage extends PageObject {
    /*Buttons*/
    @FindBy(id = "swatch20")
    private WebElement selectColorButton;
    @FindBy(id = "option81")
    private WebElement selectSizeButton;
    @FindBy(css = ".add-to-cart-buttons [title='Add to Cart']")
    private WebElement addToCartButton;

    /*Links*/
    @FindBy(css = "a[class='link-wishlist']")
    private WebElement addToWishlistLink;
    @FindBy(css = "a[class='link-compare']")
    private WebElement addToCompareLink;

    /*Messages*/
    @FindBy(id = "messages_product_view")
    private WebElement addedToComparisonListMessage;

    /*Verifications*/
    public boolean isAdditionToComparisonListSuccessful() {
        return addedToComparisonListMessage.isDisplayed();
    }

    /*Selections*/
    public void selectColor() {
        selectColorButton.click();
    }
    public void selectSize() {
        selectSizeButton.click();
    }
    public void selectOptions() {
        selectColor();
        selectSize();
    }

    /*Clicks*/
    public void clickAddToCart() {
        addToCartButton.click();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_CART);
    }
    public void clickAddToWishlist() {
        addToWishlistLink.click();
    }
    public void clickAddToCompare() {
        addToCompareLink.click();
    }
}
