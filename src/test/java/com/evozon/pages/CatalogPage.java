package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class CatalogPage extends PageObject {
    @FindBy(css = "h2[class='product-name']")
    private List<WebElementFacade> displayedProductList;

    /*Verifications*/
    public boolean isProductFoundByFullName(String query) {
        for(WebElementFacade element: displayedProductList) {
            if (element.getText().equalsIgnoreCase(query))
                return true;
        }
        return false;
    }
    public boolean isProductFoundByKeyword(String query) {
        for(WebElementFacade element: displayedProductList) {
            if (element.getText().contains(query.toUpperCase()))
                return true;
        }
        return false;
    }
    public boolean isOnlyRelevantProductsFound(String query) {
        for(WebElementFacade element: displayedProductList)
            if (element.getText() != query.toUpperCase())
                return false;
        return true;
    }
}
