package step_definitions;

import configuration.Browsers;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import support.Locators.ibe_desktop.LocatorStep2;
import support.Locators.ibe_desktop.LocatorStep3;
import support.Locators.ibe_desktop.PoliciesLocator;
import support.Pages.ibe_desktop.*;

/**
 * Created by andie on 10/10/2017.
 */
public class late_modifican_dwh {


    private Policies policies;
    private WebDriver driver;
    private PoliciesLocator policy_locator;
    private LocatorStep3 step3;
    private LocatorStep2 step2;

    //  Rate plan window
    @When("^guest see the policies in step 2$")
    public void guest_see_the_policies_in_step_2() throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.ratePlanWindow(policy_locator.getFullRefundableLeadTimeLink());
    }

    @Then("^guest should see this prepayment policy copy \"(.*?)\"$")
    public void guest_should_see_this_prepayment_policy_copy(String prepayPolicy) throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policies(prepayPolicy, policy_locator.getPrepayFullRefundableLeadTime());
    }

    @Then("^modification policy copy is \"(.*?)\"$")
    public void modification_policy_copy_is(String modifPolicy) throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policies(modifPolicy, policy_locator.getModificationFullRefundableLeadTime());
    }

    @Then("^cancellation policy copy is \"(.*?)\"$")
    public void cancellation_policy_copy_is(String cancelPolicy) throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policies(cancelPolicy, policy_locator.getCancellationFullLeadTime());
    }

    @Then("^no show policy copy is \"(.*?)\"$")
    public void no_show_policy_is(String noshowPolicy) throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policies(noshowPolicy, policy_locator.getNoShowPolicyFullLeadTime());
    }

    @Then("^refund policy copy is \"(.*?)\"$")
    public void refund_policy_copy_is(String refundPolicy) throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policies(refundPolicy, policy_locator.getRefundPolicy());
    }

    @Then("^credit card control copy is \"(.*?)\"$")
    public void credit_card_control_copy_is(String creditCardControl) throws Throwable {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policies(creditCardControl, policy_locator.getCreditCardControl());
        Thread.sleep(5000);

    }

    @Then("^guest should select (\\d+) room and redirect to step 3$")
    public void guest_should_select_room_and_redirect_to_step(int no_of_rooms) throws InterruptedException {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policies.selectRoom(no_of_rooms);
        policies = new Policies(driver);
        step3 = new LocatorStep3(driver);
        policies.ratePlanWindow(step3.getFullRefundableLTRatePlan());
    }

    // Policy Blurb
    @Then("^sees the policies in popover$")
    public void sees_the_policies_in_popover() throws InterruptedException {
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policies.popoverFullRefundableLeadtime();

    }

    @Then("^the modification in policy blurb is \"(.*?)\"$")
    public void the_modification_in_policy_blurb_is(String modification) throws InterruptedException {
       driver = run_browser.getBrowser();
       policies = new Policies(driver);
       policy_locator = new PoliciesLocator(driver);
       policies.policyBlurb(modification, policy_locator.getModificationPolicyBlurb());
    }

    @Then("^guest should see this prepayment policy copy \"(.*?)\" on the policies blurb in step 3")
    public void guest_should_see_this_prepayment_policy_copy_on_the_policies_blurb_in_step_3(String fromFeature) throws InterruptedException {
        String prepayLabel = "Prepayment: ";
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.closeRateplanWindow();
        policies.reservation_policieswithoutLabel(fromFeature,prepayLabel, policy_locator.getPrepayPolicyBlurbStep3());
        Thread.sleep(3000);
    }

    @Then("^modification policy copy is \"(.*?)\" on the policies blurb in step 3")
    public void modification_policy_copy_is_on_the_policies_blurb_in_step_3(String fromFeature) throws InterruptedException {
        String prepayLabel = "Modification: ";
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policieswithoutLabel(fromFeature,prepayLabel, policy_locator.getModifPolicyBlurbStep3());


    }
    @Then("^cancellation policy copy is \"(.*?)\" on the policies blurb in step 3")
    public void cancellation_policy_copy_is_on_the_policies_blurb_in_step_3(String fromFeature) throws InterruptedException {
        String prepayLabel = "Cancellation: ";
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policieswithoutLabel(fromFeature,prepayLabel, policy_locator.getPrepayCancelBlurbStep3());
    }

    @Then("^no show policy copy is \"(.*?)\" on the policies blurb in step 3")
    public void no_show_policy_copy_is_on_the_policies_blurb_in_step_3(String fromFeature) throws InterruptedException {
        String prepayLabel = "No-show: ";
        driver = run_browser.getBrowser();
        policies = new Policies(driver);
        policy_locator = new PoliciesLocator(driver);
        policies.reservation_policieswithoutLabel(fromFeature,prepayLabel, policy_locator.getNoShowPolicyBlurbStep3());
        Thread.sleep(1000);
    }


}
