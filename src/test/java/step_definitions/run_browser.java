package step_definitions;

import configuration.Browsers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class run_browser
{

    public Browsers browser;
    public static WebDriver driver;


    @Before
    public void openBrowser()
    {
        browser = new Browsers();
        this.driver = browser.open();
    }

    @After
    public void closeBrowser()
    {
        this.driver.close();
        this.driver.quit();
    }

    public static WebDriver getBrowser()
    {
        return driver;
    }

}

