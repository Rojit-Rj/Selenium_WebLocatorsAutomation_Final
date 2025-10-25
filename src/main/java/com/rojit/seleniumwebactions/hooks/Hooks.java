package com.rojit.seleniumwebactions.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.rojit.seleniumwebactions.utils.BrowserFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Hooks {
    protected static ExtentReports extent;
    protected static ExtentTest test;
    protected WebDriver driver;

    @BeforeSuite
    public void setupReport(ITestContext context) {
        String reportPath = System.getProperty("user.dir") + "/extent-reports/ExtentReport.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        try { spark.loadXMLConfig(System.getProperty("user.dir") + "/src/main/resources/extent-config.xml"); } catch (Exception e) {}
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Project Name", "WebLocatorsAutomation");
        extent.setSystemInfo("Branch", "main");
        extent.setSystemInfo("Environment", "Local");
    }

    @Parameters({"browser"})
    @BeforeMethod
    public void setupDriver(@Optional("chrome") String browser, ITestContext context) {
        driver = BrowserFactory.initializeDriver(browser);
        context.setAttribute("WebDriver", driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result, ITestContext context) {
        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = captureScreenshot(result.getName());
            test.fail("Test Failed: " + result.getThrowable());
            if (screenshotPath != null) test.addScreenCaptureFromPath(screenshotPath);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.pass("Test Passed");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.skip("Test Skipped");
        }

        if (driver != null) driver.quit();
    }

    @AfterSuite
    public void tearDownReport() { extent.flush(); }

    private String captureScreenshot(String testName) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destination = System.getProperty("user.dir") + "/extent-reports/screenshots/" + testName + ".png";
            Files.createDirectories(Paths.get(System.getProperty("user.dir") + "/extent-reports/screenshots/"));
            Files.copy(screenshot.toPath(), Paths.get(destination));
            return destination;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
