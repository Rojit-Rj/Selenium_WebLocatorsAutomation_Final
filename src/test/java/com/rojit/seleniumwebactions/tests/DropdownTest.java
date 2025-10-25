package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.DropdownPage;

public class DropdownTest extends Hooks {
    @Test(description = "Verify dropdown selection happy path")
    public void testDropdownSelect() {
        test = extent.createTest("Dropdown Select Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");

        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.selectOption("Option1");
        String selected = dropdownPage.getSelectedOptionText();

        assert selected.equals("Option1") : "Dropdown did not select Option1 as expected!";
    }

    @Test(description = "Verify dropdown negative case - invalid selection")
    public void testInvalidDropdownSelection() {
        test = extent.createTest("Dropdown Invalid Selection");
        driver.get("https://web-locators-static-site-qa.vercel.app/Dropdown");

        DropdownPage dropdownPage = new DropdownPage(driver);
        String selected = dropdownPage.getSelectedOptionText();

        assert !selected.equals("InvalidOption") : "Dropdown should not have selected invalid option!";
    }
}
