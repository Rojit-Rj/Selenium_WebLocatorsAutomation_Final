package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.AlertsPage;

public class AlertsTest extends Hooks {
    @Test(description = "Validate alert popping and acceptance")
    public void testAlert() {
        test = extent.createTest("Alert Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Alerts");

        AlertsPage alertsPage = new AlertsPage(driver);
        alertsPage.clickAlertButton();
        alertsPage.acceptAlert();
    }
}
