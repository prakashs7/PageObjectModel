package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers{
	
	
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public LoginPage selectLanguage() {

		clickByXpath(prop.getProperty("LoginPage.Language.Xpath"));
		
		return this;
	}
	
	
	public SignUpPage clickOnCreateNewAccount() {
		
		clickByXpath(prop.getProperty("LoginPage.CreateNewAccount.Xpath"));
		
		return new SignUpPage(driver,test);
	}
	
	public LoginPage waitTime() {
		
		implicitWait();
		
		return this;
	}

}
