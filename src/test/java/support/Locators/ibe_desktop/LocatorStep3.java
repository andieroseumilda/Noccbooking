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
public class LocatorStep3 {

    private WebDriverWait wait;

    public LocatorStep3(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver,60);
    }

    //Locator
    @FindBy(id="btnguestdetails")
    private WebElement set_step3_guest_details_button;

    @FindBy(xpath = "//table//a[contains(.,'Full Refundable LT')]")
    private WebElement set_FullRefundableLT;

    //Method
    public WebElement getStep3GuestDetailsButton(){
        return wait.until(ExpectedConditions.visibilityOf(set_step3_guest_details_button));
    }

    public WebElement getFullRefundableLTRatePlan(){
        return wait.until(ExpectedConditions.visibilityOf(set_FullRefundableLT));
    }
}
