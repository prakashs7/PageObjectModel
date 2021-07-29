package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class OTPPage extends GenericWrappers{
	
	
	public OTPPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public OTPPage clickOnVerify() {
		
		clickByXpath(prop.getProperty("OTPPage.Verify.Xpath"));
		return this;
	}
	
	public OTPPage verifyOTPRequiredText(String text) {
		
		verifyTextContainsByXpath(prop.getProperty("OTPPage.OTPRequiredText.Xpath"), text);
		return this;
	}

}
