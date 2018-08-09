package com.evozon.suites;

import com.evozon.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CompareTest.class,
        LanguageTest.class,
        LinksTest.class,
        WishlistTest.class

})
public class OtherFeaturesSuits {
}