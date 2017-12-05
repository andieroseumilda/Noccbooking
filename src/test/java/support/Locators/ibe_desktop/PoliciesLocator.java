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
public class PoliciesLocator {

    private WebDriverWait wait;
    private WebDriver driver;

    public PoliciesLocator(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, 80);
    }

    // Step 2 PoliciesLocator

    //-- Full Refundable Lead Time--//
    @FindBy(id = "rpName_56339")
    private WebElement set_full_refundable_lead_time_link;

    @FindBy(xpath = "//div[@id='rpPolicy']//li[contains(.,'Prepayment: ')]")
    private WebElement set_prepayFullRefundableLeadTime;

    @FindBy(xpath = "//div[@id='rpPolicy']//li[contains(.,'Modification: ')]")
    private WebElement set_modificationFullRefundableLeadTime;

    @FindBy(xpath = "//div[@id='rpPolicy']//li[contains(.,'Cancellation: ')]")
    private WebElement set_cancellationFullLeadTime;

    @FindBy(xpath = "//div[@id='rpPolicy']//li[contains(.,'No-show: ')]")
    private WebElement set_noShowPolicy;


    //Commonly used
    @FindBy(xpath = "//div[@id='rpPolicy']//li[contains(.,'Refund Policy: ')]")
    private WebElement set_refundPolicy;

    @FindBy(xpath = "//div[@id='rpPolicy']//li[contains(.,'Card Fraud Control: ')]")
    private WebElement set_creditCardControl;


    //-----Policy blurb
    @FindBy(xpath = "//table[@data-rateplan-id='56339']//span[@class='blurb']//strong[1]")
    private WebElement set_prepay_policy_blurb;

    @FindBy(xpath = "//table[@data-rateplan-id='56339']//span[@class='blurb']//strong[2]")
    private WebElement set_cancellation_policy_blurb;

    @FindBy(xpath = "//table[@data-rateplan-id='56339']//span[@class='blurb']//div[@class='popover-content']/span/p/strong[3]")
    private WebElement set_modification_policy_blurb;

    @FindBy(xpath = "//table[@data-rateplan-id='56339']//span[@class='blurb']//strong[4]")
    private WebElement set_noshow_policy_blurb;

    //Step 3 policy blurb
    @FindBy(xpath = "//div[contains(.,'Reservation Policies')]//td[contains(.,'Prepayment')]/following::td")
    private WebElement set_prepay_policy_blurb_step3;

    @FindBy(xpath = "//div[contains(.,'Reservation Policies')]//td[contains(.,'Modification')]/following::td")
    private WebElement set_modif_policy_blurb_step3;

    @FindBy(xpath = "//div[contains(.,'Reservation Policies')]//td[contains(.,'Cancellation')]/following::td")
    private WebElement set_cancel_policy_blurb_step3;

    @FindBy(xpath = "//div[contains(.,'Reservation Policies')]//td[contains(.,'No-show')]/following::td")
    private WebElement set_noshow_policy_blurb_step3;


    // Step 2 PoliciesLocator
    public WebElement getFullRefundableLeadTimeLink(){
        return wait.until(ExpectedConditions.visibilityOf(set_full_refundable_lead_time_link));
    }

    public WebElement getPrepayFullRefundableLeadTime(){
        return wait.until(ExpectedConditions.visibilityOf(set_prepayFullRefundableLeadTime));
    }

    public WebElement getModificationFullRefundableLeadTime(){
        return wait.until(ExpectedConditions.visibilityOf(set_modificationFullRefundableLeadTime));
    }

    public WebElement getCancellationFullLeadTime(){
        return wait.until(ExpectedConditions.visibilityOf(set_cancellationFullLeadTime));
    }

    public WebElement getNoShowPolicyFullLeadTime(){
        return wait.until(ExpectedConditions.visibilityOf(set_noShowPolicy));
    }

    //Commonly used
    public WebElement getRefundPolicy(){
        return wait.until(ExpectedConditions.visibilityOf(set_refundPolicy));
    }

    public WebElement getCreditCardControl(){
        return wait.until(ExpectedConditions.visibilityOf(set_creditCardControl));
    }

    public WebElement getPrepayPolicyBlurb(){
        return wait.until(ExpectedConditions.visibilityOf(set_prepay_policy_blurb));
    }

    public WebElement getCancellationPolicyBlurb(){
        return wait.until(ExpectedConditions.visibilityOf(set_cancellation_policy_blurb));
    }

    public WebElement getModificationPolicyBlurb(){
        return wait.until(ExpectedConditions.visibilityOf(set_modification_policy_blurb));
    }

    public WebElement getNoShowPolicyBlurb(){
        return wait.until(ExpectedConditions.visibilityOf(set_noshow_policy_blurb));
    }

    //Step 3 policy blurb
    public WebElement getPrepayPolicyBlurbStep3(){
        return wait.until(ExpectedConditions.visibilityOf(set_prepay_policy_blurb_step3));
    }

    public WebElement getModifPolicyBlurbStep3(){
        return wait.until(ExpectedConditions.visibilityOf(set_modif_policy_blurb_step3));
    }

    public WebElement getPrepayCancelBlurbStep3(){
        return wait.until(ExpectedConditions.visibilityOf(set_cancel_policy_blurb_step3));
    }

    public WebElement getNoShowPolicyBlurbStep3(){
        return wait.until(ExpectedConditions.visibilityOf(set_noshow_policy_blurb_step3));
    }

}
