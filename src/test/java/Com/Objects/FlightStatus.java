package Com.Objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class FlightStatus {
	public WebDriver driver;
	public FlightStatus(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='flight status']")
	WebElement flightstatus;


	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement selectfrom;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement selectdestination;
	@FindBy(xpath="(//input[contains(@value,'SG -')])[1]")
	WebElement sg;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-2t9rge r-adyw6z r-1kfrs79'])[1]")
	WebElement checkflightstatus;
	
	@FindBy(xpath="//div[text()='Search Flights']")
	WebElement se;
	public void flightstatus( ) {
   	 flightstatus.click();
    }
    public void SelectOrigin(String source) {
   	 selectfrom.click();
   	 selectfrom.sendKeys(source);
    }
    public void Destination(String destination) {
    	selectdestination.click();
    	selectdestination.sendKeys(destination);
    }
    public void sg(String s) {
    	sg.sendKeys(s);
    }
    public void checkflightstatusmethod() {
    String checkflightstatus1=	checkflightstatus.getText();
    System.out.println("Flight status checking :"+checkflightstatus1);
    }
    public void se() {
    	se.click();
    }
}
