package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class GuestHotelsHomepage extends GenericWrappers{
	
	public GuestHotelsHomepage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}
	
	public GuestHotelsHomepage clickOnCityNameTab() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.CityNameTab.Xpath"));
		return this;
	}

	public GuestHotelsHomepage enterCityorHotelName(String cityName) {
		
		enterByXpath(prop.getProperty("GuestHotelsHomepage.CityorHotelName.Xpath"), cityName);
		return this;
	}
	
	public GuestHotelsHomepage clickOnCity() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.City.Xpath"));
		return this;
	}
	
	public GuestHotelsHomepage clickOnCheckInDate() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.CheckInDate.Xpath"));
		return this;
	}
	
	public GuestHotelsHomepage clickOnSelectedInDate(String option) {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.CheckInSelectedDate.Xpath"),option);
		return this;
	}
	
	public GuestHotelsHomepage clickOnCheckOutDate() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.CheckOutDate.Xpath"));
		return this;
	}
	
	public GuestHotelsHomepage clickOnSelectedOutDate(String option) {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.CheckOutSelectedDate.Xpath"),option);
		return this;
	}
	
	public GuestHotelsHomepage clickOnRooms() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.Rooms.Xpath"));
		return this;
	}
	
	public GuestHotelsHomepage selectNoOfRooms(String rooms) {
		
		selectVisibileTextByXpath(prop.getProperty("GuestHotelsHomepage.NoofRooms.Xpath"), rooms);
		return this;
	}
	
	public GuestHotelsHomepage selectNoofAdults(String adults) {
		
		selectVisibileTextByXpath(prop.getProperty("GuestHotelsHomepage.NoofAdults.Xpath"), adults);
		return this;
	}
	
	public GuestHotelsHomepage clickOnDone() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.Done.Xpath"));
		return this;
	}
	
	public HotelsListPage clickOnFindhotel() {
		
		clickByXpath(prop.getProperty("GuestHotelsHomepage.FindHotel.Xpath"));
		return new HotelsListPage(driver,test);
	}

	public GuestHotelsHomepage useTab() {
		
		keyTAB();
		
		return this;
	}
	
	public GuestHotelsHomepage sleep() {
		
		waitProperty(2000);
		return this;
	}
}
