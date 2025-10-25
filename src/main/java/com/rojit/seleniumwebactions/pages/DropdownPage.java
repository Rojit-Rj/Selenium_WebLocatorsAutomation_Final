package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class DropdownPage extends BasePage {
    private By dropdownLocator = By.id("dropdown");
    public DropdownPage(WebDriver driver) { super(driver); }
    public void selectOption(String visibleText) { util.selectDropdownByVisibleText(dropdownLocator, visibleText); }
    public String getSelectedOptionText() { return util.getText(dropdownLocator); }
}
