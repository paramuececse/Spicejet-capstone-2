package Com.Test.TestMethods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Objects.LoginSpiceDemo;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class LoginInvalidCredential extends DriverClassSpiceJet{
	WebDriver driver;
	
	LoginSpiceDemo LoginSpiceJetobjects1;
		
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
	@DataProvider(name="LoginPageInvaild")
public Object[][] getLoginData() throws IOException{
		FileInputStream file=new FileInputStream("F:\\java eclipse\\SpiceJetNew\\data\\Book1.xlsx");
        Workbook workbook=WorkbookFactory.create(file);
        Sheet sheet=workbook.getSheet("invalid");
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
  @Test(dataProvider = "LoginPageInvaild")
  public void SpiceJetLoginInvalid(String emailidinvalid,String passwordinvalid) throws InterruptedException {
	  LoginSpiceJetobjects1=new LoginSpiceDemo(driver);
	  LoginSpiceJetobjects1.LoginKey();
	  Thread.sleep(1000);
	  LoginSpiceJetobjects1.EmailButton();
	  LoginSpiceJetobjects1.EmilId(emailidinvalid);
	  LoginSpiceJetobjects1.passwordLogin(passwordinvalid);
	  Thread.sleep(2000);
	  LoginSpiceJetobjects1.Loginbutton2();
//	  Thread.sleep(5000);
//	  LoginSpiceJetobjects1.logout();
  }

@AfterTest
public void LoginPageClose() {
	driver.quit();
}
  }
