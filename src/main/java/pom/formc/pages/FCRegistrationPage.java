package pom.formc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FCRegistrationPage extends GenericWrappers{
	
	public FCRegistrationPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FCRegistrationPage enterUserId(String userId) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.UserId.Xpath"), userId);
		
		return this;
	}
	
	public FCRegistrationPage enterPassword(String password) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.Password.Xpath"), password);
		return this;
	}
	
	public FCRegistrationPage enterConfirmPassword(String confirmPassword) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	
	public FCRegistrationPage selectSecurityQuestion(String securityQuestion) {
		
		selectValueByXpath(prop.getProperty("FCRegistrationPage.SecurityQuestion.Xpath"), securityQuestion);
		return this;
	}
	
	public FCRegistrationPage enterSecurityAnswer(String securityAnswer) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.SecurityAnswer.Xpath"), securityAnswer);
		return this;
	}
	
	public FCRegistrationPage enterUserName(String userName) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.UserName.Xpath"), userName);
		return this;
	}
	
	public FCRegistrationPage selectGender(String gender) {
		
		selectValueByXpath(prop.getProperty("FCRegistrationPage.Gender.Xpath"), gender);
		return this;
	}
	
	public FCRegistrationPage enterDOB(String dob) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.DOB.Xpath"), dob);
		return this;
	}
	
	public FCRegistrationPage enterDesignation(String designation) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.Designation.Xpath"), designation);
		return this;
	}
	
	public FCRegistrationPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public FCRegistrationPage enterMobileNum(String mobileNum) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.MobileNum.Xpath"), mobileNum);
		return this;
	}
	
	public FCRegistrationPage enterPhoneNum(String phoneNum) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.PhoneNum.Xpath"), phoneNum);
		return this;
	}
	
	public FCRegistrationPage enterHotelName(String hotelName) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.HotelName.Xpath"), hotelName);
		return this;
	}
	
	public FCRegistrationPage enterCapacity(String capacity) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.Capacity.Xpath"), capacity);
		return this;
	}
	
	public FCRegistrationPage enterAddress(String address) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.Address.Xpath"), address);
		return this;
	}
	
	public FCRegistrationPage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("FCRegistrationPage.State.Xpath"), state);
		return this;
	}
	
	public FCRegistrationPage selectCity(String city) {
		
		selectValueByXpath(prop.getProperty("FCRegistrationPage.City.Xpath"), city);
		return this;
	}
	
	public FCRegistrationPage selectAccomodation(String accomodation) {
		
		selectVisibileTextByXpath(prop.getProperty("FCRegistrationPage.Accomodation.Xpath"), accomodation);
		return this;
	}
	
	public FCRegistrationPage selectStarRating(String starRating) {
		
		selectValueByXpath(prop.getProperty("FCRegistrationPage.StarRating.Xpath"), starRating);
		return this;
	}
	
	public FCRegistrationPage enterHotelEmail(String hotelEmail) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.HotelEmail.Xpath"), hotelEmail);
		return this;
	}
	
	public FCRegistrationPage enterHotelMobileNum(String hotelMobile) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.HotelMobileNum.Xpath"), hotelMobile);
		return this;
	}
	
	public FCRegistrationPage enterHotelPhoneNum(String hotelPhone) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.HotelPhoneNum.Xpath"), hotelPhone);
		return this;
	}
	
	public FCRegistrationPage enterOwnerName(String ownerName) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.OwnerName.Xpath"), ownerName);
		return this;
	}
	
	public FCRegistrationPage enterOwnerAddress(String ownerAddress) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.OwnerAddress.Xpath"), ownerAddress);
		return this;
	}
	
	public FCRegistrationPage selectOwnerState(String ownerState) {
		
		selectVisibileTextByXpath(prop.getProperty("FCRegistrationPage.OwnerState.Xpath"), ownerState);
		return this;
	}
	
	public FCRegistrationPage selectOwnerCity(String ownerCity) {
		
		selectValueByXpath(prop.getProperty("FCRegistrationPage.OwnerCity.Xpath"), ownerCity);
		return this;
	}
	
	public FCRegistrationPage enterOwnerEmailId(String ownerEmailId) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.OwnerEmailId.Xpath"), ownerEmailId);
		return this;
	}
	
	public FCRegistrationPage enterOwnerPhone(String ownerPhone) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.OwnerPhone.Xpath"), ownerPhone);
		return this;
	}
	
	public FCRegistrationPage enterOwnerMobile(String ownerMobile) {
		
		enterByXpath(prop.getProperty("FCRegistrationPage.OwnerMobile.Xpath"), ownerMobile);
		return this;
	}

	 public FCRegistrationPage useTab() {
		
		keyTAB();
		
		return this;
	}
}
