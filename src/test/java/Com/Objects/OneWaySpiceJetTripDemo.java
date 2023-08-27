package Com.Objects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;
public class OneWaySpiceJetTripDemo extends DriverClassSpiceJet{
public WebDriver driver;
public OneWaySpiceJetTripDemo (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//div[.='one way'])[2]")
WebElement OneWayButton;

@FindBy(xpath="(//div//div/div/input)[1]")
WebElement OWBoardingFromtext;

@FindBy(xpath="//div[contains(text(),'To')]")
WebElement OneWayDestination;
@FindBy(xpath="//div[@data-testid='to-testID-destination']//input[@type='text']")
WebElement OwDestinationtext;

@FindBy(xpath="//div[.='Departure Date']")
WebElement OWDepaturedate;


@FindBy(xpath="//div[@class='css-1dbjc4n r-18u37iz']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")
WebElement OneWayDepaturedate;

@FindBy(xpath = "//div[@data-testid=\"home-page-flight-cta\"]")
WebElement SearchFlight;

public void OwTripCircleSelectMethod() {
	OneWayButton.click();
}

public void OwBoardingFromMethod(String Boarding) throws InterruptedException {
    // OneWayBoardingFrom.click();
     Thread.sleep(2000);
     OWBoardingFromtext.sendKeys(Boarding);
}
public void OwDestinationMethod(String Destination) throws InterruptedException {
	OneWayDestination.click();
	Thread.sleep(1000);
	OwDestinationtext.sendKeys(Destination);
}
public void OwDepartureDate() throws InterruptedException {

	OWDepaturedate.click();
	
	//OneWayDepaturedate.click();
	
}
public void OwSearchFlightClick() {
	SearchFlight.click();
}
}

