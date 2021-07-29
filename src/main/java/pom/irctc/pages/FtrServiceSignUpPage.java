package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FtrServiceSignUpPage extends GenericWrappers {
	
	public FtrServiceSignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FtrServiceSignUpPage switchWindow() {
		
		switchToLastWindow();
		return this;
	}
	
	public ProfileCreationPage clickOnNewUserSignUp() {
		
		clickByXpath(prop.getProperty("FtrServiceSignUpPage.NewUserSignUp.Xpath"));
		return new ProfileCreationPage(driver,test);
	}

}
