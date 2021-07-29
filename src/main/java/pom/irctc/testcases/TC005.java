package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To verify irctc eticketing registration";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="irctceticketingregistration";
		sheetName="Sheet5";
	}
	@Test(dataProvider="fetchData")
	public void eTicketingRegisteration (String userName,String password,String confirmPassword,String language,String secQue,String secAns,String firstName,String lastname,String occupation,String month,String year,String day,String maritialStatus,String country,String gender,String email,String mobileNumber,String nationality,String houseNo,String street,String area, String pinCode,String state,String city,String post,String mobileNumber1,String copyResToOffAddress,String offName,String offStreet,String offArea,String offCountry,String offpincode,String offState,String offCity,String offPost,String offNumber) {
			
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.clickOnPreferredLanguage()
		.clickonlanguageoption(language)
		.clickOnSecurityQuestion()
		.clickOnSecurityQuestionOption(secQue)
		.enterSecurityAnswer(secAns)
		.clickOnContinue()
		.enterFirstName(firstName)
		.enterLastName(lastname)
		.clickOnSelectOccupation()
		.clickOnOccupation(occupation)
		.clickOnDOB()
		.selectDOBMonth(month)
		.selectDOBYear(year)		
		.selectDOBDay(day)
		.clickOnMaritialStatus(maritialStatus)
		.selectCountry(country)
		.clickOnGender(gender)
		.enterEmailId(email)
		.enterMobileNumber(mobileNumber)
		.selectNationality(nationality)
		.clickOnContinue()
		.enterHouseNo(houseNo)
		.enterStreet(street)
		.enterArea(area)
		.enterPincode(pinCode)
		.enterState(state)
		.selectCity(city)
		.selectPostOffice(post)
		.enterMobileNumber1(mobileNumber1)
		.clickOnCopyResidenceToOfficeAddress(copyResToOffAddress)
		.enterOfficeName(offName)
		.enterOfficeStreet(offStreet)
		.enterOfficeArea(offArea)
		.clickOnSelectCountry()
		.clickOnCountry(offCountry)
		.enterOfficePincode(offpincode)
		.enterOfficeState(offState)
		.enterOfficeCity(offCity)
		.enterOfficePost(offPost)
		.enterOfficePhoneNumber(offNumber)
		.clickOnCheckBox();
		
	}

}
