package Com.Objects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SpicetJetListeners.SpicetJetListeners;

public class ManageBooking extends SpicetJetListeners{
	
	public WebDriver driver;
	public ManageBooking(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'])[3]")
	WebElement managebook1;
	
	@FindBy(xpath="//input[@placeholder='e.g. W3X3H8']")
	WebElement pnrnumber;
	
	@FindBy(xpath="//input[@placeholder='john.doe@spicejet.com / Doe']")
	WebElement emailid;
	
	@FindBy(xpath="(//div[contains(text(),'Search Booking')])[1]")
	WebElement searchbooking;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-2t9rge r-adyw6z r-1kfrs79'])[1]")
	WebElement checkmanagebooking;
	
	public void mbmethod() {
		managebook1.click();
	}
	public void pnrnumber(String s) {
		pnrnumber.sendKeys(s);
	}
	public void emailid(String s1) {
		emailid.sendKeys(s1);
	}
	public void checkmanagebooking() throws IOException {
		String checkmanagebook=checkmanagebooking.getText();
		System.out.println("check manage booking status :"+checkmanagebook);
		extentTest.addScreenCaptureFromPath(takeScreenshot("ManageBooking", driver));
	}
	public void searchbooking() {
		searchbooking.click();
	}
}
