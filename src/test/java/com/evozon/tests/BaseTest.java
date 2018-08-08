package com.evozon.tests;

import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    @Managed(uniqueSession = true)
    public WebDriver firefoxDriver;

    @Before
    public void init() {
        firefoxDriver.manage().window().maximize();
    }
}
