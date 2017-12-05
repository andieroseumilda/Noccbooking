package step_definitions;

import org.openqa.selenium.WebDriver;
import support.Pages.ibe_desktop.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class rsvn_confirm_public_desktop
{

    private Page1 page1;
    private Page2 page2;
    private Page3 page3;
    private Page4 page4;
    private WebDriver driver;

    @Given("^Guest selects an early modification and cancellation from (\\d+) days from now to (\\d+) days from now$")
    public void guest_select_stay_dates_from_days_from_now_to_days_from_now(int arrival, int departure) throws Throwable {
        driver = run_browser.getBrowser();
        page1 = new Page1(driver);
        page1.step1_stayDates(arrival,departure);

    }

    @When("^guest select (\\d+) room/s on Full Refundable LT$")
    public void guest_select_rooms_on_Full_Refundable_LT(int no_of_room) throws Throwable {
        page2 = new Page2(driver);
        page2.selectRoom(no_of_room);
        System.out.println("hello");
    }

    @Then("^guest should be able to book a reservation$")
    public void guest_should_be_able_to_book_a_reservation() throws Throwable {
        page3 = new Page3(driver);
        page3.step3_guest_details_button();
        page4 = new Page4(driver);
        page4.paymentPage();
        System.out.println("hello");
    }

}

