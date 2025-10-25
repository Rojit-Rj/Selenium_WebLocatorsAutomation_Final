package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.UploadPage;
import java.nio.file.Paths;

public class UploadTest extends Hooks {
    @Test(description = "Validate file upload functionality")
    public void testFileUpload() {
        test = extent.createTest("File Upload Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/Upload");

        UploadPage uploadPage = new UploadPage(driver);

        String basePath = System.getProperty("user.dir");
        String filePath = Paths.get(basePath, "src", "test", "resources", "testData", "sampleUploadFile.txt").toString();

        uploadPage.uploadFile(filePath);
        uploadPage.clickUpload();

        String msg = uploadPage.getUploadMessage();

        assert msg.contains("success") : "Upload success message should be displayed.";
    }
}
