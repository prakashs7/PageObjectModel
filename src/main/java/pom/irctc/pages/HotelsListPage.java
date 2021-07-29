package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class HotelsListPage extends GenericWrappers {
	
	
	public HotelsListPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public FirstHotelPage clickOnBook() {
		
		clickByXpath(prop.getProperty("HotelsListPage.Book.Xpath"));
		
		return new FirstHotelPage(driver,test);
	}
	
	

}
