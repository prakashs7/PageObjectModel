package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AddressPage extends GenericWrappers {

	public AddressPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public AddressPage enterHouseNo(String houseNo) {
		
		enterByXpath(prop.getProperty("AddressPage.HouseNo.Xpath"), houseNo);
		return this;
	}
	
	public AddressPage enterStreet(String street) {
		
		enterByXpath(prop.getProperty("AddressPage.Street.Xpath"), street);
		return this;
	}
	
	public AddressPage enterArea(String area) {
		
		enterByXpath(prop.getProperty("AddressPage.Area.Xpath"), area);
		return this;
	}
	
	public AddressPage enterPincode(String pincode) {
		
		enterByXpath(prop.getProperty("AddressPage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public AddressPage enterState(String state) {
		
		enterByXpath(prop.getProperty("AddressPage.State.Xpath"), state);
		return this;
	}
	
	public AddressPage selectCity(String city) {
		
		selectVisibileTextByXpath(prop.getProperty("AddressPage.City.Xpath"), city);
		return this;
	}
	
	public AddressPage selectPostOffice(String postOffice) {
		
		selectVisibileTextByXpath(prop.getProperty("AddressPage.PostOffice.Xpath"), postOffice);
		return this;
	}
	
	public AddressPage enterMobileNumber1(String mobileNumber1) {
		
		enterByXpath(prop.getProperty("AddressPage.MobileNumber.Xpath"), mobileNumber1);
		return this;
	}
	
	public AddressPage clickOnCopyResidenceToOfficeAddress(String option) {
		
		clickByXpath(prop.getProperty("AddressPage.CopyResidenceToOffice.Xpath"),option);
		return this;
	}
	
	public AddressPage enterOfficeName(String officeName) {
		
		enterByXpath(prop.getProperty("AddressPage.OffName.Xpath"), officeName);
		return this;
	}
	
	public AddressPage enterOfficeStreet(String officeStreet) {
		
		enterByXpath(prop.getProperty("AddressPage.OffStreet.Xpath"), officeStreet);
		return this;
	}
	
	public AddressPage enterOfficeArea(String officeArea) {
		
		enterByXpath(prop.getProperty("AddressPage.OffArea.Xpath"), officeArea);
		return this;
	}
	
	public AddressPage clickOnSelectCountry() {
		
		clickByXpath(prop.getProperty("AddressPage.SelectCountry.Xpath"));
		return this;
	}
	
	public AddressPage clickOnCountry(String option) {
		
		clickByXpath(prop.getProperty("AddressPage.Country.Xpath"),option);
		return this;
	}
	
	public AddressPage enterOfficePincode(String officePincode) {
		
		enterByXpath(prop.getProperty("AddressPage.OffPincode.Xpath"), officePincode);
		return this;
	}
	
	public AddressPage enterOfficeState(String officeState) {
		
		enterByXpath(prop.getProperty("AddressPage.OffState.Xpath"), officeState);
		return this;
	}
	
	public AddressPage enterOfficeCity(String officeCity) {
		
		enterByXpath(prop.getProperty("AddressPage.OffCity.Xpath"), officeCity);
		return this;
	}
	
	public AddressPage enterOfficePost(String officePost) {
		
		enterByXpath(prop.getProperty("AddressPage.OffPost.Xpath"), officePost);
		return this;
	}
	
	public AddressPage enterOfficePhoneNumber(String officePhoneNumber) {
		
		enterByXpath(prop.getProperty("AddressPage.OffPhone.Xpath"), officePhoneNumber);
		return this;
	}
	
	public AddressPage clickOnCheckBox() {
		
		clickByXpath(prop.getProperty("AddressPage.Checkbox.Xpath"));
		return this;
	}
	
}
