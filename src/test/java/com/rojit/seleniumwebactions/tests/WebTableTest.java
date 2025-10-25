package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.WebTablePage;

public class WebTableTest extends Hooks {
    @Test(description = "Validate web table data and structure")
    public void testWebTable() {
        test = extent.createTest("Web Table Test");
        driver.get("https://web-locators-static-site-qa.vercel.app/WebTable");

        WebTablePage tablePage = new WebTablePage(driver);
        int rows = tablePage.getRowCount();
        int cols = tablePage.getColumnCount();

        assert rows > 0 : "Table should have rows";
        assert cols > 0 : "Table should have columns";

        String cellData = tablePage.getCellData(1, 1);
        assert !cellData.isEmpty() : "Cell data should not be empty";
    }
}
