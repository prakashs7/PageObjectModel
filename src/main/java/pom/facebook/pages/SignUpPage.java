package pom.facebook.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	
	public SignUpPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	
	public SignUpPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("SignUpPage.FirstName.Xpath"), firstName);
		
		return this;
	}
	
	public SignUpPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("SignUpPage.LastName.Xpath"), lastName);
		
		return this;
	}
	
	public SignUpPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("SignUpPage.EmailId.Xpath"), emailId);
		
		return this;
	}
	
	public SignUpPage confirmEmailid(String confirmEmail) {
		
		enterByXpath(prop.getProperty("SignUpPage.ConfirmEmailid.Xpath"), confirmEmail);
		return this;
	}
	public SignUpPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("SignUpPage.Password.Xpath"), password);
		
		return this;
	}
	
	public SignUpPage dobDay(String day) {
		
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.DOBDay.Xpath"), day);
		
		return this;
	}
	
	public SignUpPage dobMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.DOBMonth.Xpath"), month);
		
		return this;
	}
	
	public SignUpPage dobYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("SignUpPage.DOBYear.Xpath"), year);
		
		return this;
	}
	
	public SignUpPage clickGender(String option) {
		
		clickByXpath(prop.getProperty("SignUpPage.Gender.Xpath"), option);
		
		return this;
	}
		
	public SignUpPage waitTime() {
		
		implicitWait();
		
		return this;
	}
}
