package com.rojit.seleniumwebactions.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.rojit.seleniumwebactions.utils.BrowserFactory;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String browser = System.getProperty("browser", "chrome");
        driver = BrowserFactory.initializeDriver(browser);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
