package pom.panindiaapplication.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	

	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}


	public HomePage selectTitle(String title) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.Title.Xpath"), title);
		return this;
	}
	
	public HomePage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("HomePage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public HomePage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("HomePage.LastName.Xpath"), lastName);
		return this;
	}
	
	public HomePage enterFatherFirstName(String fatherFirstName) {
		
		enterByXpath(prop.getProperty("HomePage.FatherFirstName.Xpath"), fatherFirstName);
		return this;
	}
	
	public HomePage enterFatherLastName(String fatherLastName) {
		
		enterByXpath(prop.getProperty("HomePage.FatherLastName.Xpath"), fatherLastName);
		return this;
	}
	
	public HomePage enterMobileNumber(String mobileNo) {
		
		enterByXpath(prop.getProperty("HomePage.MobileNumber.Xpath"), mobileNo);
		return this;
	}
	
	public HomePage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("HomePage.EmailId.Xpath"), emailId);
		return this;
	}
	
	public HomePage selectSourceOfIncome(String incomeSource) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.SourceOfIncome.Xpath"), incomeSource);
		return this;
	}
	
	public HomePage clickOnAddressForCommunication(String option) {
		
		clickByXpath(prop.getProperty("HomePage.AddressForCommunication.Xpath"),option);//1 or 2
		return this;
	}
	
	public HomePage enterDOB(String dob) {
		
		enterByXpath(prop.getProperty("HomePage.DOB.Xpath"), dob);
		return this;
	}
	
	
	public HomePage enterHouseNo(String houseNo) {
		
		enterByXpath(prop.getProperty("HomePage.HouseNo.Xpath"), houseNo);
		return this;
	}
	
	public HomePage enterStreetName(String streetName) {
		
		enterByXpath(prop.getProperty("HomePage.StreetName.Xpath"), streetName);
		return this;
	}
	
	public HomePage enterCityName(String cityName) {
		
		enterByXpath(prop.getProperty("HomePage.CityName.Xpath"), cityName);
		return this;
	}
	
	public HomePage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.State.Xpath"), state);
		return this;
	}
	
	public HomePage enterPincode(String pincode) {
		
		enterByXpath(prop.getProperty("HomePage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public HomePage enterOfficeName(String offName) {
		
		enterByXpath(prop.getProperty("HomePage.OfficeName.Xpath"), offName);
		return this;
	}
	
	public HomePage enterBuildingName(String buildingName) {
		
		enterByXpath(prop.getProperty("HomePage.BuildingName.Xpath"), buildingName);
		return this;
	}
	
	public HomePage enterOfficeStreet(String offStreet) {
		
		enterByXpath(prop.getProperty("HomePage.OfficeStreet.Xpath"), offStreet);
		return this;
	}
	
	public HomePage enterOfficeCityName(String offCity) {
		
		enterByXpath(prop.getProperty("HomePage.OfficeCityName.Xpath"), offCity);
		return this;
	}
	
	public HomePage selectOfficeState(String offState) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.OfficeState.Xpath"), offState);
		return this;
	}
	
	public HomePage enterOfficePincode(String offPincode) {
		
		enterByXpath(prop.getProperty("HomePage.OfficePincode.Xpath"), offPincode);
		return this;
	}
	
	public HomePage selectIdentityProof(String idProof) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.IdentityProof.Xpath"), idProof);
		return this;
	}
	
	public HomePage selectAddressProof(String addressProof) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.AddressProof.Xpath"), addressProof);
		return this;
	}
	
	public HomePage selectDOBProof(String dobProof) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.DOBProof.Xpath"), dobProof);
		return this;
	}
	
	public HomePage selectAadhaarProof(String aadhaarProof) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.AadhaarProof.Xpath"), aadhaarProof);
		return this;
	}
	
	public HomePage selectOfficeAddressProof(String offAddressProof) {
		
		selectVisibileTextByXpath(prop.getProperty("HomePage.OfficeAddressProof.Xpath"), offAddressProof);
		return this;
	}
	
	public HomePage clickOnCheckBox() {
		
		clickByXpath(prop.getProperty("HomePage.CheckBox.Xpath"));
		return this;
	}
	
	public HomePage waitTime() {
		
		implicitWait();
		return this;
	}
	
	public HomePage scrollPageDown() {
		
		pageDown();
		
		return this;
		
	}
	
	public HomePage useTab() {
		
		keyTAB();
		
		return this;
	}

}
