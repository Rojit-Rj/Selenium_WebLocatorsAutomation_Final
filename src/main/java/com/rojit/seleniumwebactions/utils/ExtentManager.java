package com.rojit.seleniumwebactions.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports createInstance(String fileName) {
        ExtentSparkReporter spark = new ExtentSparkReporter(fileName);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("WebLocators Test Execution");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Automation QA");
        extent.setSystemInfo("Environment", "Local");
        return extent;
    }
}
