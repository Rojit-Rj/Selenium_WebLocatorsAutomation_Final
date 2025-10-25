package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class AutoCompletePage extends BasePage {
    private By autocompleteInput = By.id("autocompleteInput");
    private By dropdownOptions = By.cssSelector(".autocomplete-items div");
    public AutoCompletePage(WebDriver driver) { super(driver); }
    public void typeText(String text) { util.type(autocompleteInput, text); }
    public void selectOption(String optionText) { util.waitForVisibility(dropdownOptions); driver.findElements(dropdownOptions).stream().filter(e -> e.getText().equalsIgnoreCase(optionText)).findFirst().ifPresent(e -> e.click()); }
}
