package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestLoginPage extends GenericWrappers{

	public GuestLoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public GuestLoginPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("GuestLoginPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public GuestLoginPage enterMobileNumber(String mobileNumber) {
		
		enterByXpath(prop.getProperty("GuestLoginPage.MobileNumber.Xpath"), mobileNumber);
		return this;
	}
	
	public GuestHotelsHomepage clickOnSignIn() {
		
		clickByXpath(prop.getProperty("GuestLoginPage.SignIn.Xpath"));
		
		return new GuestHotelsHomepage(driver,test);
	}
	
}
