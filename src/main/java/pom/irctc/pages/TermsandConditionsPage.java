package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TermsandConditionsPage extends GenericWrappers {
	
	public TermsandConditionsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public TermsandConditionsPage clickOnCheckBox() {
		
		clickByXpath(prop.getProperty("TermsandConditionsPage.CheckBox.Xpath"));
		return this;
	}
	
	public OTPPage clickOnMakePayment() {
		
		clickByXpath(prop.getProperty("TermsandConditionsPage.MakePayment.Xpath"));
		return new OTPPage(driver,test);
	}

}
