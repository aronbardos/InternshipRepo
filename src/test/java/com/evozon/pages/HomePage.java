package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

//TODO: flexible mathods

@DefaultUrl(Constants.URL_BASE)
public class HomePage extends PageObject {
    /*Texts*/
    @FindBy(css = "h2")
    private WebElementFacade newProductsTitle;

    /*Links*/
    @FindBy(css = "[title~=Chelsea]")
    private WebElement newProduct;

    public void selectNewProduct() {
        newProduct.click();
    }
}