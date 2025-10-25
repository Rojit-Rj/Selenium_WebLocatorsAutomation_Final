package com.rojit.seleniumwebactions.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitUtil {
    private WebDriverWait wait;

    public WaitUtil(WebDriver driver, int timeoutSeconds) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
    }

    public void waitForElementVisible(By locator) { wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); }

    public void waitForElementClickable(By locator) { wait.until(ExpectedConditions.elementToBeClickable(locator)); }
}
