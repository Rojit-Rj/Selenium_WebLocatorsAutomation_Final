package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class RadioPage extends BasePage {
    private By radioOption1 = By.id("radio1");
    private By radioOption2 = By.id("radio2");
    public RadioPage(WebDriver driver) { super(driver); }
    public void selectOption1() { util.click(radioOption1); }
    public void selectOption2() { util.click(radioOption2); }
    public boolean isOption1Selected() { return driver.findElement(radioOption1).isSelected(); }
    public boolean isOption2Selected() { return driver.findElement(radioOption2).isSelected(); }
}
