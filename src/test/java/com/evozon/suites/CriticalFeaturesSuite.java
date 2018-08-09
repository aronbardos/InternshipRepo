package com.evozon.suites;

import com.evozon.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CartTest.class,
        CheckoutTest.class,
        DataDrivenCheckoutTest.class,
        DataDrivenLoginTest.class,
        DataDrivenRegistrationTest.class,
        LoginTest.class,
        RegistrationTest.class,
        SearchTest.class
})
public class CriticalFeaturesSuite {
}