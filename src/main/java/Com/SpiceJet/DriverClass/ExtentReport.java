package Com.SpiceJet.DriverClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	public static ExtentReports getExtentReport() {
	String extentReportPth=System.getProperty("user.dir")+"\\reports\\extentreport.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPth);
	reporter.config().setReportName("Spicejet Automation Result");
	reporter.config().setDocumentTitle("spicejet Automation Test Result");
	
	ExtentReports extentReport=new ExtentReports();
	extentReport.attachReporter(reporter);
	return extentReport;
}
}