package Com.Test.TestMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Objects.FlightCheckInPage;

import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class FlightCheckInTest extends DriverClassSpiceJet {
	
	FlightCheckInPage Fcp;
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
  @Test
  public void f() throws InterruptedException, IOException {
	  Fcp=new FlightCheckInPage(driver);
//	  Fcp.LoginKey();
//	  Thread.sleep(1000);
//	  Fcp.EmailButton();
//	  Fcp.EmilId("paraproject2022@gmail.com");
//	  Fcp.passwordLogin("Paraproject@99");
//	  Thread.sleep(2000);
//	  Fcp.Loginbutton2();
//	  Thread.sleep(3000);
	  Fcp.checkin();
	  Fcp.TicketNumber("96785443");
	  Fcp.emailid("paraproject2022@gmail.com");
	  
	  Fcp.flightcheckin();
	 // Fcp.Tsearch();
	  Thread.sleep(3000);
	  
  }

 

  @AfterMethod
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
