package com.evozon.suites;

import com.evozon.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LanguageTest.class,
        WishlistTest.class
})
public class OtherFeaturesSuits {
}