package pom.onlineusvisa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.onlineusvisa.pages.VisaHomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To verify online US visa application";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="USVisaApplication";
		sheetName="Sheet2";
	} 
	
	@Test(dataProvider="fetchData")
	public void onlineVisaApplication (String firstName,String lastName,String fullName,String email,String confirmEmail,String usedOtherEmail,String addEmail,String gender,String year,String month,String day,String birthCity,String birthState,String birthCountry,String nationality,String street,String city,String state,String pincode, String phoneNumber,String usedOtherPhoneNumber,String otherNumber,String territory,String languagesKnown,String belongToTribe,String maritialStatus,String otherPersonTravellingWith,String purpose, String interviewLanguage) {
			
		new VisaHomePage(driver,test)
		.waitTime()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterFullName(fullName)
		.usedOtherNames()
		.enterEmailId(email)
		.confirmEmailId(confirmEmail)
		.scrollPageDown()
		.usedOtherEmailId(usedOtherEmail)
		.enterAdditionalEmailId(addEmail)
		.selectGender(gender)
		.clickOnDOB()
		.selectDOBYear(year)
		.selectDOBMonth(month)
		.clickOnDOBDay(day)
		.enterCityOfBirth(birthCity)
		.enterStateOfBirth(birthState)
		.selectCountryOfBirth(birthCountry)
		.selectNationality(nationality)
		.clickOnNext()
		.enterAddress(street)
		.enterCityName(city)
		.enterStateName(state)
		.enterPincode(pincode)
		.clickOnCountryCode()
		.clickOnCountry()
		.enterPhoneNumber(phoneNumber)
		.usedOtherPhoneNumber(usedOtherPhoneNumber)
		.OtherPhoneNumber(otherNumber)
		.useTab()
		.selectState(territory)
		.useTab()
		.scrollPageDown()
		.clickOnNext1()
		.enterKnownLanguages(languagesKnown)
		.belongToTribe(belongToTribe)
		.selectMaritialStatus(maritialStatus)
		.otherPersonTravellingWith(otherPersonTravellingWith)
		.selectPurposeOfTravel(purpose)
		.selectInterviewLanguage(interviewLanguage)
		.clickCheckBox();
		
		
	}

}
