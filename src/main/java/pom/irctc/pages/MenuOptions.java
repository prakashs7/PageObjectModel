package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class MenuOptions extends GenericWrappers {
	
	public MenuOptions(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FtrServiceSignUpPage clickOnBookYourTrainOption() {
		
		clickByXpath(prop.getProperty("MenuOptions.BookTrain.Xpath"));
		return new FtrServiceSignUpPage(driver,test);
	}
	
	public CharterPage clickOnCharter() {
		
		clickByXpath(prop.getProperty("MenuOptions.Charter.Xpath"));
		
		return new CharterPage(driver,test);
	}

}
