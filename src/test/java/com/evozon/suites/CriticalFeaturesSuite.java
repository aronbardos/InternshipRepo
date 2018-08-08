package com.evozon.suites;

import com.evozon.tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RegistrationTest.class,
        LoginTest.class,
        CartTest.class,
        CheckoutTest.class
})
public class CriticalFeaturesSuite {
}