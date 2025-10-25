package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;
import java.util.Set;

public class WindowsPage extends BasePage {
    private By openWindowButton = By.id("openWindowBtn");
    public WindowsPage(WebDriver driver) { super(driver); }
    public void clickOpenWindow() { util.click(openWindowButton); }
    public void switchToNewWindow(String currentWindow) { Set<String> allWindows = driver.getWindowHandles(); for (String window : allWindows) { if (!window.equals(currentWindow)) { driver.switchTo().window(window); break; } } }
    public void switchBackToWindow(String windowHandle) { driver.switchTo().window(windowHandle); }
}
