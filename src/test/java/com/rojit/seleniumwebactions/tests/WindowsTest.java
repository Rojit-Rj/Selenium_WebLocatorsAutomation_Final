package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.WindowsPage;

public class WindowsTest extends Hooks {
    @Test(description = "Test opening new window and switching")
    public void testWindowSwitching() {
        test = extent.createTest("Windows Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Windows");

        WindowsPage windowsPage = new WindowsPage(driver);
        String mainWindow = driver.getWindowHandle();

        windowsPage.clickOpenWindow();
        windowsPage.switchToNewWindow(mainWindow);

        windowsPage.switchBackToWindow(mainWindow);
    }
}
