package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {

	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="To verify facebook sign up";
		author="Prakash";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
		sheetName="Sheet1";
	}
	
	
	@Test(dataProvider="fetchData")
	public void facebookSignup(String firstName, String lastName, String email, String confirmEmail, String password, String date, String month, String year, String gender) {
	new LoginPage(driver,test)
		.selectLanguage()
		.clickOnCreateNewAccount()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmailId(email)
		.confirmEmailid(confirmEmail)
		.enterPassword(password)
		.dobDay(date)
		.dobMonth(month)
		.dobYear(year)
		.clickGender(gender);
		
	}

}