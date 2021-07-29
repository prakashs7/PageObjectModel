package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelBookingPersonalDetailsPage extends GenericWrappers {
	
	public HotelBookingPersonalDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public HotelBookingPersonalDetailsPage selectTitle(String title) {
		
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.Tilte.Xpath"), title);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterFirstName(String firstName) {
		
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.FirstName.Xpath"), firstName);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterLastName(String lastName) {
		
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.LastName.Xpath"), lastName);
		return this;
	}
	
	
	public HotelBookingPersonalDetailsPage selectState(String state) {
		
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.State.Xpath"), state);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage selectGST(String gst) {
		
		selectVisibileTextByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GST.Xpath"), gst); //No or Yes
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterGSTNo(String gstNum) {
		
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.GSTNumber.Xpath"), gstNum);
		
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterCompanyName(String companyName) {
		
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.CompanyName.Xpath"), companyName);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage enterCompanyAddress(String companyAddress) {
		
		enterByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.CompanyAddress.Xpath"), companyAddress);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage verifyHotelName(String hotel) {
		
		verifyTextContainsByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.VerifyHotelName.Xpath"), hotel);
		return this;
	}
	
	public HotelBookingPersonalDetailsPage verifyPrice(String price) {
		
		verifyTextContainsByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.VerifyPrice.Xpath"), price);
		return this;
	}
	
	
	
	public TermsandConditionsPage clickOnGo() {
		
		clickByXpath(prop.getProperty("HotelBookingPersonalDetailsPage.Go.Xpath"));
		
		return new TermsandConditionsPage(driver,test);
	}
	
	//public HotelBookingPersonalDetailsPage verifyGSTNumber(String verifyText) {
		
		//verifyTextByXpath("//span[text()='Please Enter Valid GSt number']", verifyText);
		//return this;
	//}
	

	
	
	

}
