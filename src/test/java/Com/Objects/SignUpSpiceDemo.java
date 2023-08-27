package Com.Objects;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSpiceDemo {
	private WebDriver driver;

	public SignUpSpiceDemo(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Signup")
	WebElement  ClickSignUp;

//	//option[.='Mr']
//	@FindBy(linkText = "Select an option")
//	WebElement clickelement;
	
	
//	@FindBy(xpath="//option[.='Miss']")
//	WebElement ClickTitle;
	
	@FindBy(xpath ="//select[@class='form-control form-select ']")
	WebElement SelectOption; 

	@FindBy(xpath="//input[@id=\"first_name\"]")
	WebElement EnterFirstName;

	@FindBy(xpath="//input[@id=\"last_name\"]")
	WebElement EnterLastName;
//  
	@FindBy(xpath ="(//select[@class='form-control form-select'])[1]" )
	WebElement ClickCountry;
	//input[@id='dobDate']
	@FindBy(xpath="//input[@id=\"dobDate\"]")
	WebElement EnterDateOfBirth;

	@FindBy(xpath="//input[@type=\"tel\"]")
	WebElement EnterMobileNumber;

	@FindBy(xpath="//input[@id=\"email_id\"]")
	WebElement EnterEmailId;

	@FindBy(xpath="//input[@id=\"new-password\"]")
	WebElement EnterNewPassword;

	@FindBy(xpath="//input[@id=\"c-password\"]")
	WebElement EnterConfirmPassword;

//	@FindBy(xpath="//input[@id=\"defaultCheck1\"]")
//	WebElement SignUpCheckBoxClick;

//	@FindBy(xpath="//button[@class=\"btn btn-red\"]")
//	WebElement ClickSignUpButton;
	
	public void SignUpmethod() {
		ClickSignUp.click();
	}
//	public void ClickTitle() {
//		ClickTitle.click();
//	}
	
	public void SelectOptionMethod(){
	Select selection=new Select(SelectOption);
	selection.selectByVisibleText("Miss");
	}
	
	public void firstnameMethod(String first_name) {
		EnterFirstName.sendKeys(first_name);
	}
	public void lastnameMethod(String last_name) {
		EnterLastName.sendKeys(last_name);
	}
	public void country() {
		Select selection=new Select(ClickCountry);
		selection.selectByVisibleText("India");
		//ClickCountry.click();
	}
	public void dobmethod(String DoB) {
		EnterDateOfBirth.sendKeys(DoB);
	}
	public void mobilenumber(String mobile_number) {
		EnterMobileNumber.sendKeys(mobile_number);
	}
	public void email(String send_email) {
		EnterEmailId.sendKeys(send_email);
	}
	public void password(String send_password) {
		EnterNewPassword.sendKeys(send_password);
	}
	public void confirmpassword(String conf_password) {
		EnterConfirmPassword.sendKeys(conf_password);
	}
//	public void SignUpCheckBoxClick() {
//		SignUpCheckBoxClick.click();
//	}
//	public void ClickSignUpButton() {
//		ClickSignUpButton.click();;
//	}

}
