package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsHomePage extends GenericWrappers{

	
	public HotelsHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public HotelsHomePage switchWindow () {
		
		switchToLastWindow();
		return this;
	}

	public LoginPage clickOnLogin() {
		
		clickByXpath(prop.getProperty("HotelsHomePage.Login.Xpath"));
		
		return new LoginPage(driver,test);
	}
	
	

}
