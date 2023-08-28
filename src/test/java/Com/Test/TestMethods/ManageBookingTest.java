package Com.Test.TestMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Com.Objects.ManageBooking;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class ManageBookingTest extends DriverClassSpiceJet{
	
	ManageBooking mb;
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
	
  @Test
  public void BookingMethod() throws InterruptedException, IOException {
	  mb=new ManageBooking(driver);
	  mb.mbmethod();
	  mb.pnrnumber("98356342");
	  mb.emailid("paraproject2022@gmail.com");
	 // mb.searchbooking();
	  mb.checkmanagebooking();
	  Thread.sleep(3000);
  }
  @AfterMethod
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
