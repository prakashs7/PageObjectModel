package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class PersonalDetailsPage extends GenericWrappers {

	
public PersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

public PersonalDetailsPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("PersonalDetailsPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public PersonalDetailsPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("PersonalDetailsPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public PersonalDetailsPage clickOnSelectOccupation() {
		
		clickByXpath(prop.getProperty("PersonalDetailsPage.SelectOccupation.Xpath"));
		return this;
	}
	
	public PersonalDetailsPage clickOnOccupation(String option) {
		
		clickByXpath(prop.getProperty("PersonalDetailsPage.Occupation.Xpath"),option);
		return this;
	}
	
	public PersonalDetailsPage clickOnDOB() {
		
		clickByXpath(prop.getProperty("PersonalDetailsPage.DOB.Xpath"));
		return this;
	}
	
	public PersonalDetailsPage selectDOBMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.DOBMonth.Xpath"), month);
		return this;
	}
	
	public PersonalDetailsPage selectDOBYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.DOBYear.Xpath"), year);
		return this;
	}
	
	public PersonalDetailsPage selectDOBDay(String option) {
		
		clickByXpath(prop.getProperty("PersonalDetailsPage.DOBDay.Xpath"),option);
		return this;
	}
	
	public PersonalDetailsPage clickOnMaritialStatus(String option) {
		clickByXpath(prop.getProperty("PersonalDetailsPage.MaritialStatus.Xpath"),option);
		return this;
	}
	
	public PersonalDetailsPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.Country.Xpath"), country);
		return this;
	}
	
	public PersonalDetailsPage clickOnGender(String option) {
		
		clickByXpath(prop.getProperty("PersonalDetailsPage.Gender.Xpath"),option);
		return this;
	}
	
	public PersonalDetailsPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("PersonalDetailsPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public PersonalDetailsPage enterMobileNumber(String mobileNumber) {
		
		enterByXpath(prop.getProperty("PersonalDetailsPage.MobileNumber.Xpath"), mobileNumber);
		return this;
	}
	
	public PersonalDetailsPage selectNationality(String nationality) {
		
		selectVisibileTextByXpath(prop.getProperty("PersonalDetailsPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public AddressPage clickOnContinue() {
		
		clickByXpath(prop.getProperty("PersonalDetailsPage.Continue.Xpath"));
		return new AddressPage(driver,test);
	}
}
