package support.Pages.ibe_desktop;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Locators.ibe_desktop.LocatorStep4;

/**
 * Created by andie on 10/10/2017.
 */
public class Page4 {

    private LocatorStep4 step4;
    private JavascriptExecutor scroll;

    public Page4(WebDriver driver){
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        this.scroll = scrollDown;
        step4 = new LocatorStep4(driver);
    }

    public void paymentPage() throws InterruptedException {
        step4.getFirstName().sendKeys("Test");
        step4.getLastName().sendKeys("Reservation");
        step4.getEmail().sendKeys("dwh.hotelv7@gmail.com");
        step4.getEmailConfirm().sendKeys("dwh.hotelv7@gmail.com");
        step4.getPaymentCountry().sendKeys("Philippines");
        step4.getMobileContactNumber().sendKeys("12345678");
        step4.getPaymentEta().sendKeys("03:00 AM");
        step4.getNoOfAdults().sendKeys("2");
        step4.getSpecialRequest().sendKeys("Special Request Text");
        step4.getPaymentCcType().sendKeys("Visa");
        step4.getPaymentCreditCard().sendKeys("4918914107195005");
        step4.getYesCardOwner().click();
        step4.getCreditCardExpMonth().sendKeys("2");
        step4.getCreditCardExpYear().sendKeys("2018");
        step4.getCreditCardCcv().sendKeys("123");
        scroll.executeScript("arguments[0].scrollIntoView();", step4.getAgreeTermsOfReservation());
        step4.getAgreeTermsOfReservation().click();
        step4.getConfirmReservationButton().click();

        Thread.sleep(10000);
    }
}
