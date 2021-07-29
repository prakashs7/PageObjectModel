package pom.onlineusvisa.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class VisaHomePage extends GenericWrappers {
	
	public VisaHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
	}
	
	public VisaHomePage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("VisaHomePage.FirstName.Xpath"), firstName);
		
		return this;
	}
	
	public VisaHomePage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("VisaHomePage.LastName.Xpath"), lastName);
		
		return this;
	}
	
	public VisaHomePage enterFullName(String fullName) {
		
		enterByXpath(prop.getProperty("VisaHomePage.FullName.Xpath"), fullName);
		
		return this;
	}
	
	public VisaHomePage usedOtherNames() {
		
		clickByXpath(prop.getProperty("VisaHomePage.OtherNames.Xpath"));
		
		return this;
	}
	
	public VisaHomePage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("VisaHomePage.EmailId.Xpath"), emailId);
		
		return this;
	}
	
	public VisaHomePage confirmEmailId(String confirmEmailId) {
		
		enterByXpath(prop.getProperty("VisaHomePage.ConfirmEmailId.Xpath"), confirmEmailId);
		
		return this;
	}
	
	public VisaHomePage usedOtherEmailId(String option) {
		
		clickByXpath(prop.getProperty("VisaHomePage.OtherEmailId.Xpath"), option);
		
		return this;
	}
	
	public VisaHomePage enterAdditionalEmailId(String additonalEmailId) {
		
		enterByXpath(prop.getProperty("VisaHomePage.AdditionalEmailId.Xpath"), additonalEmailId);
		
		return this;
	}
	
	public VisaHomePage selectGender(String option) {
		
		clickByXpath(prop.getProperty("VisaHomePage.Gender.Xpath"),option);
		
		return this;
	}
	
	public VisaHomePage clickOnDOB() {
		
		clickByXpath(prop.getProperty("VisaHomePage.DOB.Xpath"));
		
		return this;
		
	}
	
	public VisaHomePage selectDOBYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("VisaHomePage.DOBYear.Xpath"), year);
		
		return this;
		
	}
	
	public VisaHomePage selectDOBMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("VisaHomePage.DOBMonth.Xpath"), month);
		
		return this;
	}
	
	public VisaHomePage clickOnDOBDay(String option) {
		
		clickByXpath(prop.getProperty("VisaHomePage.DOBDay1.Xpath"),option);
		
		return this;
	}
	
	public VisaHomePage enterCityOfBirth(String birthCity) {
		
		enterByXpath(prop.getProperty("VisaHomePage.CityOfBirth.Xpath"), birthCity);
		
		return this;
	}
	
	public VisaHomePage enterStateOfBirth(String birthState) {
		
		enterByXpath(prop.getProperty("VisaHomePage.StateOfBirth.Xpath"), birthState);
		
		return this;
	}
	
	public VisaHomePage selectCountryOfBirth(String birthCountry) {
		
		selectVisibileTextByXpath(prop.getProperty("VisaHomePage.CountryOfBirth.Xpath"), birthCountry);
		
		return this;
	}
	
	public VisaHomePage selectNationality(String nationality) {
		
		selectVisibileTextByXpath(prop.getProperty("VisaHomePage.Nationality.Xpath"), nationality);
		
		return this;
	}
	
	public ContactDetailsPage clickOnNext() {
		
		clickByXpath(prop.getProperty("VisaHomePage.Next.Xpath"));
		
		return new ContactDetailsPage(driver,test);
	}
	
	
	public VisaHomePage waitTime() {
		
		implicitWait();
		return this;
	}
	
	public VisaHomePage useTab() {
		
		keyTAB();
		
		return this;
	}
	
	public VisaHomePage scrollPageDown() {
		
		pageDown();
		
		return this;
		
	}
	
 public VisaHomePage sleep() {
		
		waitProperty(2000);
		return this;
	} 
}
