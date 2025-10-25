package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.CheckboxPage;

public class CheckboxTest extends Hooks {
    @Test(description = "Validate checkbox selection toggling")
    public void testCheckbox1Toggle() {
        test = extent.createTest("Checkbox1 Toggle Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Checkbox");

        CheckboxPage checkboxPage = new CheckboxPage(driver);
        checkboxPage.checkCheckbox1();
        assert checkboxPage.isCheckbox1Selected() : "Checkbox1 should be selected after check";

        checkboxPage.uncheckCheckbox1();
        assert !checkboxPage.isCheckbox1Selected() : "Checkbox1 should not be selected after uncheck";
    }
}
