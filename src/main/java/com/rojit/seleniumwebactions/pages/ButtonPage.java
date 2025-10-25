package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class ButtonPage extends BasePage {
    private By clickButton = By.id("btnClick");
    private By doubleClickButton = By.id("btnDoubleClick");
    private By messageText = By.id("message");

    public ButtonPage(WebDriver driver) { super(driver); }

    public void clickButton() { util.click(clickButton); }
    public void doubleClickButton() { util.click(doubleClickButton); }
    public String getMessage() { return util.getText(messageText); }
}
