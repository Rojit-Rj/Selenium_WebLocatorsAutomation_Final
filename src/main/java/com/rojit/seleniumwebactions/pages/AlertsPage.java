package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class AlertsPage extends BasePage {
    private By alertButton = By.id("alertBtn");
    public AlertsPage(WebDriver driver) { super(driver); }
    public void clickAlertButton() { util.click(alertButton); }
    public void acceptAlert() { util.acceptAlert(); }
}
