package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class FramesPage extends BasePage {
    private By frameLocator = By.id("frame1");
    private By insideFrameButton = By.id("frameButton");
    public FramesPage(WebDriver driver) { super(driver); }
    public void switchToFrame() { util.switchToFrameByLocator(frameLocator); }
    public void clickButtonInsideFrame() { util.click(insideFrameButton); }
    public void switchBackToDefault() { util.switchToDefaultContent(); }
}
