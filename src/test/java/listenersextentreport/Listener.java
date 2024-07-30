package listenersextentreport;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testcases.LaunchTest;
import utility.ScreenShot;


public class Listener extends LaunchTest  implements ITestListener {
	
	ExtentReports extent= ExtentReportGenerator.extentReportGenerator();
	
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Testcase pass");
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		String filepath = null;
		
		try {
			filepath = ScreenShot.captureScreenShotinProject(driver, result.getMethod().getMethodName());
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		try {
			test.addScreenCaptureFromPath(ScreenShot.captureScreenShotinProject(driver, result.getMethod().getMethodName()));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	

}
