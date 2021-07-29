package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To verify hotel booking with gst";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="hotelbookingwithgst";
		sheetName="Sheet9";
	}
	@Test(dataProvider="fetchData")
	public void bookHotelsWithGST(String email, String mobileNo,String city,String checkinDate,String checkoutDate,String rooms,String person,String title,String firstName,String lastName,String state,String gst,String gstNo,String offName,String offAddress) {
			
		new CovidAlertPage(driver,test)
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchWindow()
		.clickOnHotels()
		.switchWindow()
		.clickOnLogin()
		.clickOnGuestLogin()
		.enterEmailId(email)
		.enterMobileNumber(mobileNo)
		.clickOnSignIn()
		.clickOnCityNameTab()
		.enterCityorHotelName(city)
		.useTab()
		.clickOnCity()
		.clickOnCheckInDate()
		.sleep()
		.clickOnSelectedInDate(checkinDate)
		.sleep()
		.clickOnCheckOutDate()
		.sleep()
		.useTab()
		.clickOnSelectedOutDate(checkoutDate)
		.clickOnRooms()
		.selectNoOfRooms(rooms)
		.selectNoofAdults(person)
		.clickOnDone()
		.clickOnFindhotel()
		.clickOnBook()
		.switchWindow()
		.getHotelName()
		.getPrice()
		.clickOnContinueToBook()
		.selectTitle(title)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectState(state)
		.selectGST(gst)
		.enterGSTNo(gstNo)
		.enterCompanyName(offName)
		.enterCompanyAddress(offAddress)
		.clickOnGo();
		
		
	}

}
