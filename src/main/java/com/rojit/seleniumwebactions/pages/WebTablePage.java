package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.rojit.seleniumwebactions.base.BasePage;
import java.util.List;

public class WebTablePage extends BasePage {
    private By tableRows = By.cssSelector("table tr");
    private By tableHeaders = By.cssSelector("table th");
    public WebTablePage(WebDriver driver) { super(driver); }
    public int getRowCount() { return driver.findElements(tableRows).size(); }
    public int getColumnCount() { return driver.findElements(tableHeaders).size(); }
    public String getCellData(int row, int col) { List<WebElement> rows = driver.findElements(tableRows); if (row < rows.size()) { java.util.List<WebElement> cells = rows.get(row).findElements(By.tagName("td")); if (col < cells.size()) return cells.get(col).getText(); } return ""; }
}
