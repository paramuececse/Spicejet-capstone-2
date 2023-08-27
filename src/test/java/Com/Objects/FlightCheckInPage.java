package Com.Objects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightCheckInPage {
	public WebDriver driver;
	public FlightCheckInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//div[.='Login'])[1]")
	//@FindBy(xpath="//span[@class='d-none d-lg-block']")
	WebElement SpiceJetLoginKey;


	//@FindBy(xpath="//input[@id='inlineRadio2']")
	@FindBy(xpath="(//div[.='Email'])[1]")
	WebElement SpiceJetEmailButton;
	//input[@type='email']
	@FindBy(xpath="//input[@type='email']")
	WebElement SpiceJetEnterEmailId;
	@FindBy(xpath="//input[@type='password']")
	WebElement SpiceJetEnterPassword;

	//@FindBy(xpath="//input[@type='password']")
	//WebElement enterInvalidpassword;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement SpicejetLoginButton;

	@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1jkjb\"]")
	WebElement LoginConfirm;
	//@FindBy(xpath="//div[@data-testid='login-cta']")
	//WebElement loginbutton;
    
	@FindBy(xpath="//div[text()='check-in']")
	WebElement CheckIn;

	@FindBy(xpath="//input[@placeholder='e.g. W3X3H8']")
	WebElement tickectnumber;
	
	@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com']")
	WebElement emailid;
	//div[text()='Search Booking'])[1]
	
//	(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1kfrs79'])[1]
	
@FindBy(xpath="//div[text()='Search Booking']")
WebElement tsearching;
// (//div[contains(text(),'Search Booking')])[1]
//div[text()='flight status']
//(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa'])[1]

@FindBy(xpath="//div[text()='flight status']")
WebElement flightstatus;


@FindBy(xpath="//input[@value='Select Origin']")
WebElement selectfrom;

@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-2t9rge r-adyw6z r-1kfrs79'])[1]")
WebElement fightcheckin;
public void LoginKey() {
		SpiceJetLoginKey.click();
	}
	public void EmailButton() {
		SpiceJetEmailButton.click();
	}
	public void EmilId(String Emailid) {
		SpiceJetEnterEmailId.sendKeys(Emailid);
	}
	public void passwordLogin(String passwordlogin) {
		SpiceJetEnterPassword.sendKeys(passwordlogin);
		
	}
	
	     public void Loginbutton2() {
	    	 SpicejetLoginButton.click();
	    	String s= LoginConfirm.getText();
	    	System.out.println("Login confirmation :"+s);
	}
	     public void checkin() {
	    	 CheckIn.click();
	     }
	     public void TicketNumber(String tnumber) {
	    	 tickectnumber.sendKeys(tnumber); 
	     }
	     public void emailid(String temailid) {
	    	 emailid.sendKeys(temailid);
	     }
	     public void Tsearch() {
	    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	 		  wait.until(ExpectedConditions.elementToBeClickable(tsearching));
	    	 tsearching.click();
	     }
	     public void flightcheckin() {
	    String checkflightstatus=	 fightcheckin.getText();
	    System.out.println("check the flight status is available :"+checkflightstatus);
	     }
	     
}
