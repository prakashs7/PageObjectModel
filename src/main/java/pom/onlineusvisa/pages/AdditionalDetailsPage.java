package pom.onlineusvisa.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class AdditionalDetailsPage extends GenericWrappers {
	
	public AdditionalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		
	}
	
public AdditionalDetailsPage enterKnownLanguages(String languages) {
		
		enterByXpath(prop.getProperty("AdditionalDetailsPage.KnownLanguages.Xpath"), languages);
		
		return this;
	}
	
	public AdditionalDetailsPage belongToTribe(String option) {
		
		clickByXpath(prop.getProperty("AdditionalDetailsPage.BelongToTribe.Xpath"),option);
		
		return this;
		
	}
	
	public AdditionalDetailsPage enterTribeName(String tribeName) {
		
		enterByXpath(prop.getProperty("AdditionalDetailsPage.TribeName.Xpath"), tribeName);
		
		return this;
	}
	
	public AdditionalDetailsPage selectMaritialStatus(String maritialStatus) {
		
		selectVisibileTextByXpath(prop.getProperty("AdditionalDetailsPage.MaritialStatus.Xpath"), maritialStatus);
		
		return this;
		
	}
	
	public AdditionalDetailsPage otherPersonTravellingWith(String option) {
		
		clickByXpath(prop.getProperty("AdditionalDetailsPage.PersonTravellingWith.Xpath"),option);
		return this;
	}
	
	public AdditionalDetailsPage selectPurposeOfTravel(String travelPurpose) {
		
		selectVisibileTextByXpath(prop.getProperty("AdditionalDetailsPage.PurposeOfTravel.Xpath"), travelPurpose);
		
		return this;
	}
	
	public AdditionalDetailsPage selectInterviewLanguage(String interviewLanguage) {
		
		selectVisibileTextByXpath(prop.getProperty("AdditionalDetailsPage.InterviewLanguage.Xpath"), interviewLanguage);
		
		return this;
	}
	
	public AdditionalDetailsPage clickCheckBox() {
		
		clickByXpath(prop.getProperty("AdditionalDetailsPage.CheckBox.Xpath"));
		
		return this;
	}

}
