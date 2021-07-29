package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class GeneratePasswordPage extends GenericWrappers{
	
	
	
	
public PhpTravelsRegistrationPage clickOnCopyAndPastePassword() {
		
		clickByXpath(prop.getProperty("GeneratePasswordPage.CopyAndPastePassword.Xpath"));
		return new PhpTravelsRegistrationPage(driver,test);
	}

}
