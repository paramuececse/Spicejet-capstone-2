package Com.Test.TestMethods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

import Com.Objects.SignUpSpiceDemo;


public class SignUpSpiceJetTest extends DriverClassSpiceJet {
	WebDriver driver;
	//create signupdemo class instance to access the methods 
	SignUpSpiceDemo SignUpSpiceJetobjects;
		
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
	@DataProvider(name="signuppage")
public Object[][] getLoginData() throws IOException{
		FileInputStream file=new FileInputStream("F:\\java eclipse\\SpiceJetNew\\data\\Book1.xlsx");
        Workbook workbook=WorkbookFactory.create(file);
        Sheet sheet=workbook.getSheet("Sheet1");
        int rowcount=sheet.getLastRowNum();
    	int columnCount=sheet.getRow(0).getLastCellNum();
    	
    	Object [][] data=new Object[rowcount][columnCount];
    	for(int i=0;i<rowcount;i++) {
    		Row row=sheet.getRow(i+1);
    	for(int j=0;j<columnCount;j++) {
    		Cell cell=row.getCell(j);
    		data[i][j]=cell.toString();
    	}}
    	workbook.close();
    	return data;
    	
	}
	
@Test(dataProvider = "signuppage")
  public void SpiceJetSignUpMethodPositivemethod(String username,String lastname,String dob,String number,String email,String password,String confirmpassword) throws InterruptedException, IOException {
	  SignUpSpiceJetobjects = new SignUpSpiceDemo(driver);
	  SignUpSpiceJetobjects.SignUpmethod();
	  SwitchWindow();
	 // Thread.sleep(2000);
	 //driver.switchTo().alert().dismiss();
	  Thread.sleep(3000);
    
	  //SignUpSpiceJetobjects.ClickTitle();
	  SignUpSpiceJetobjects.SelectOptionMethod();
	  Thread.sleep(1000);
	  SignUpSpiceJetobjects.firstnameMethod(username);
	  SignUpSpiceJetobjects.lastnameMethod(lastname);
	  SignUpSpiceJetobjects.country();
	  SignUpSpiceJetobjects.dobmethod(dob);
	  SignUpSpiceJetobjects.mobilenumber(number);
	  Thread.sleep(1000);
	  SignUpSpiceJetobjects.email(email);
	  SignUpSpiceJetobjects.password(password);
	  SignUpSpiceJetobjects.confirmpassword(confirmpassword);
	  //SignUpSpiceJetobjects.SignUpCheckBoxClick();
	 // SignUpSpiceJetobjects.ClickSignUpButton();
	  System.out.println("SignUp page is successfully automated");
	  Thread.sleep(1000);
	  
  }

@AfterMethod
public void SignUpPageClose() {
	driver.quit();
}
}
