package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class LoungePage extends GenericWrappers {
	
	public LoungePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public LoungePage switchWindow() {
		
		switchToLastWindow();
		return this;
	}
	
	public MenuOptions clickOnMenu() {
		
		clickByXpath(prop.getProperty("LoungePage.Menu.Xpath"));
		return new MenuOptions(driver,test);
	}
	
	public HotelsHomePage clickOnHotels() {
		
		clickByXpath(prop.getProperty("LoungePage.Hotels.Xpath"));
		
		return new HotelsHomePage(driver,test);
	
	

}
	
}
