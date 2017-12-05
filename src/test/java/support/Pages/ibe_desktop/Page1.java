package support.Pages.ibe_desktop;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import support.Locators.ibe_desktop.LocatorStep1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Page1
{
    private WebDriverWait wait;
    private LocatorStep1 step1;
    private JavascriptExecutor scroll;
    private int get_day_format = Calendar.DATE;
    private DateFormat date_format = new SimpleDateFormat("d");


    public Page1(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        this.scroll = scrollDown;
        step1 = new LocatorStep1(driver);
    }

    public void step1_stayDates(int arrival, int departure) throws InterruptedException
    {
        HashMap stay_dates = getStayDates(arrival, departure);
        checkDate((String) stay_dates.get("arrival"));
        checkDate((String) stay_dates.get("departure"));

        scroll.executeScript("window.scrollBy(0,250)","");
        step1.getViewRoomAndPricesButton().click();
        Thread.sleep(10000);

    }

    public HashMap getStayDates(int arrival, int departure) {
        HashMap stay_dates = new HashMap();
        stay_dates.put("arrival", formatDate(arrival) );
        stay_dates.put("departure", formatDate(departure));
        return stay_dates;
    }

    public String formatDate(int desiredDate) {
        Calendar day = Calendar.getInstance();
        day.add(get_day_format, desiredDate);
        Date set_date2 = day.getTime();
        return String.valueOf(date_format.format(set_date2));
    }

    public void checkDate(String date) {
        wait.until(elementToBeClickable(By.linkText(date))).click();
    }

//    public HashMap getStayDates(int arrival, int no_of_nights) {
//
//        // Compute Arrival
//        Calendar arrival_day = Calendar.getInstance();
//        arrival_day.add(get_day_format, arrival);
//        String arr = formatDate(arrival_day);
//
//        // Compute Departure
//        arrival_day.add(get_day_format, no_of_nights);
//        String dep = formatDate(arrival_day);
//
//        // Return Stay Dates
//        HashMap stay_dates = new HashMap();
//        stay_dates.put("arrival", arr );
//        stay_dates.put("departure", dep);
//        return stay_dates;
//    }
//
//    public String formatDate(Calendar date) {
//        Date set_date2 = date.getTime();
//        return String.valueOf(date_format.format(set_date2));
//    }

}
