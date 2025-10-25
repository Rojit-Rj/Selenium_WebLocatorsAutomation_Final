package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class UploadPage extends BasePage {
    private By fileInput = By.id("fileUploadInput");
    private By uploadButton = By.id("uploadBtn");
    private By uploadMessage = By.id("uploadMsg");
    public UploadPage(WebDriver driver) { super(driver); }
    public void uploadFile(String filePath) { driver.findElement(fileInput).sendKeys(filePath); }
    public void clickUpload() { util.click(uploadButton); }
    public String getUploadMessage() { return util.getText(uploadMessage); }
}
