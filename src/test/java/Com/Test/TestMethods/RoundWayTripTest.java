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
import Com.Objects.RoundTripWaySpiceJetTripDemo;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class RoundWayTripTest extends DriverClassSpiceJet{
	
	WebDriver driver;
	LoginSpiceDemo LoginSpiceJetobjects;
	RoundTripWaySpiceJetTripDemo RWSJObject;
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
	@DataProvider(name="Roundwaytrip")
	public Object[][] getLoginData() throws IOException{
			FileInputStream file=new FileInputStream("F:\\java eclipse\\SpiceJetNew\\data\\Book1.xlsx");
	        Workbook workbook=WorkbookFactory.create(file);
	        Sheet sheet=workbook.getSheet("Roundway");
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
	
  @Test(dataProvider = "Roundwaytrip")
  public void RWTSJMethod(String From,String To,String firstname,String lastname,String moblienumber,String email,String city,
		  String pifirstname,String pilastname,String pimobilenumber,String cardnumber,String cardname,String month,String year,String securecode) throws InterruptedException {
	  RWSJObject=new  RoundTripWaySpiceJetTripDemo(driver);
	  RWSJObject.RwTripCircleSelectMethod();
	  RWSJObject.RwBoardingFromMethod(From);
	  Thread.sleep(3000);
	  RWSJObject.RwDestinationMethod(To);
	  Thread.sleep(3000);
	  RWSJObject.RwDepartureDate();
	  //Thread.sleep(3000);
	  RWSJObject.RwReturnDate();
	  Thread.sleep(3000);
	  RWSJObject.RwSearchFlightClick();
	 //Thread.sleep(3000);
	  RWSJObject.FcontinueMethod();
	  Thread.sleep(3000);
	  RWSJObject.passengerTitle();	
	  RWSJObject.PFirstNameMethod(firstname);
	  RWSJObject.PLaastName(lastname);
	  RWSJObject.PMobileNum(moblienumber);
	  RWSJObject.PEmailAddressMethod(email);
	  RWSJObject.PTownrCityMethod(city);
	  Thread.sleep(3000);
	  RWSJObject.passengerInfo();
	  RWSJObject.PIFirstNameMethod(pifirstname);
	  RWSJObject.PILaastName(pilastname);
	  RWSJObject.PIMobileNum(pimobilenumber);
	  RWSJObject.PIContinue();
	  //Thread.sleep(3000);
	  RWSJObject.PAContinue();
	  Thread.sleep(3000);
	  RWSJObject.CardNumberEnter(cardnumber);
	  Thread.sleep(3000);
	  RWSJObject.cardname(cardname);
	  RWSJObject.MMexpiryMethod(month);
	  RWSJObject.MMYearMethod(year);
	  RWSJObject.SecureCode(securecode);
	  Thread.sleep(3000);
  }
  
//  @AfterTest
//  public void aftermethod() throws InterruptedException {
//	  Thread.sleep(3000);
//	  driver.close();
//  }
}
