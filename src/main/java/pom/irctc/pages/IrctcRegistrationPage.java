package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcRegistrationPage extends GenericWrappers {

	
	public IrctcRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public IrctcRegistrationPage enterUserName(String userName) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.UserName.Xpath"), userName);
		return this;
		
	}
	
	public IrctcRegistrationPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public IrctcRegistrationPage enterConfirmPassword(String confirmPassword) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public IrctcRegistrationPage clickOnPreferredLanguage() {
		
		clickByXpath(prop.getProperty("IrctcRegistrationPage.PreferredLanguage.Xpath"));
		return this;
	}
	
	public IrctcRegistrationPage clickonlanguageoption(String option) {
		
		clickByXpath(prop.getProperty("IrctcRegistrationPage.LanguageOption.Xpath"),option);
		return this;
	}
	
	public IrctcRegistrationPage clickOnSecurityQuestion() {
		
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SecurityQuestion.Xpath"));
		return this;
	}
	
	public IrctcRegistrationPage clickOnSecurityQuestionOption(String option) {
		
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SecurityQuestionOption.Xpath"),option);
		return this;
	}
	
	public IrctcRegistrationPage enterSecurityAnswer(String securityAnswer) {
		
		enterByXpath(prop.getProperty("IrctcRegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
		return this;
	}
	
	public PersonalDetailsPage clickOnContinue() {
		
		clickByXpath(prop.getProperty("IrctcRegistrationPage.Continue.Xpath"));
		
		return new PersonalDetailsPage(driver,test);
	}
	
	
}
