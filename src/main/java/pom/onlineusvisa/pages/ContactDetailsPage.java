package pom.onlineusvisa.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class ContactDetailsPage extends GenericWrappers {
	
	
	public ContactDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
	}
	
public ContactDetailsPage enterAddress(String address) {
		
		enterByXpath(prop.getProperty("ContactDetailsPage.Address.Xpath"), address);
		
		return this;
	}
	
	public ContactDetailsPage enterCityName(String city) {
		
		enterByXpath(prop.getProperty("ContactDetailsPage.CityName.Xpath"), city);
		
		return this;
	}
	
	public ContactDetailsPage enterStateName(String state) {
		
		enterByXpath(prop.getProperty("ContactDetailsPage.StateName.Xpath"), state);
		
		return this;
	}
	
	public ContactDetailsPage enterPincode(String pincode) {
		
		enterByXpath(prop.getProperty("ContactDetailsPage.Pincode.Xpath"), pincode);
		
		return this;
	}
	
	public ContactDetailsPage clickOnCountryCode() {
		
		clickByXpath(prop.getProperty("ContactDetailsPage.CountryCode.Xpath"));
		
		return this;
	}
	
	public ContactDetailsPage clickOnCountry() {
		
		clickByXpath(prop.getProperty("ContactDetailsPage.Country.Xpath"));
		
		return this;
	}
	
	public ContactDetailsPage enterPhoneNumber(String phoneNo) {
		
		enterByXpath(prop.getProperty("ContactDetailsPage.PhoneNumber.Xpath"), phoneNo);
		
		return this;
	}
	
	public ContactDetailsPage usedOtherPhoneNumber(String option) {
		
		clickByXpath(prop.getProperty("ContactDetailsPage.UsedOtherPhoneNumber.Xpath"),option);
		
		return this;
	}
	
	public ContactDetailsPage OtherPhoneNumber(String otherPhoneNo) {
		
		enterByXpath(prop.getProperty("ContactDetailsPage.OtherPhoneNumber.Xpath"), otherPhoneNo);
		
		return this;
	}
	
public ContactDetailsPage useTab() {
		
		keyTAB();
		
		return this;
	}
	
	public ContactDetailsPage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("ContactDetailsPage.State.Xpath"), state);
		
		return this;
	}
	
public ContactDetailsPage scrollPageDown() {
		
		pageDown();
		
		return this;
		
	}
	
	public  AdditionalDetailsPage clickOnNext1() {
		
		clickByXpath(prop.getProperty("ContactDetailsPage.Next1.Xpath"));
		
		return new AdditionalDetailsPage(driver,test);

}
}
