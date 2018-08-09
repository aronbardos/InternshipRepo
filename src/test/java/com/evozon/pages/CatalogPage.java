package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class CatalogPage extends PageObject {
    //@FindBy(css = "ul[class='products-grid products-grid--max-3-col first last odd']")
    @FindBy(css = "h2[class='product-name']")
    private List<WebElementFacade> displayedProductList;

    /*Verifications*/
    public boolean isProductFound(String query) {
        for(WebElementFacade element: displayedProductList) {
            if (element.getText().equalsIgnoreCase(query)) ;
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
