package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelsRegistrationPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To verify php travels";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="phptravels";
		sheetName="Sheet4";
	}
	
	@Test(dataProvider="fetchData")
	
	public void phpTravelsRegister(String firstName,String lastName,String emailId,String countryCode,String mobileNumber,String companyName,String street,String area,String city,String state,String pincode,String country,String source,String mobileNumber1,String password,String confirmpassword) {
			
		new PhpTravelsRegistrationPage(driver,test)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(emailId)
		.clickOnCountryCode()
		.clickOnSelectedCountry(countryCode)
		.enterPhoneNumber(mobileNumber)
		.enterCompanyName(companyName)
		.enterCompanyStreet(street)
		.enterCompanyArea(area)
		.enterCompanyCity(city)
		.enterCompanyState(state)
		.enterCompanyPincode(pincode)
		.selectCountry(country)
		.scrollPageDown()
		.selectSourceToFind(source)
		.enterMobileNumber(mobileNumber1)
		.enterPassword(password)
		.enterConfirmPassword(confirmpassword)
		//.clickOnGeneratePassword()
		//.clickOnCopyAndPastePassword()
		.clickOnMailingList();
	}

}
