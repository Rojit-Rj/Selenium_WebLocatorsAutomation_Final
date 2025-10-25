package com.rojit.seleniumwebactions.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TestUtil {
    private WebDriver driver;
    private WebDriverWait wait;

    public TestUtil(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void click(By locator) { wait.until(ExpectedConditions.elementToBeClickable(locator)).click(); }

    public void type(By locator, String text) { wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear(); driver.findElement(locator).sendKeys(text); }

    public String getText(By locator) { return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText(); }

    public boolean isPresent(By locator) { try { driver.findElement(locator); return true; } catch (NoSuchElementException e) { return false; } }

    public void selectDropdownByVisibleText(By locator, String text) { Select select = new Select(driver.findElement(locator)); select.selectByVisibleText(text); }

    public void waitForVisibility(By locator) { wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }

    public void acceptAlert() { wait.until(ExpectedConditions.alertIsPresent()).accept(); }

    public void switchToFrameByLocator(By locator) { driver.switchTo().frame(driver.findElement(locator)); }

    public void switchToDefaultContent() { driver.switchTo().defaultContent(); }
}
