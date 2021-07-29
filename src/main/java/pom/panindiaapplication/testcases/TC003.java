package pom.panindiaapplication.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindiaapplication.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To verify pan india application";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="panindiaapplication";
		sheetName="Sheet3";
	}
	@Test(dataProvider="fetchData")
	public void panIndApplication(String title,String firstName,String lastName,String fatherFirstName,String fatherLastName,String mobileNumber,String email,String incomeSource,String addressForCommunication,String dob, String houseNo,String street,String city,String state,String pincode,String offName,String offStreet,String offArea,String offCity,String offState,String offPincode,String idProof,String addProof,String dobProof,String aadhaarProof,String offAddProof) {
			
		new HomePage(driver,test)
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterFatherFirstName(fatherFirstName)
		.enterFatherLastName(fatherLastName)
		.enterMobileNumber(mobileNumber)
		.enterEmailId(email)
		.selectSourceOfIncome(incomeSource)
		.clickOnAddressForCommunication(addressForCommunication)
		.enterDOB(dob)
		.scrollPageDown()
		.enterHouseNo(houseNo)
		.enterStreetName(street)
		.enterCityName(city)
		.selectState(state)
		.enterPincode(pincode)
		.enterOfficeName(offName)
		.enterBuildingName(offStreet)
		.enterOfficeStreet(offArea)
		.enterOfficeCityName(offCity)
		.selectOfficeState(offState)
		.enterOfficePincode(offPincode)
		.selectIdentityProof(idProof)
		.selectAddressProof(addProof)
		.selectDOBProof(dobProof)
		.selectAadhaarProof(aadhaarProof)
		.selectOfficeAddressProof(offAddProof)
		.scrollPageDown()
		.clickOnCheckBox();
	}

}
