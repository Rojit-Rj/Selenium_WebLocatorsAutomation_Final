package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.RadioPage;

public class RadioTest extends Hooks {
    @Test(description = "Validate radio button selection")
    public void testRadioSelection() {
        test = extent.createTest("Radio Button Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Radio");

        RadioPage radioPage = new RadioPage(driver);
        radioPage.selectOption1();
        assert radioPage.isOption1Selected() : "Radio option 1 should be selected";

        radioPage.selectOption2();
        assert radioPage.isOption2Selected() : "Radio option 2 should be selected";
    }
}
