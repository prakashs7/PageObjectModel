package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FirstHotelPage extends GenericWrappers {
	
	public FirstHotelPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FirstHotelPage switchWindow() {
		
		switchToLastWindow();
		return this;
	}
	public FirstHotelPage getHotelName() {
		
		getTextByXpath(prop.getProperty("FirstHotelPage.GetHotelName.Xpath"));
		return this;
	}
	
	public FirstHotelPage getPrice() {
		
		getTextByXpath(prop.getProperty("FirstHotelPage.GetHotelPrice.Xpath"));
		return this;
		
	}
	
	public HotelBookingPersonalDetailsPage clickOnContinueToBook() {
		
		clickByXpath(prop.getProperty("FirstHotelPage.ContinueToBook.Xpath"));
		
		return new HotelBookingPersonalDetailsPage(driver,test);
	}

}
