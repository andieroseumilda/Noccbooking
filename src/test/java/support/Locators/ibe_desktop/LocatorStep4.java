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
public class LocatorStep4 {

    private WebDriver driver;
    private WebDriverWait wait;

    public LocatorStep4(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, 60);
    }

    //Locator
    @FindBy(id = "payment_first_name")
    private WebElement set_payment_first_name;

    @FindBy(id = "payment_last_name")
    private WebElement set_payment_last_name;

    @FindBy(id = "payment_email")
    private WebElement set_payment_email;

    @FindBy(id = "payment_email_confirm")
    private WebElement set_payment_email_confirm;

    @FindBy(id = "payment_country")
    private WebElement set_country;

    @FindBy(id = "payment_contact_number")
    private WebElement set_mobile_contact_number;

    @FindBy(id = "payment_eta")
    private WebElement set_payment_eta;

    @FindBy(id = "payment_adults")
    private WebElement set_no_of_adults;

    @FindBy(id = "payment_children")
    private WebElement set_no_of_children;

    @FindBy(id = "payment_specialrequest")
    private WebElement set_special_request;

    @FindBy(id = "payment_cc_type")
    private WebElement set_payment_cc_type;

    @FindBy(id = "payment_cc_number")
    private WebElement set_payment_cc_number;

    @FindBy(id = "opt_yes")
    private WebElement set_option_yes_card_owner;

    @FindBy(id = "opt_no")
    private WebElement set_option_no_card_owner;

    @FindBy(id = "payment_cc_name")
    private WebElement set_payment_cc_name;

    @FindBy(id = "payment_cc_exp_month")
    private WebElement set_payment_cc_exp_month;

    @FindBy(id = "payment_cc_exp_year")
    private WebElement set_payment_cc_exp_year;

    @FindBy(id = "payment_cc_cvv")
    private WebElement set_payment_ccv;

    @FindBy(id = "payment_agree")
    private WebElement set_payment_agree;

    @FindBy(id = "btnconfirmbooking")
    private WebElement set_confirm_reservation_button;

    //---Occupants Name
    @FindBy(id = "occupants_firstname_0")
    private WebElement set_occupants_first_name;

    @FindBy(id = "occupants_lastname_0")
    private WebElement set_occupants_last_name;

    //Method
    public WebElement getFirstName(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_first_name));
    }

    public WebElement getLastName(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_last_name));
    }

    public WebElement getEmail(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_email));
    }

    public WebElement getEmailConfirm(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_email_confirm));
    }

    public WebElement getPaymentCountry(){
        return wait.until(ExpectedConditions.visibilityOf(set_country));
    }

    public WebElement getMobileContactNumber(){
        return wait.until(ExpectedConditions.visibilityOf(set_mobile_contact_number));
    }

    public WebElement getPaymentEta(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_eta));
    }

    public WebElement getNoOfAdults(){
        return wait.until(ExpectedConditions.visibilityOf(set_no_of_adults));
    }

    public WebElement getNoOfChildren(){
        return wait.until(ExpectedConditions.visibilityOf(set_no_of_children));
    }

    public WebElement getSpecialRequest(){
        return wait.until(ExpectedConditions.visibilityOf(set_special_request));
    }

    public WebElement getPaymentCcType(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_cc_type));
    }

    public WebElement getPaymentCreditCard(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_cc_number));
    }

    public WebElement getYesCardOwner(){
        return wait.until(ExpectedConditions.visibilityOf(set_option_yes_card_owner));
    }

    public WebElement getNoCardOwner(){
        return wait.until(ExpectedConditions.visibilityOf(set_option_no_card_owner));
    }

    private WebElement getPaymentCreditCardName(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_cc_name));
    }

    public WebElement getCreditCardExpMonth(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_cc_exp_month));
    }

    public WebElement getCreditCardExpYear(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_cc_exp_year));
    }

    public WebElement getCreditCardCcv(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_ccv));
    }

    public WebElement getAgreeTermsOfReservation(){
        return wait.until(ExpectedConditions.visibilityOf(set_payment_agree));
    }

    public WebElement getConfirmReservationButton(){
        return wait.until(ExpectedConditions.visibilityOf(set_confirm_reservation_button));
    }


    // Occupants Name
    private WebElement getOccupantsFirstName(){
        return wait.until(ExpectedConditions.visibilityOf(set_occupants_first_name));
    }

    private WebElement getOccupantsLastName(){
        return wait.until(ExpectedConditions.visibilityOf(set_occupants_last_name));
    }
}
