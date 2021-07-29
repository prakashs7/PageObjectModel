package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class IrctcHomePage extends GenericWrappers{
	
	
	public IrctcHomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
	}

	public IrctcRegistrationPage clickOnRegister() {
		
		clickByXpath(prop.getProperty("IrctcHomePage.Register.Xpath"));
		
		return new IrctcRegistrationPage(driver,test);
		
	}
	
	public IrctcHomePage mouseHoverOnHolidays() {
		
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.Holidays.Xpath"));
		return this;
	}
	
	public IrctcHomePage mouseHoverOnStays() {
		
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.Stays.Xpath"));
		return this;
	}
	
	public LoungePage clickOnLounge() {
		
		clickByXpath(prop.getProperty("IrctcHomePage.Lounge.Xpath"));
		
		return new LoungePage(driver,test);
	}
	
	public IrctcHomePage sleep() {
		
		waitProperty(2000);
		return this;
	}

}
