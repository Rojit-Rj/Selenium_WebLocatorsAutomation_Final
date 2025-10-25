package com.rojit.seleniumwebactions.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.rojit.seleniumwebactions.base.BasePage;

public class CalendarPage extends BasePage {
    private By dateInput = By.id("dateInput");
    public CalendarPage(WebDriver driver) { super(driver); }
    public void selectDate(String date) { util.type(dateInput, date); }
    public String getSelectedDate() { return driver.findElement(dateInput).getAttribute("value"); }
}
