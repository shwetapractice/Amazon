package listenersextentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		String path=System.getProperty("user.dir")+"\\report\\amazonreport.html";
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
		
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		reporter.config().setReportName("AmazonTestReport");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA_ID", "Shweta Nimkarde");
		extent.setSystemInfo("Parent_Organization", "Fleet_Studio");
		
		return extent;
	}
}
             