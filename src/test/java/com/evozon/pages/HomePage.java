package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

//TODO: flexible mathods

@DefaultUrl(Constants.URL_BASE)
public class HomePage extends PageObject {
    /*Links*/
    @FindBy(css = "img[alt='Elizabeth Knit Top']")
    private WebElement newproduct1;
    @FindBy(css = "img[alt='Chelsea Tee']")
    private WebElement newProduct2;
    @FindBy(css = "h3[class='product-name']")
    private List<WebElementFacade> newProductsList;
    @FindBy(css = "img[alt~='Physical']")
    private WebElement homeDecorLink;
    @FindBy(css = "img[alt~='Private']")
    private WebElement privateSalesLink;
    @FindBy(css = "img[alt~='Travel']")
    private WebElement travelGearLink;

    /*Selections*/
    public void selectNewProduct1() {
        newproduct1.click();
    }
    public void selectNewProduct2() {
        newProduct2.click();
    }
    public void selectNewProduct(String productName) {
        for (WebElementFacade element: newProductsList) {
            if (element.getText().equalsIgnoreCase(productName)); {
                element.click();
                return;
            }
        }
    }

    /*Clicks*/
    public void clickHomeDecorLink() {
        homeDecorLink.click();
    }
    public void clickPrivateSalesLink() {
        privateSalesLink.click();
    }
    public void clickTravelGearLink() {
        travelGearLink.click();
    }
}