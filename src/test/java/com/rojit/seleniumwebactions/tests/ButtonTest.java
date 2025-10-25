package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.ButtonPage;

public class ButtonTest extends Hooks {
    @Test(description = "Validate button clicks and verify message")
    public void testButtonClick() {
        test = extent.createTest("Button Click Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Button");

        ButtonPage buttonPage = new ButtonPage(driver);
        buttonPage.clickButton();
        String message = buttonPage.getMessage();

        assert message.contains("Clicked") : "Expected message not displayed!";
    }

    @Test(description = "Edge case test - No message on invalid click")
    public void testInvalidScenario() {
        test = extent.createTest("Invalid Button Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Button");

        ButtonPage buttonPage = new ButtonPage(driver);
        String message = buttonPage.getMessage();

        assert message.isEmpty() : "Message should be empty without click!";
    }
}
