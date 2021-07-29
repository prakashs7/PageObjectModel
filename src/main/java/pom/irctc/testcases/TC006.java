package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify ftr service";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="ftrservice";
		sheetName="Sheet6";
	}
	
	@Test(dataProvider="fetchData")
	public void ftrService ( String userID,String password,String confirmPassword,String securityQuestion,String answer,String month,String year ,String day,String gender,String maritialStatus,String email,String occupation,String firstName,String lastName,String nationality,String houseNo,String street, String area,String country,String mobile,String pincode,String CommsAddresssameasRes,String offName,String offStreet,String offArea,String offCountry,String offMobile,String offpincode,String offCity,String offState,String offPost) {
			
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.sleep()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnMenu()
		.clickOnBookYourTrainOption()
		.switchWindow()
		.clickOnNewUserSignUp()
		.enterUserName(userID)
		.enterPassword(password)
		.confirmPassword(confirmPassword)
		.selectSecurityQuestion(securityQuestion)
		.enterSecurityAnswer(answer)
		.clickOnDOB()
		.selectDOBMonth(month)
		.selectDOBYear(year)
		.clickOnDOBDay(day)
		.clickOnGender(gender)
		.clickOnMaritialStatus(maritialStatus)
		.enterEmailId(email)
		.selectOccupation(occupation)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectNationality(nationality)
		.enterHouseNo(houseNo)
		.enterStreet(street)
		.enterArea(area)
		.selectCountry(country)
		.enterMobileNumber(mobile)
		.enterPincode(pincode)
		.clickOnCommsAddresssameasRes(CommsAddresssameasRes)
		.enterOffName(offName)
		.enterOffStreet(offStreet)
		.enterOffArea(offArea)
		.selectOffCountry(offCountry)
		.enterOffNumber(offMobile)
		.enterOffPincode(offpincode)
		.scrollPageDown()
		.selectOffCity(offCity)
		.selectOffState(offState)
		.selectOffPost(offPost);
		
	}

}
