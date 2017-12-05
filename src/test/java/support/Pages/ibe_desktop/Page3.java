package support.Pages.ibe_desktop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import support.Locators.ibe_desktop.LocatorStep3;

/**
 * Created by andie on 10/10/2017.
 */
public class Page3 {

    private WebDriver driver;
    private LocatorStep3 step3;
    private JavascriptExecutor scroll;

    public Page3(WebDriver driver){
        step3 = new LocatorStep3(driver);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        this.scroll = scrollDown;
    }

    public void step3_guest_details_button(){
        scroll.executeScript("arguments[0].scrollIntoView();", step3.getStep3GuestDetailsButton());
        step3.getStep3GuestDetailsButton().click();
    }
}
