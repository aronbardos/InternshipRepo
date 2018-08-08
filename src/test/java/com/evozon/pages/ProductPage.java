package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
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
    public void clickAddToCart() {
        addToCartButton.click();
        Assert.assertEquals(getDriver().getCurrentUrl(), Constants.URL_CART);
    }
}
