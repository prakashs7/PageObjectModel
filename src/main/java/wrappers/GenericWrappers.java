package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	public  RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObject() {
		
		try {
			prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		}catch (FileNotFoundException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public void unloadObject() {
		
		prop = null;
	}

	public void invokeApp(String browser, String url){
		// TODO Auto-generated method stub
		
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			//System.out.println("The browser "+browser+" is launched with the given URL "+url+" successfully");
			reportStep("The browser "+browser+" is launched with the given URL "+url+" successfully", "pass");
		} catch (SessionNotCreatedException e) {
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
		} 
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+idValue+" is not interactable in the application ");
			reportStep("The element with id "+idValue+" is not interactable in the application ", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+idValue+" is not stable in the application ");
			reportStep("The element with id "+idValue+" is not stable in the application ", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "fail");
		} 
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		
		try {
			String actualtext = driver.getTitle();
			 if (actualtext.equals(title)) {
				//System.out.println("The title of the page "+actualtext+" is matched with the expected title "+title);
				reportStep("The title of the page "+actualtext+" is matched with the expected title "+title, "pass");
			} else {
				//System.err.println("The title of the page "+actualtext+" is not matched with the expected title "+title);
				reportStep("The title of the page "+actualtext+" is not matched with the expected title "+title, "fail");
			}
		} catch (WebDriverException e) {
			//System.err.println("The title of the page cannot be verified dut to unknown error");
			reportStep("The title of the page cannot be verified dut to unknown error", "fail");
		} 
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualtext = driver.findElementById(id).getText();
			if (actualtext.equals(text)) {
			   //System.out.println("The element with id "+id+" is having the text "+actualtext+" matched with expected text "+text);
			   reportStep("The element with id "+id+" is having the text "+actualtext+" matched with expected text "+text, "pass");
			} else {
				//System.err.println("The element with id "+id+" is having the text "+actualtext+" not matched with expected text "+text);
				reportStep("The element with id "+id+" is having the text "+actualtext+" not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+id+" cannot be verified due to unknown error");
			reportStep("The element with id "+id+" cannot be verified due to unknown error", "fail");
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if (actualtext.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is having the text "+actualtext+" matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is having the text "+actualtext+" matched with expected text "+text, "pass");
			} else {
				//.err.println("The element with xpath "+xpath+" is having the text "+actualtext+" not matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is having the text "+actualtext+" not matched with expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			//.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" cannot be verified due to unknown error");
			reportStep("The element with xpath "+xpath+" cannot be verified due to unknown error", "fail");
		}
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualtext = driver.findElementByXPath(xpath).getText();
			if (actualtext.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is having the text  "+actualtext+" that contains the expected text "+text);
				reportStep("The element with xpath "+xpath+" is having the text  "+actualtext+" that contains the expected text "+text, "pass");
			} else {
				//System.err.println("The element with xpath "+xpath+" is having the text  "+actualtext+" that doesnot contains the expected text "+text);
				reportStep("The element with xpath "+xpath+" is having the text  "+actualtext+" that doesnot contains the expected text "+text, "fail");
			}
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpath+" cannot be verified due to unknown error");
			reportStep("The element with xpath "+xpath+" cannot be verified due to unknown error", "fail");
		}
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		 try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked successfully");
			reportStep("The element with id "+id+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+id+" is not clicked as it is not found in the DOM");
			reportStep("The element with id "+id+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+id+" is not clicked as it is not visible in the application");
			reportStep("The element with id "+id+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with id "+id+" is not clicked as the click was intercepted in the application");
			reportStep("The element with id "+id+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+id+" is not clicked as it is not interactable in the application");
			reportStep("The element with id "+id+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+id+" is not clicked as it is not satble in the application");
			reportStep("The element with id "+id+" is not clicked as it is not satble in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+id+" is not clicked due to unknown error");
			reportStep("The element with id "+id+" is not clicked due to unknown error", "fail");
		}
		 
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked as it is not found in the DOM");
			reportStep("The element with classname "+classVal+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked as it is not visible in the application");
			reportStep("The element with classname "+classVal+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked as the click was intercepted in the application");
			reportStep("The element with classname "+classVal+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked as it is not interactable in the application");
			reportStep("The element with classname "+classVal+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked as it is not stable in the application");
			reportStep("The element with classname "+classVal+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with classname "+classVal+" is not clicked due to unknown error");
			reportStep("The element with classname "+classVal+" is not clicked due to unknown error", "fail");
		}
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with name "+name+" is not clicked as it is not found in the DOM");
			reportStep("The element with name "+name+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with name "+name+" is not clicked as it is not visible in the application");
			reportStep("The element with name "+name+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with name "+name+" is not clicked as the click was intercepted in the application");
			reportStep("The element with name "+name+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with name "+name+" is not clicked as it is not interactable in the application");
			reportStep("The element with name "+name+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with name "+name+" is not clicked as it is not stable in the application");
			reportStep("The element with name "+name+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with name "+name+" is not clicked due to unknown error");
			reportStep("The element with name "+name+" is not clicked due to unknown error", "fail");
		}
		
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not found in the DOM");
			reportStep("The element with linktext "+name+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not visible in the application");
			reportStep("The element with linktext "+name+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as the click was intercepted in the application");
			reportStep("The element with linktext "+name+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not interactable in the application");
			reportStep("The element with linktext "+name+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not stable in the application");
			reportStep("The element with linktext "+name+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked successfully");
			reportStep("The element with linktext "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not found in the DOM");
			reportStep("The element with linktext "+name+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not visible in the application");
			reportStep("The element with linktext "+name+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as the click was intercepted in the application");
			reportStep("The element with linktext "+name+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not interactable in the application");
			reportStep("The element with linktext "+name+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with linktext "+name+" is not clicked as it is not stable in the application");
			reportStep("The element with linktext "+name+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error", "fail");
		}
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as the click was intercepted in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
	}

	
		public void clickByXpath(String xpathVal, String expectedValue) {
			String actualXpath=null;
			try {
				if(xpathVal.contains("option")) {
					actualXpath = xpathVal.replace("option", expectedValue);
					driver.findElementByXPath(actualXpath).click();		
				} else {
					
					driver.findElementByXPath(xpathVal).click();
				}
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+actualXpath+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not found in the DOM");
			reportStep("The element with xpath "+actualXpath+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not visible in the application");
			reportStep("The element with xpath "+actualXpath+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as the click was intercepted in the application");
			reportStep("The element with xpath "+actualXpath+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not interactable in the application");
			reportStep("The element with xpath "+actualXpath+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not stable in the application");
			reportStep("The element with xpath "+actualXpath+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+actualXpath+" is not clicked due to unknown error", "fail");
		}
		
	}
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as the click was intercepted in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as the click was intercepted in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked as it is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked as it is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error", "fail");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actualtext =null;
		try {
			 actualtext = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is having the text "+actualtext);
			reportStep("The element with id "+idVal+" is having the text "+actualtext, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with id "+idVal+" is not found in the DOM");
			reportStep("The element with id "+idVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with id "+idVal+" cannot be returned due to unknown error");
			reportStep("The element with id "+idVal+" cannot be returned due to unknown error", "fail");
		}
		
		return actualtext;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualtext = null;
		try {
			actualtext = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is having the text "+actualtext);
			reportStep("The element with xpath "+xpathVal+" is having the text "+actualtext, "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not found in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The element with xpath "+xpathVal+" cannot be returned due to unkonwn error");
			reportStep("The element with xpath "+xpathVal+" cannot be returned due to unkonwn error", "fail");
		} 
		return actualtext;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selecttext = driver.findElementById(id);
			Select st = new Select(selecttext);
			st.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected with the value "+value+" successfully");
			reportStep("The element with id "+id+" is selected with the value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with the id "+id+" is not found in the DOM");
			reportStep("The Element with the id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with the id "+id+" is not interactable in the application");
			reportStep("The Element with the id "+id+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with the id "+id+" is not selectable in the application");
			reportStep("The Element with the id "+id+" is not selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with the id "+id+" is not stable in the application");
			reportStep("The Element with the id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The Element with the id "+id+" cannot be selected due to unknown error");
			reportStep("The Element with the id "+id+" cannot be selected due to unknown error", "fail");
		}
	}

	public void selectVisibileTextByClassName1(String classname, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selecttext = driver.findElementByClassName(classname);
			Select st1 = new Select(selecttext);
			st1.selectByVisibleText(value);
			//System.out.println("The element with classname "+classname+" is selected with the value "+value+" successfully");
			reportStep("The element with classname "+classname+" is selected with the value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with the classname "+classname+" is not found in the DOM");
			reportStep("The Element with the classname "+classname+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with the classname "+classname+" is not visible in the application");
			reportStep("The Element with the classname "+classname+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with the classname "+classname+" is not interactable in the application");
			reportStep("The Element with the classname "+classname+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with the classname "+classname+" is not selectable in the application");
			reportStep("The Element with the classname "+classname+" is not selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with the classname "+classname+" is not stable in the application");
			reportStep("The Element with the classname "+classname+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The Element with the classname "+classname+" cannot be selected due to unknown error");
			reportStep("The Element with the classname "+classname+" cannot be selected due to unknown error", "fail");
		} 
	}
	
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		 try {
			WebElement selectindex = driver.findElementById(id);
			 Select si = new Select(selectindex);
			 si.selectByIndex(value);
			// System.out.println("The element with id "+id+" is selected with the value "+value+" successfully");
			 reportStep("The element with id "+id+" is selected with the value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with the id "+id+" is not found in the DOM");
			reportStep("The Element with the id "+id+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with the id "+id+" is not visible in the application");
			reportStep("The Element with the id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			//System.err.println("The Element with the id "+id+" is not interactable in the application");
			reportStep("The Element with the id "+id+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with the id "+id+" is not selectable in the application");
			reportStep("The Element with the id "+id+" is not selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with the id "+id+" is not stable in the application");
			reportStep("The Element with the id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The Element with the id "+id+" cannot be selected due to unknown error");
			reportStep("The Element with the id "+id+" cannot be selected due to unknown error", "fail");
		}
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> allwindowidaferclick = driver.getWindowHandles();
			for(String eachid : allwindowidaferclick) {
				driver.switchTo().window(eachid);
				break;
			}
			//System.out.println("The tab is switched to parent window successfully");
			reportStep("The tab is switched to parent window successfully", "pass");
		} catch (NoSuchWindowException e) {
			//System.err.println("The parent window tab is not found in the browser");
			reportStep("The parent window tab is not found in the browser", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The tab cannot be switched to parent window due to unknown error");
			reportStep("The tab cannot be switched to parent window due to unknown error", "fail");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> allwindowidaferclick = driver.getWindowHandles();
			for(String eachid : allwindowidaferclick) {
				driver.switchTo().window(eachid);
			}
			//System.out.println("The tab is switched to last window successfully");
			reportStep("The tab is switched to last window successfully", "pass");
		} catch (NoSuchWindowException e) {
			//System.err.println("The last window tab is not found in the browser");
			reportStep("The last window tab is not found in the browser", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The tab cannot be switched to last window due to unknown error");
			reportStep("The tab cannot be switched to last window due to unknown error", "fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		 try {
			driver.switchTo().alert().accept();
			//System.out.println("The alert is accepted successfully");
			reportStep("The alert is accepted successfully", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("The alert is not getting poppedup in the application");
			reportStep("The alert is not getting poppedup in the application", "fail");
		} catch (UnhandledAlertException e) {
			//System.err.println("The alert is not handled in the application");
			reportStep("The alert is not handled in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The alert is not accepted due to unkonwn error");
			reportStep("The alert is not accepted due to unkonwn error", "fail");
		} 
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("The alert is dismissed successfully");
			reportStep("The alert is dismissed successfully", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("The alert is not getting poppedup in the application");
			reportStep("The alert is not getting poppedup in the application", "fail");
		} catch (UnhandledAlertException e) {
			//System.err.println("The alert is not handled in the application");
			reportStep("The alert is not handled in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The alert is not dismissed due to unkonwn error");
			reportStep("The alert is not dismissed due to unkonwn error", "fail");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alerttext = null;
		try {
			alerttext = driver.switchTo().alert().getText();
			//System.out.println("The alert text "+alerttext+" is obtained successfully");
			reportStep("The alert text "+alerttext+" is obtained successfully", "pass");
		} catch (NoAlertPresentException e) {
			//System.err.println("The alert text is not obtained as the alert is not getting poppedup in the application");
			reportStep("The alert text is not obtained as the alert is not getting poppedup in the application", "fail");
		} catch (UnhandledAlertException e) {
			//System.err.println("The alert text is not obtained as the alert is not handled in the application");
			reportStep("The alert text is not obtained as the alert is not handled in the application", "fail");
		} catch (WebDriverException e) {
			//System.err.println("The alert text is not obtained due to unknown error");
			reportStep("The alert text is not obtained due to unknown error", "fail");
		} 
		return alerttext;
	}

	public long takeSnap() {
		
		long number = 0;
		
		try {
			
			number = (long) (Math.floor(Math.random()*100000000)+100000);
			File temp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+number+".png");
			FileUtils.copyFile(temp, dest);
				
			} catch (IOException e) {
				
				
			} catch (WebDriverException e) {
				
			}
		
		return number;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The browser is closed successfully");
			reportStep("The browser is closed successfully", "pass");
		} catch (WebDriverException e) {
			//System.err.println("The browser is not closed due to unknown error");
			reportStep("The browser is not closed due to unknown error", "fail");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("All browsers are closed successfully");
			reportStep("All browsers are closed successfully", "pass", false);
			
		} catch (SessionNotCreatedException e) {
			//System.err.println("All browsers are not closed due to session not created error");
			reportStep("All browsers are not closed due to session not created error", "fail", false);
		
		} catch (WebDriverException e) {
			//System.err.println("All browsers are not closed due to unknown error");
			reportStep("All browsers are not closed due to unknown error", "fail", false);
		} 
	}
	
	public void waitProperty(long time) {
		
		try {
			Thread.sleep(time);
			//System.out.println("Wait time "+time+" is successful");
			reportStep("Wait time "+time+" is successful", "pass");
		} catch (InterruptedException e) {
			//System.err.println("Wait time "+time+" is not successful duu to unknown error");
			reportStep("Wait time "+time+" is not successful duu to unknown error", "fail");
		}
	}

	
	public void pageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			//System.out.println("Page is scrolled down successfully");
			reportStep("Page is scrolled down successfully", "pass");
		} catch (WebDriverException e) {
			//System.err.println("Page is not scrolled down due to unknown error");
			reportStep("Page is not scrolled down due to unknown error", "fail");
		}
		
	}

	public void keyTAB() {
		
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
			//System.out.println("TAB is working successfully");
			reportStep("TAB is working successfully", "pass");
		} catch (WebDriverException e) {
			//System.err.println("TAB key is not working due to unknown error");
			reportStep("TAB key is not working due to unknown error", "fail");
		}
		
	}

	public void selectVisibileTextByXpath(String xpath, String value) {
		try {
			WebElement selexttext = driver.findElementByXPath(xpath);
			Select st2 =new Select(selexttext);
			st2.selectByVisibleText(value);
			//System.out.println("The element with xpath "+xpath+" is selected with the value "+value+" successfully");
			reportStep("The element with xpath "+xpath+" is selected with the value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with the xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not visible in the application");
			reportStep("The Element with the xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not interactable in the application");
			reportStep("The Element with the xpath "+xpath+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not selectable in the application");
			reportStep("The Element with the xpath "+xpath+" is not selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not stable in the application");
			reportStep("The Element with the xpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not selected due to unknown error");
			reportStep("The Element with the xpath "+xpath+" is not selected due to unknown error", "fail");
		}
		
	}

	public void selectVisibileTextByName(String name, String value) {
		try {
			WebElement selecttext = driver.findElementByName(name);
			Select st3 = new Select(selecttext);
			st3.selectByVisibleText(value);
			//System.out.println("The element with name "+name+" is selected with the value "+value+" successfully");
			reportStep("The element with name "+name+" is selected with the value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with the name "+name+" is not found in the DOM");
			reportStep("The Element with the name "+name+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			//System.err.println("The Element with the name "+name+" is not visible in the application");
			reportStep("The Element with the name "+name+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The Element with the name "+name+" is not interactable in the application");
			reportStep("The Element with the name "+name+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with the name "+name+" is not selectable in the application");
			reportStep("The Element with the name "+name+" is not selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with the name "+name+" is not stable in the application");
			reportStep("The Element with the name "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			//System.err.println("The Element with the name "+name+" is not selected due to unknown error");
			reportStep("The Element with the name "+name+" is not selected due to unknown error", "fail");
		}
		
	}

	public void implicitWait() {
		
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			reportStep("Implicit wait is applied", "pass");
		} catch (NoSuchElementException e) {
			reportStep("No Such element found in the DOM", "fail");
		}
		
	}

	public void mouseHoverByXpath(String xpath) {
		
		try {
			Actions builder = new Actions(driver);
			
			WebElement mh = driver.findElementByXPath(xpath);
			builder.moveToElement(mh).perform();
			reportStep("The Element "+xpath+" is Mouse howered successfully", "pass");
		} catch (NoSuchElementException e) {
			reportStep("The Element "+xpath+" is not found in the DOM ", "fail");
		} catch (ElementNotVisibleException e) {
			reportStep("The Element "+xpath+" is not found in the DOM ", "fail");
		} catch (ElementNotInteractableException e) {
			reportStep("The Element "+xpath+" is not found in the DOM ", "fail");
		} catch (StaleElementReferenceException e) {
			reportStep("The Element "+xpath+" is not found in the DOM ", "fail");
		} catch (WebDriverException e) {
			reportStep("The Element "+xpath+" is not found in the DOM ", "fail");
		}
		
	}

	public void selectValueByXpath(String xpath, String value) {
		try {
			WebElement selexttext1 = driver.findElementByXPath(xpath);
			Select st3 =new Select(selexttext1);
			st3.selectByValue(value);
			//System.out.println("The element with xpath "+xpath+" is selected with the value "+value+" successfully");
			reportStep("The Element with xpath "+xpath+" is selected with the value "+value+" successfully", "pass");
		} catch (NoSuchElementException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not found in the DOM");
			reportStep("The Element with the xpath "+xpath+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not visible in the application");
			reportStep("The Element with the xpath "+xpath+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not interactable in the application");
			reportStep("The Element with the xpath "+xpath+" is not interactable in the application", "fail");
		} catch (ElementNotSelectableException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not selectable in the application");
			reportStep("The Element with the xpath "+xpath+" is not selectable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not stable in the application");
			reportStep("The Element with the xpath "+xpath+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			//System.err.println("The Element with the xpath "+xpath+" is not selected due to unknown error");
			reportStep("The Element with the xpath "+xpath+" is not selected due to unknown error", "fail");
		}
		
	}

	/*@Override
	public String replaceXpath(String xpath, String expectedValue) {
		String modifiedXpath = null;
		if(xpath.contains("option")) {
			
			modifiedXpath = xpath.replace("option", expectedValue);
		}
		
		return modifiedXpath;
	}*/
	

	}

