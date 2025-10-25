package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.AutoCompletePage;

public class AutoCompleteTest extends Hooks {
    @Test(description = "Validate auto-complete typing and selection")
    public void testAutoCompleteSelection() {
        test = extent.createTest("AutoComplete Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/AutoComplete");

        AutoCompletePage page = new AutoCompletePage(driver);
        page.typeText("Uni");
        page.selectOption("United States");
    }
}
