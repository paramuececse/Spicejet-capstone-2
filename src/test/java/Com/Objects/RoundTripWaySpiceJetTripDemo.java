package Com.Objects;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import SpicetJetListeners.SpicetJetListeners;
public class RoundTripWaySpiceJetTripDemo extends SpicetJetListeners{
	
		public WebDriver driver;
		public RoundTripWaySpiceJetTripDemo(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//div[contains(text(),'round trip')]")
		WebElement RoundTripClick;


@FindBy(xpath="(//div//div/div/input)[1]")
WebElement RWBoardingFromtext;

@FindBy(xpath="//div[contains(text(),'To')]")
WebElement RWDestination;
@FindBy(xpath="//div[@data-testid='to-testID-destination']//input[@type='text']")
WebElement RwDestinationtext;


		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[1]/div[2]/div[1]")
		//@FindBy(xpath="(//div[contains(text(),'Departure Date')])[1]")
		WebElement RoundTripDepaturedate;

		@FindBy(xpath="(//div[text()='6'])[2]")
		WebElement RoundTripReturnDate;
		
		@FindBy(xpath="//div[text()='Return Date']")
		WebElement rt;
		
		@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[4]/div[6]/div/div")	
		//@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[4]/div[1]/div")
		WebElement RoundTripReturnDate2;

		@FindBy(xpath="//div[@data-testid=\"home-page-flight-cta\"]")
		WebElement RoundSearchFlight;
		//div[contains(text(),'Continue')]
@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[3]/div[2]")
WebElement ClickContinuebtn;
		
@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
WebElement ptittle;
@FindBy(xpath="//div[contains(text(),'Miss')]")
WebElement ptittleMiss;
		
		
@FindBy(xpath="//input[@data-testid=\"first-inputbox-contact-details\"]")
WebElement Firstname;

@FindBy(xpath="//input[@data-testid=\"last-inputbox-contact-details\"]")
WebElement lastname;

@FindBy(xpath="//input[@data-testid=\"contact-number-input-box\"]")
WebElement MobileNumber;

@FindBy(xpath="//input[@data-testid=\"emailAddress-inputbox-contact-details\"]")
WebElement email;

//@FindBy(xpath="//input[@data-testid=\"last-inputbox-contact-details\"]")
//WebElement country;

@FindBy(xpath="//input[@data-testid=\"city-inputbox-contact-details\"]")
WebElement townrcity;

@FindBy(xpath="//div[@data-testid=\"traveller-0-title-field\"]")
WebElement PIMiss;
@FindBy(xpath="(//div[@class=\"css-76zvg2 r-homxoj r-poiln3 r-ubezar\"])[3]")
WebElement PIMissClick;

@FindBy(xpath="//input[@data-testid=\"traveller-0-first-traveller-info-input-box\"]")
WebElement PIFirstname;

@FindBy(xpath="//input[@data-testid=\"traveller-0-last-traveller-info-input-box\"]")
WebElement PIlastname;

@FindBy(xpath="//input[@data-testid=\"sc-member-mobile-number-input-box\"]")
WebElement PIMobileNumber;

@FindBy(xpath="//div[@data-testid=\"traveller-info-continue-cta\"]")
WebElement PContinue;

@FindBy(id="at_addon_close_icon")
WebElement POPUPCLOSE;
//
@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")
WebElement PAContinue;

@FindBy(id="skipfrompopup")
WebElement popupclose;

@FindBy(xpath="//*[@id=\"card_number\"]")
WebElement CardNumber;

@FindBy(id="name_on_card")
WebElement cardnumbername;

@FindBy(id="card_exp_month")
WebElement mmexpiry;

@FindBy(id="card_exp_year")
WebElement MMyear;

@FindBy(id="security_code")
WebElement securecode;

@FindBy(xpath="//iframe[@class=\"card_number_iframe\"]")
WebElement iframe1;

@FindBy(xpath="//iframe[@class=\"name_on_card_iframe\"]")
WebElement iframe2;

@FindBy(xpath="//iframe[@class=\"card_exp_month_iframe\"]")
WebElement iframe3;

@FindBy(xpath="//iframe[@class=\"card_exp_year_iframe\"]")
WebElement iframe4;

@FindBy(xpath="//iframe[@class=\"security_code_iframe\"]")
WebElement iframe5;

		public void RwTripCircleSelectMethod() {
			RoundTripClick.click();
		}

		public void RwBoardingFromMethod(String Boarding) throws InterruptedException {
			//RoundTripBoardingFrom.click();
			//Thread.sleep(1000);
			RWBoardingFromtext.sendKeys(Boarding);
		}
		public void RwDestinationMethod(String Destination) {
			RWDestination.click();
			RwDestinationtext.sendKeys(Destination);
		}
		public void RwDepartureDate() {
			RoundTripDepaturedate.click();
			//OneWayDepaturedate.sendKeys(Destination);
		}
		public void RwReturnDate() {
			rt.click();
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.elementToBeClickable(RoundTripReturnDate));
			
			RoundTripReturnDate.click();
			
			//RoundTripReturnDate2.click();
			//OneWayDepaturedate.sendKeys(Destination);
		}
		public void RwSearchFlightClick() {
			RoundSearchFlight.click();
		}
		
		public void FcontinueMethod() throws InterruptedException {
			Thread.sleep(5000);
			ClickContinuebtn.click();
		}
public void passengerTitle() throws InterruptedException {
			ptittle.click();
			ptittleMiss.click();
		}
public void PFirstNameMethod(String FName) {
	Firstname.sendKeys(FName);		
		}
 public void PLaastName(String LName) {
		lastname.sendKeys(LName);	
		}
 public void PMobileNum(String Mobile) {
		MobileNumber.sendKeys(Mobile);	
		}
public void PEmailAddressMethod(String Email) {
		email.sendKeys(Email);	
		}
public void PTownrCityMethod(String City) {
	townrcity.sendKeys(City);
}
public void passengerInfo() throws InterruptedException {
	PIMiss.click();
	PIMissClick.click();
}
public void PIFirstNameMethod(String FName) {
	PIFirstname.sendKeys(FName);		
		}
 public void PILaastName(String LName) {
		PIlastname.sendKeys(LName);	
		}
 public void PIMobileNum(String Mobile) {
		PIMobileNumber.sendKeys(Mobile);	
		}
 
 public void PIContinue() {
		PContinue.click();
		}
 public void PAContinue() throws InterruptedException {
//	 POPUPCLOSE.click();
	// Thread.sleep(3000);
	 JavascriptExecutor js = (JavascriptExecutor)driver;		
	 js.executeScript("window.scrollBy(0,600)");	
	// js.executeScript("arguments[0].click();", PAContinue);
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(PAContinue));
		PAContinue.click();
		popupclose.click();
		}
 public void CardNumberEnter(String number) throws InterruptedException {
	
	 
	 driver.switchTo().frame(iframe1);
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(CardNumber));
	 CardNumber.click();
	 CardNumber.sendKeys(number);
	 driver.switchTo().defaultContent();
	 
 }
 
 public void cardname(String cdnum) throws InterruptedException {
	 driver.switchTo().frame(iframe2);
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(cardnumbername));
		cardnumbername.click();
		cardnumbername.sendKeys(cdnum);
	 driver.switchTo().defaultContent();
	 
 }
 public void MMexpiryMethod(String MMexpiry) {
	 driver.switchTo().frame(iframe3);
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(mmexpiry));
		mmexpiry.click();
		mmexpiry.sendKeys(MMexpiry);
	 driver.switchTo().defaultContent();
	 
 }
 public void MMYearMethod(String year) {
	 driver.switchTo().frame(iframe4);
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(MMyear));
		MMyear.click();
		MMyear.sendKeys(year); ;
	 driver.switchTo().defaultContent();
	 
 }
	 
 
 public void SecureCode(String s) throws IOException {
	 driver.switchTo().frame(iframe5);
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(securecode));
		securecode.click();
		securecode.sendKeys(s); 
	 driver.switchTo().defaultContent();
	 extentTest.addScreenCaptureFromPath(takeScreenshot("RoundTrip", driver));
	
 }
}
