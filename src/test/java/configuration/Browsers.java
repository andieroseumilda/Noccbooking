package configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers
{
    private WebDriver browser = null;
    private String BROWSER_CHROME_PATH = System.getProperty("user.dir") + "/browsers/chromedriver.exe";
//    private String BROWSER_FIREFOX_PATH = System.getProperty("user.dir") + "/browsers/geckodriver.exw";

    public Browsers()
    {
        System.setProperty("webdriver.chrome.driver", BROWSER_CHROME_PATH);
//        System.setProperty("webdriver.chrome.driver", BROWSER_FIREFOX_PATH);
    }


    public WebDriver open()
    {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("http://staging-reservations.directwithhotels.com/reservation/selectDates/20545");
        return browser;
    }

}
