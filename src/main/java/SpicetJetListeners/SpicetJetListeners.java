package SpicetJetListeners;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Com.SpiceJet.DriverClass.ExtentReport;
import Com.SpiceJet.DriverClass.DriverClassSpiceJet;

public class SpicetJetListeners extends DriverClassSpiceJet implements ITestListener {
WebDriver driver;
ExtentReports extentReport=ExtentReport.getExtentReport();
ExtentTest extentTest;
@Override
public void onTestStart(ITestResult result) {
	extentTest=extentReport.createTest(result.getName());
}
@Override
public void onTestSuccess(ITestResult result) {
	//log the status 
	extentTest.log(Status.PASS, "Test Passed");
	String testName=result.getName();
//try {
//		
//		String screenshotpath= takeScreenshot(testName, driver);
//		extentTest.addScreenCaptureFromPath(screenshotpath);
//			} catch (IOException e) {
//		e.printStackTrace();
//	}
}
//Invoked each time a test fails.
@Override
public void onTestFailure(ITestResult result) {
	extentTest.fail(result.getThrowable());
	//get the name of failed test case
	String testName=result.getName();
	//Logic for screenshot capture
	try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} 
	catch (IllegalAccessException|IllegalArgumentException|NoSuchFieldException|SecurityException e) {
		e.printStackTrace();
	}
	
//	try {
//		
//		String screenshotpath= takeScreenshot(testName, driver);
//		extentTest.addScreenCaptureFromPath(screenshotpath);
//			} catch (IOException e) {
//		e.printStackTrace();
//	}
}
public void onFinish(ITestContext context) {
	
	extentReport.flush();
}
}