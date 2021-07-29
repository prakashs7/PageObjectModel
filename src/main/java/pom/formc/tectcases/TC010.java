package pom.formc.tectcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FCHomePage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify form c";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="formc";
		sheetName="Sheet10";
	}
	@Test(dataProvider="fetchData")
	public void formC(String userID,String password,String confirmPassword,String securityQuestion,String answer,String userName,String gender,String dob,String designation,String email,String mobile,String landline,String hotelName,String capacity,String address, String state,String district,String accomodation,String rating,String hotelEmail,String hotelconatct1,String hotelContact2,String ownerName,String ownerAddress,String ownerState,String ownerDistrict,String ownerEmail,String ownerContact1,String ownerContact2) {
			
		new FCHomePage(driver,test)
		.clickOnSignUpRegistration()
		.enterUserId(userID)
		.enterPassword(password)
		.enterConfirmPassword(confirmPassword)
		.selectSecurityQuestion(securityQuestion)
		.enterSecurityAnswer(answer)
		.enterUserName(userName)
		.selectGender(gender)
		.enterDOB(dob)
		.enterDesignation(designation)
		.enterEmailId(email)
		.enterMobileNum(mobile)
		.enterPhoneNum(landline)
		.enterHotelName(hotelName)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.useTab()
		.selectCity(district)
		.selectAccomodation(accomodation)
		.selectStarRating(rating)
		.enterHotelEmail(hotelEmail)
		.enterHotelMobileNum(hotelconatct1)
		.enterHotelPhoneNum(hotelContact2)
		.enterOwnerName(ownerName)
		.enterOwnerAddress(ownerAddress)
		.selectOwnerState(ownerState)
		.selectOwnerCity(ownerDistrict)
		.enterOwnerEmailId(ownerEmail)
		.enterOwnerPhone(ownerContact1)
		.enterOwnerMobile(ownerContact2);
	}

}
