package Com.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginSpiceDemo {


public WebDriver driver;
public LoginSpiceDemo(WebDriver driver) {
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
@FindBy(xpath="//div[contains(text(),'Log Out')]")
WebElement logout;

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
//public void InvaildPassword(String invalidpassword) {
//enterInvalidpassword.sendKeys(invalidpassword);
//}
     public void Loginbutton2() {
    	 SpicejetLoginButton.click();
    	String s= LoginConfirm.getText();
    	System.out.println("Login confirmation :"+s);
}
     public void logout() {
    	 logout.click();
     }
}

