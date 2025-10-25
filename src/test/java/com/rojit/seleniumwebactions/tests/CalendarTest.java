package com.rojit.seleniumwebactions.tests;

import com.rojit.seleniumwebactions.hooks.Hooks;
import org.testng.annotations.Test;
import com.rojit.seleniumwebactions.pages.CalendarPage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalendarTest extends Hooks {
    @Test(description = "Validate calendar date selection")
    public void testDateSelection() {
        test = extent.createTest("Calendar Date Selection");
        driver.get("https://web-locators-static-site-qa.vercel.app/Calendar");

        CalendarPage calendarPage = new CalendarPage(driver);
        String dateToSelect = LocalDate.now().plusDays(5).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        calendarPage.selectDate(dateToSelect);

        String selectedDate = calendarPage.getSelectedDate();
        assert selectedDate.equals(dateToSelect) : "Selected date should match the input date";

        
    }
}
