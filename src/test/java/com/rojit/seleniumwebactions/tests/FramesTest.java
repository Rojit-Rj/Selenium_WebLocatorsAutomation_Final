package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.FramesPage;

public class FramesTest extends Hooks {
    @Test(description = "Test frame switching and button click inside frame")
    public void testFrameOperation() {
        test = extent.createTest("Frame Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Frames");

        FramesPage framesPage = new FramesPage(driver);
        framesPage.switchToFrame();
        framesPage.clickButtonInsideFrame();
        framesPage.switchBackToDefault();
    }
}
