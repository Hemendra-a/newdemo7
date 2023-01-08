package extentTestReport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentTestReport {
	static ExtentTest logger;
	static ExtentReports report;
	
	@BeforeClass
	public static void startsTest() {
		report=new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportsResult.html",true);
	
	}
	@Test
	public void VerifyPageTitle() {
		logger=report.startTest("Verify Page Title");
		String exp="Google";
		String act="Google";
		Assert.assertEquals( act,exp);
		logger.log(LogStatus.PASS, "test case pass");
    }
	@Test
	public void VerifyPageUrl() {
		logger=report.startTest("Verify Page url tc");
		String exp="Google.com";
		String act="Yahoo.com";
		Assert.assertEquals( act,exp);
		logger.log(LogStatus.PASS, "test case pass");
    }
	@AfterMethod
	public void getresult(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, "Test case failed"+result.getName());
			logger.log(LogStatus.FAIL, "Test case failed"+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test case failed"+result.getName());
			logger.log(LogStatus.SKIP, "Test case failed"+result.getThrowable());
		}
		report.endTest(logger);
	}
	
	@AfterClass
	public void endtest() {
		
		report.flush();
		report.close();
	}
}
