package com.evozon.pages;

import com.evozon.utils.Constants;
import net.thucydides.core.pages.PageObject;

public class CategoryPage extends PageObject {

    /*Verification*/
    public boolean verifyHomeDecorLinkFunctionality() {
        return getDriver().getCurrentUrl().equals(Constants.URL_CATEGORY_HOME_DECOR);
    }
    public boolean verifyPrivateSalesLinkFunctionality() {
        return getDriver().getCurrentUrl().equals(Constants.URL_CATEGORY_VIP);
    }
    public boolean verifyTravelGearLinkFunctionality() {
        return getDriver().getCurrentUrl().equals(Constants.URL_CATEGORY_ACCESSORIES_BAGS);
    }
}
