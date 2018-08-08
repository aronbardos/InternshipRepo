package com.evozon.suites;

import com.evozon.tests.CartTest;
import com.evozon.tests.LanguageTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CartTest.class,
        LanguageTest.class
})
public class MainFeaturesSuite {
}