package com.evozon.tests;

import com.evozon.steps.AllSteps;
import com.evozon.steps.WishlistSteps;
import com.evozon.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WishlistTest extends BaseTest {
    @Steps
    public WishlistSteps wishlistSteps;

    /*Tests*/
    @Test
    public void addProductToWishlist() {
        wishlistSteps.addProductToWishlist(Constants.NEW_PRODUCT_ELIZABETH_KNIT_TOP);
    }
    public void accessWishlistFromHeader() {
        wishlistSteps.accessWishlistFromHeader();
    }

    //TODO: Check displayed info
    //TODO: Modify the quantity of an item
    //TODO: Remove item
}
