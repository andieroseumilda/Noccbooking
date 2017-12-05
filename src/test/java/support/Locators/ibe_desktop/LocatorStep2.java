package support.Locators.ibe_desktop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by andie on 10/10/2017.
 */
public class LocatorStep2 {

    private WebDriverWait wait;

    public LocatorStep2(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver,120);
    }

    //Element Locators
    @FindBy(id="room_56339_14181_0")
    private WebElement set_full_refundable_leadTime;

    @FindBy(id="ctaReserve")
    private WebElement set_full_reserve_now_button;

    @FindBy(xpath = "//div[@id='dialogRateplan']/div[@class='modal-header']/a[@class='close']/i")
    private WebElement set_close_rateplan_window;

    @FindBy(xpath = "//table[@data-rateplan-id='56339']//span[@class='blurb']//a")
    private WebElement set_popover_full_refundable_leadtime;

    //Methods
    public WebElement getFullRefundableLeadTime(){
        return wait.until(ExpectedConditions.visibilityOf(set_full_refundable_leadTime));
    }

    public WebElement getReserveNowButton(){
        return  wait.until(ExpectedConditions.visibilityOf(set_full_reserve_now_button));
    }

    public WebElement getCloseButton(){
        return wait.until(ExpectedConditions.visibilityOf(set_close_rateplan_window));
    }

    public WebElement getpopoverFullRefundableLeadTime(){
        return wait.until(ExpectedConditions.visibilityOf(set_popover_full_refundable_leadtime));
    }


}
