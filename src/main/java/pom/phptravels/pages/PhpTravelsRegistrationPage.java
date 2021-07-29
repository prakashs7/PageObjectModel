package pom.phptravels.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PhpTravelsRegistrationPage extends GenericWrappers{
	
	
	
	public PhpTravelsRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public PhpTravelsRegistrationPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public PhpTravelsRegistrationPage clickOnCountryCode() {
		
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.CountryCode.Xpath"));
		return this;
	}
	
	public PhpTravelsRegistrationPage clickOnSelectedCountry(String option) {
		
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.SelectedCountry.Xpath"),option);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterPhoneNumber(String phoneNo) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.PhoneNumber.Xpath"), phoneNo);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterCompanyName(String companyName) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyName.Xpath"), companyName);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterCompanyStreet(String companyStreet) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyStreet.Xpath"), companyStreet);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterCompanyArea(String companyArea) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyArea.Xpath"), companyArea);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterCompanyCity(String companyCity) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyCity.Xpath"), companyCity);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterCompanyState(String comapanyState) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyState.Xpath"), comapanyState);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterCompanyPincode(String companyPincode) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.CompanyPincode.Xpath"), companyPincode);
		return this;
	}
	
	public PhpTravelsRegistrationPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("PhpTravelsRegistrationPage.Country.Xpath"), country);
		return this;
	}
	
	public PhpTravelsRegistrationPage selectSourceToFind(String source) {
		
		selectVisibileTextByXpath(prop.getProperty("PhpTravelsRegistrationPage.SourceToFind.Xpath"), source);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterMobileNumber(String mobileNo) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.MobileNumber.Xpath"), mobileNo);
		return this;
	}

	public PhpTravelsRegistrationPage scrollPageDown() {
		
		pageDown();
		
		return this;
		
	}
	public PhpTravelsRegistrationPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public PhpTravelsRegistrationPage enterConfirmPassword(String confirmPassword) {
		
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public GeneratePasswordPage clickOnGeneratePassword() {
		
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.GeneratePassword.Xpath"));
		return new GeneratePasswordPage();
	}
	
	public PhpTravelsRegistrationPage clickOnMailingList() {
		
		clickByXpath(prop.getProperty("PhpTravelsRegistrationPage.MailingList.Xpath"));
		return this;
	}
	
	public PhpTravelsRegistrationPage waitTime() {
		
		implicitWait();
		return this;
	}
	
	public PhpTravelsRegistrationPage sleep() {
		
		waitProperty(2000);
		return this;
	}
}
