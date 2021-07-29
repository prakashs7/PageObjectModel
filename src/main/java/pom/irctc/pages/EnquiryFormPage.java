package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {
	
	public EnquiryFormPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public EnquiryFormPage enterApplicantName(String applicantName) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.ApplicantName.Xpath"), applicantName);
		return this;

	}
	
	public EnquiryFormPage enterOrgName(String orgName) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.OrgName.Xpath"), orgName);
		return this;

	}
	
	public EnquiryFormPage enterOrgAddress(String orgAddress) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.OrgAddress.Xpath"), orgAddress);
		return this;

	}
	
	public EnquiryFormPage enterMobileNumber(String mobileNumber) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.MobileNumber.Xpath"), mobileNumber);
		return this;

	}
	
	public EnquiryFormPage enterEmailId(String emailId) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.EmailId.Xpath"), emailId);
		return this;

	}
	
	public EnquiryFormPage selectRequest(String request) {
		
		selectVisibileTextByXpath(prop.getProperty("EnquiryFormPage.RequestType.Xpath"), request);
		return this;

	}
	
	public EnquiryFormPage enterOriginatingStation(String originStation) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.OriginStation.Xpath"), originStation);
		return this;

	}
	
	public EnquiryFormPage enterDestinationStation(String destination) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.DestinationStation.Xpath"), destination);
		return this;

	}
	
	public EnquiryFormPage clickOnDepartureCalender() {
		
		clickByXpath(prop.getProperty("EnquiryFormPage.DepartureCalender.Xpath"));
		return this;

	}
	
	public EnquiryFormPage clickOnDepartureDate(String option) {
		
		clickByXpath(prop.getProperty("EnquiryFormPage.DepartureDate.Xpath"),option);
		return this;

	}
	
	public EnquiryFormPage clickOnArrivalCalender() {
		
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalCalender.Xpath"));
		return this;

	}
	
	public EnquiryFormPage clickOnArrivalDate(String option) {
		
		clickByXpath(prop.getProperty("EnquiryFormPage.ArrivalDate.Xpath"),option);
		return this;

	}
	
	public EnquiryFormPage enterTourDuration(String noOfDays) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.Duration.Xpath"), noOfDays);
		return this;

	}
	
	public EnquiryFormPage enterTypeAndNoOfCoachesRequired(String coachDetails) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.TypeAndNoofCoaches.Xpath"), coachDetails);
		return this;

	}
	
	public EnquiryFormPage enterNoOfPassengers(String noOfPassengers) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.NoofPassengers.Xpath"), noOfPassengers);
		return this;

	}
	
	public EnquiryFormPage enterCharterPurpose(String charterPurpose) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.CharterPurpose.Xpath"), charterPurpose);
		return this;

	}
	
	public EnquiryFormPage enterAddServicesRequired(String addServices) {
		
		enterByXpath(prop.getProperty("EnquiryFormPage.ServicesRequired.Xpath"), addServices);
		return this;

	}
	
	public EnquiryFormPage clickOnSubmit() {
		
		clickByXpath(prop.getProperty("EnquiryFormPage.Submit.Xpath"));
		return this;

	}
	
	public EnquiryFormPage verifytext(String text) {
		
		verifyTextByXpath(prop.getProperty("EnquiryFormPage.VerifyText.Xpath"), text);
		return this;

	}
	
	public EnquiryFormPage scrollPageDown() {
		
		pageDown();
		return this;

	}
}
