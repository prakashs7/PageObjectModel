package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FCHomePage extends GenericWrappers {
	
	public FCHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FCRegistrationPage clickOnSignUpRegistration() {
		
		clickByXpath(prop.getProperty("FCHomePage.SignUpRegistration.Xpath"));
		
		return new FCRegistrationPage(driver,test);
	}

}
