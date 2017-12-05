package support.Pages.ibe_desktop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import support.Locators.ibe_desktop.LocatorStep2;

/**
 * Created by andie on 10/10/2017.
 */
public class Page2 {

    private LocatorStep2 step2;
    private JavascriptExecutor scroll;

    public Page2(WebDriver driver){
        step2 = new LocatorStep2(driver);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        this.scroll = scrollDown;
    }

    public void selectRoom(int no_of_rooms) throws InterruptedException {
        WebElement room_type = null;

        room_type = step2.getFullRefundableLeadTime();
        scroll.executeScript("arguments[0].scrollIntoView();",room_type);
        Select room = new Select(room_type);
        room.selectByIndex(no_of_rooms);
        step2.getReserveNowButton().click();
    }

}
