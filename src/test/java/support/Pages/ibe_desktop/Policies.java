package support.Pages.ibe_desktop;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import support.Locators.ibe_desktop.LocatorStep2;
import support.Locators.ibe_desktop.PoliciesLocator;


public class Policies {

    private PoliciesLocator policyLocator;
    private LocatorStep2 step2;
    private JavascriptExecutor scroll;
    private WebDriver driver;

    public Policies(WebDriver driver){
        policyLocator = new PoliciesLocator(driver);
        step2 = new LocatorStep2(driver);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        this.scroll = scrollDown;
        this.driver = driver;
    }

    public void scroll_to_element(WebElement element){
        scroll.executeScript("arguments[0].scrollIntoView();",element);
    }

    public void ratePlanWindow(WebElement element) throws InterruptedException {
        scroll.executeScript("arguments[0].scrollIntoView();",element);
        scroll.executeScript("window.scrollBy(0,-300)");
        highlightElement(driver,  element);
        element.click();
//        System.out.println("click");

    }

    public void reservation_policies(String copyFromFeature, WebElement getPolicy) throws InterruptedException {
        String policy = getPolicy.getText();
        scroll_to_element(getPolicy);
        highlightElement(driver, getPolicy);
        Assert.assertEquals(copyFromFeature, policy);
//        closeRateplanWindow();
    }

    public void highlightElement(WebDriver driver, WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 1px solid white;');", element);
    }

    public void closeRateplanWindow(){
        highlightElement(driver,   step2.getCloseButton());
        step2.getCloseButton().click();
    }

    public void selectRoom(int no_of_rooms) throws InterruptedException {
        closeRateplanWindow();
        WebElement room_type = null;
        room_type = step2.getFullRefundableLeadTime();
        Select room = new Select(room_type);
        room.selectByIndex(no_of_rooms);
        highlightElement(driver,  room_type);
        highlightElement(driver,  step2.getReserveNowButton());
        step2.getReserveNowButton().click();

    }

    public void popoverFullRefundableLeadtime() throws InterruptedException {
        highlightElement(driver, step2.getpopoverFullRefundableLeadTime());

        Actions action = new Actions(driver);
       action.moveToElement(step2.getpopoverFullRefundableLeadTime()).build().perform();
        Thread.sleep(3000);
    }

    public void checkPolicyBlurb(String copyFromFeature, WebElement getPolicy) throws InterruptedException {

        String policy = getPolicy.getText();
        highlightElement(driver, getPolicy);
        System.out.println(policy);
//        Assert.assertEquals(copyFromFeature, policy);

    }

    public void policyBlurb(String copyFromFeature, WebElement getPolicy) throws InterruptedException {
        popoverFullRefundableLeadtime();
        checkPolicyBlurb(copyFromFeature, getPolicy);
    }

     public void reservation_policieswithoutLabel(String copyFromFeature, String policyLabel, WebElement getPolicy) throws InterruptedException {
        String policy = getPolicy.getText();
        scroll_to_element(getPolicy);
        highlightElement(driver, getPolicy);
        Assert.assertEquals(copyFromFeature, policyLabel + policy);

//        closeRateplanWindow();
    }

}

