package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class CheckboxPage extends BasePage {
    private By checkbox1 = By.id("checkbox1");
    public CheckboxPage(WebDriver driver) { super(driver); }
    public void checkCheckbox1() { if (!driver.findElement(checkbox1).isSelected()) util.click(checkbox1); }
    public void uncheckCheckbox1() { if (driver.findElement(checkbox1).isSelected()) util.click(checkbox1); }
    public boolean isCheckbox1Selected() { return driver.findElement(checkbox1).isSelected(); }
}
