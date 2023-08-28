package Com.Test.TestMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Objects.FlightStatus;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class FlightStatusTest extends DriverClassSpiceJet{
	FlightStatus Fs;
	
	@BeforeTest
	public void AccessDriverClass() throws IOException {
		driver=beforeTest();
		
	}
	
	
  @Test
  public void flightstatusMethod() throws InterruptedException, IOException {
	  Fs=new FlightStatus(driver);
	  Fs.flightstatus();
	  Fs.SelectOrigin("DEl");
	  //Thread.sleep(3000);
	  Fs.Destination("pondicherry");
	  Fs.sg("8901");
	 // Fs.se();
	  Fs.checkflightstatusmethod();
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void aftermethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }

}
