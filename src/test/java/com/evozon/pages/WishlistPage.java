package com.evozon.pages;

import com.evozon.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl(Constants.URL_WISHLIST)
public class WishlistPage extends PageObject {
    @FindBy(css = "h3[class='product-name']")
    List<WebElementFacade> wishListProductsList;

    /*Verifications*/
    public boolean isProductInWishlist(String productName) {
        for (WebElementFacade element: wishListProductsList) {
            if (element.getText().equalsIgnoreCase(productName));
                return true;
        }
        return false;
    }
    public boolean isPageOpened() {
        return getDriver().getCurrentUrl().equals(Constants.URL_WISHLIST);
    }
}
