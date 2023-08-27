package Com.SpiceJet.DriverClass;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.ITestResult;
//import org.testng.annotations.BeforeTest;
public class DriverClassSpiceJet {
	public static WebDriver driver;
	
	
public WebDriver beforeTest(){
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
//		  System.setProperty("Webdriver-http-factory", "jdk-http-client");
//			//create instance of chrome driver
//			driver=new ChromeDriver();
//			//implicity managing
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//invoke that spicejet url
			driver.get("https://www.spicejet.com/");
			//maximize the window
			driver.manage().window().maximize();
			return driver;
}

public String takeScreenshot(String testName,WebDriver driver) throws IOException{
	File srcScreenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String srcScreenShotFilepath=	System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
	FileUtils.copyFile(srcScreenshot,new File( srcScreenShotFilepath));
	return srcScreenShotFilepath;
	}
//}

public static void SwitchWindow() {
	String parentwindow=driver.getWindowHandle();
  Set<String> windowhandles=driver.getWindowHandles();
  windowhandles.size();
  for(String childwindow:windowhandles) {
	  if(!childwindow.contentEquals(parentwindow)) {
		  driver.switchTo().window(childwindow);
		  break;
	  }}}


}
