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

import Com.Objects.OneWaySpiceJetTripDemo;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class OneWayTripSpiceJetTest extends DriverClassSpiceJet{
	
	WebDriver driver;
	
	OneWaySpiceJetTripDemo OWSJObject;
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
	@DataProvider(name="onewaytrip")
	public Object[][] getLoginData() throws IOException{
			FileInputStream file=new FileInputStream("F:\\java eclipse\\SpiceJetNew\\data\\Book1.xlsx");
	        Workbook workbook=WorkbookFactory.create(file);
	        Sheet sheet=workbook.getSheet("oneway");
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
  @Test(dataProvider = "onewaytrip")
  public void OneWayTripSpiceJetMethod(String From,String To) throws InterruptedException, IOException {
	  OWSJObject=new  OneWaySpiceJetTripDemo(driver);
	  OWSJObject.OwTripCircleSelectMethod();
	  OWSJObject.OwBoardingFromMethod(From);
	  OWSJObject.OwDestinationMethod(To);
	  Thread.sleep(2000);
	  OWSJObject.OwDepartureDate();
	  OWSJObject.OwSearchFlightClick();
	 
  }
  @AfterMethod
  public void LoginPageClose() {
  	driver.quit();
  }
}
