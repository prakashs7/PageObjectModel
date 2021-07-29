package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify saloon charter";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="salooncharter";
		sheetName="Sheet7";
	}
	
	@Test(dataProvider="fetchData")
	public void saloonCharter(String name,String org,String address,String mobileNo,String email,String enquiry,String orgStation,String destStation,String departureDate,String arrivalDate,String duration,String coach,String passengers,String purpose,String addservices,String verifyText) {
			
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnMenu()
		.clickOnCharter()
		.switchWindow()
		.clickOnEnquiryForm()
		.enterApplicantName(name)
		.enterOrgName(org)
		.enterOrgAddress(address)
		.enterMobileNumber(mobileNo)
		.enterEmailId(email)
		.selectRequest(enquiry)
		.enterOriginatingStation(orgStation)
		.enterDestinationStation(destStation)
		.clickOnDepartureCalender()
		.clickOnDepartureDate(departureDate)
		.clickOnArrivalCalender()
		.clickOnArrivalDate(arrivalDate)
		.enterTourDuration(duration)
		.enterTypeAndNoOfCoachesRequired(coach)
		.enterNoOfPassengers(passengers)
		.enterCharterPurpose(purpose)
		.enterAddServicesRequired(addservices)
		.clickOnSubmit()
		.verifytext(verifyText);
	}

}
