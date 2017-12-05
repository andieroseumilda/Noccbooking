package support.Locators.ibe_desktop;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class LocatorStep1
{
    private WebDriverWait wait;

    public LocatorStep1(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, 90);
    }

    //Set Element Locations
     @FindBy(id = "btnNext")
    private WebElement set_view_room_and_prices_button;

    // Get Element Locations
     public WebElement getViewRoomAndPricesButton()
    {
        return wait.until(elementToBeClickable(set_view_room_and_prices_button));
    }

}
