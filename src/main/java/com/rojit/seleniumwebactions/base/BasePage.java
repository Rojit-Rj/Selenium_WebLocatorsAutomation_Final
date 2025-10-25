package com.rojit.seleniumwebactions.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.rojit.seleniumwebactions.utils.TestUtil;

public abstract class BasePage {
    protected WebDriver driver;
    protected TestUtil util;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.util = new TestUtil(driver);
        PageFactory.initElements(driver, this);
    }
}
