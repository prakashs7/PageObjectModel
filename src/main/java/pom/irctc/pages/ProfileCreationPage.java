package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ProfileCreationPage extends GenericWrappers {
	
	public ProfileCreationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public ProfileCreationPage enterUserName(String userName) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.UserName.Xpath"), userName);
		return this;
	}
	
	public ProfileCreationPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.Password.Xpath"), password);
		return this;
	}
	
	public ProfileCreationPage confirmPassword(String confirmPassword) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public ProfileCreationPage selectSecurityQuestion(String secquestion) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.SecurityQuestion.Xpath"), secquestion);
		return this;
	}
	
	public ProfileCreationPage enterSecurityAnswer(String secanswer) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.SecurityAnswer.Xpath"), secanswer);
		return this;
	}
	
	public ProfileCreationPage clickOnDOB() {
		
		clickByXpath(prop.getProperty("ProfileCreationPage.DOB.Xpath"));
		return this;
	}
	
	public ProfileCreationPage selectDOBMonth(String month) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.DOBMonth.Xpath"), month);
		return this;
	}
	
	public ProfileCreationPage selectDOBYear(String year) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.DOBYear.Xpath"), year);
		return this;
	}
	
	public ProfileCreationPage clickOnDOBDay(String option) {
		
		clickByXpath(prop.getProperty("ProfileCreationPage.DOBDay.Xpath"),option);
		return this;
	}
	
	public ProfileCreationPage clickOnGender(String option) {
		
		clickByXpath(prop.getProperty("ProfileCreationPage.Gender.Xpath"),option);
		return this;
	}
	
	public ProfileCreationPage clickOnMaritialStatus(String option) {
		
		clickByXpath(prop.getProperty("ProfileCreationPage.MaritialStatus.Xpath"),option);
		return this;
	}
	
	public ProfileCreationPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public ProfileCreationPage selectOccupation(String occupation) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.Occupation.Xpath"), occupation);
		return this;
	}
	
	public ProfileCreationPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public ProfileCreationPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.LastName.Xpath"), lastName);
		return this;
	}
	
	public ProfileCreationPage selectNationality(String nationality) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public ProfileCreationPage enterHouseNo(String houseNo) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.HouseNo.Xpath"), houseNo);
		return this;
	}
	
	public ProfileCreationPage enterStreet(String street) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.Street.Xpath"), street);
		return this;
	}
	
	public ProfileCreationPage enterArea(String area) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.Area.Xpath"), area);
		return this;
	}
	
	public ProfileCreationPage selectCountry(String country) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.Country.Xpath"), country);
		return this;
	}
	
	public ProfileCreationPage enterMobileNumber(String mobileNumber) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.MobileNumber.Xpath"), mobileNumber);
		return this;
	}

	public ProfileCreationPage enterPincode(String pincode) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public ProfileCreationPage clickOnCommsAddresssameasRes(String option) {
		
		clickByXpath(prop.getProperty("ProfileCreationPage.CommsAddresssameasRes.Xpath"),option); //option 0/1
		return this;
	}
	
	public ProfileCreationPage enterOffName(String offName) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.OffName.Xpath"), offName);
		return this;
	}
	
	public ProfileCreationPage enterOffStreet(String offStreet) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.OffStreet.Xpath"), offStreet);
		return this;
	}
	
	public ProfileCreationPage enterOffArea(String offArea) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.OffArea.Xpath"), offArea);
		return this;
	}
	
	public ProfileCreationPage selectOffCountry(String offCountry) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.OffCountry.Xpath"), offCountry);
		return this;
	}
	
	public ProfileCreationPage enterOffNumber(String offNumber) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.OffNumber.Xpath"), offNumber);
		return this;
	}
	
	public ProfileCreationPage enterOffPincode(String offPincode) {
		
		enterByXpath(prop.getProperty("ProfileCreationPage.OffPincode.Xpath"), offPincode);
		return this;
	}
	
	public ProfileCreationPage selectOffCity(String offCity) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.OffCity.Xpath"), offCity);
		return this;
	}
	
	public ProfileCreationPage selectOffState(String offState) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.OffState.Xpath"), offState);
		return this;
	}
	
	public ProfileCreationPage selectOffPost(String offPost) {
		
		selectVisibileTextByXpath(prop.getProperty("ProfileCreationPage.OffPost.Xpath"), offPost);
		return this;
	}
	
	public ProfileCreationPage scrollPageDown() {
		
		pageDown();
		return this;
	}
}
