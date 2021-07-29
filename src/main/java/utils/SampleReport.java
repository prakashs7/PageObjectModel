package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	
	public void report() {
		
		ExtentReports report = new ExtentReports("./reports/result.html", false);
		
		ExtentTest test = report.startTest("TC001", "To verify whether the user is able to to create account in IRCTC application");
		
		test.log(LogStatus.FAIL, "Application launcehed with the given url successfully");
		
		report.endTest(test);
		report.flush();
	}

}
