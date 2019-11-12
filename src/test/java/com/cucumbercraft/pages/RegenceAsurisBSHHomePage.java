package com.cucumbercraft.pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.stepdefinitions.MasterStepDefs;

/**
 * @author r632871
 * 
 *         UI Map for Regence & Asuris Home Page
 *
 */
public class RegenceAsurisBSHHomePage extends MasterStepDefs {

	/**
	 * Initializing the log4j instance for console logging
	 */
	static Logger log = Logger.getLogger(RegenceAsurisBSHHomePage.class);

	private WebDriver driver;
	private WebDriver homePageDriver = null;

	private static final String regenceHomePageWindowTitle = "Regence health insurance - Regence.com";
	private static final String asurisHomePageWindowTitle = "Asuris Northwest Health - Asuris.com";
	private static final String bridgeSpanHealthHomePageWindowTitle = "BridgeSpan Health - Bridgespanhealth.com";

	public RegenceAsurisBSHHomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	Buttons

	@FindBy(how = How.XPATH, using = "//a[@id='sign-in-out-btn']")
	private static WebElement btnSignInBlue;

	@FindBy(how = How.XPATH, using = "//button[@id='_setviewlocationdrawer_WAR_setviewlocation_submit']")
	private static WebElement btnUpdate;

	@FindBy(how = How.CSS, using = "#signin-submit")
	private static WebElement btnSignInOrange;

//	text fields

	@FindBy(how = How.XPATH, using = "//input[@id='_setviewlocationdrawer_WAR_setviewlocation_zipcode']")
	private static WebElement txtChangeYourLocation;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='User name']")
	private static WebElement txtUserName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement txtPasssword;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Shop for a plan')]")
	private static WebElement txtShopForAPlan;

//	link fields

	@FindBy(how = How.XPATH, using = "/html/body/header[@class='theme-header']//div[@class='linkstack']/div[2]/a[@title='Personalization']//span[@class='audience-link']")
	private static WebElement lnkChange;

	@FindBy(how = How.LINK_TEXT, using = "Find a doctor")
	private static WebElement lnkFindADoctor;

//	drop-down fields

	@FindBy(how = How.XPATH, using = "//select[@id='_setviewlocationdrawer_WAR_setviewlocation_audience']")
	private static WebElement dropDownChangeSite;

	/**
	 * Method to click on change hyperlink in Regence or Asuris or BridgeSpan Health
	 * Home page.
	 * 
	 * This method clicks on the change hyperlink in Regence or Asuris or BridgeSpan
	 * Health Home page
	 */
	public void clickOnChangeLink() {

		log.info("Clicking on Change hyperlink...");
		Reporter.addStepLog("Clicking on Change hyperlink...");

		lnkChange.click();

		log.info("Clicked on Change hyperlink Successfully...");
		Reporter.addStepLog("Clicked on Change hyperlink Successfully...");

	}

	/**
	 * Method to change the Site
	 * 
	 * @param changesite The site name to change
	 */
	public void changeSite(String changesite) {

		log.info("Selecting the Site to " + changesite + "...");

		Select changeSiteSelect = new Select(dropDownChangeSite);
		changeSiteSelect.selectByVisibleText(changesite);

		log.info("Selected the Site to " + changesite + " Successfully...");

	}

	/**
	 * Method to change your location
	 * 
	 * @param zipcode The ZipCode to change
	 */
	public void changeYourLocation(String zipcode) {

		log.info("Entering zip code as " + zipcode + "...");

		txtChangeYourLocation.sendKeys(zipcode);

		log.info("Entered the zip code as " + zipcode + " Successfully...");

	}

	/**
	 * Method to click on Update Button
	 * 
	 */
	public void clickOnUpdateButton() {

		log.info("Clicking on Update Button...");

		btnUpdate.click();

		log.info("Clicked on Update Button Successfully...");

	}

	/**
	 * Method to click on SignInBlueButton.
	 * 
	 * This method clicks on the Sign in Blue button in Regence/Asuris Home Page
	 * 
	 * @throws Exception
	 *
	 */
	public void clickOnSignInBlueButton() {

		log.info("Clicking on Sign In link....");
		Reporter.addStepLog("Clicking on Sign In link....");

		btnSignInBlue.click();

		log.info("Clicked on Sign In link Successfully....");
		Reporter.addStepLog("Clicked on Sign In link Successfully....");

	}

	/**
	 * Method to clear existing text on User name field
	 * 
	 */
	public void clearUserName() {

		log.info("Clearing text on User Name text box....");
		Reporter.addStepLog("Clearing text on User Name text box....");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		JavascriptExecutor js = ((JavascriptExecutor) driver);

//		presence in DOM
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='User name']")));

//		Scrolling in to the User Name element
		js.executeScript("arguments[0].scrollIntoView(true);", txtUserName);

		wait.until(ExpectedConditions.visibilityOf(txtUserName));

//		Actions action = new Actions(driver);
//		action.moveToElement(txtUserName).click().perform();

//		PauseScript(2);

		txtUserName.clear();

		log.info("Cleard text on User Name text box....");
		Reporter.addStepLog("Cleard text on User Name text box....");

	}

	/**
	 * Method to enter User name
	 * 
	 * @param username
	 */
	public void enterUserName(String username) {

		log.info("Entering " + username + " in the User Name text box...");
		Reporter.addStepLog("Entering " + username + " in the User Name text box...");

		txtUserName.sendKeys(username);

		log.info("Entered " + username + " in the User Name text box...");
		Reporter.addStepLog("Entered " + username + " in the User Name text box...");
	}

	/**
	 * Method to clear Password
	 * 
	 */
	public void clearPassword() {

		log.info("Clearing text on Password text box....");
		Reporter.addStepLog("Clearing text on Password text box....");

		txtPasssword.clear();

		log.info("Cleard text on Password text box....");
		Reporter.addStepLog("Cleard text on Password text box....");
	}

	/**
	 * Method to enter Password
	 * 
	 * @param username
	 */
	public void enterPassword(String password) {

		log.info("Entering " + password + " in the Password text box...");
		Reporter.addStepLog("Entering " + password + " in the Password text box...");

		txtPasssword.sendKeys(password);

		log.info("Entered " + password + " in the Password text box...");
		Reporter.addStepLog("Entered " + password + " in the Password text box...");
	}

	/**
	 * Method to click on SignInOrgane Button
	 * 
	 */
	public void clickOnSignInOrangeButton() {

		log.info("Clicking on Sign In button....");
		Reporter.addStepLog("Clicking on Sign In button....");

//		PauseScript(2);

//		Element is present but having permanent Overlay.
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", btnSignInOrange);

//		btnSignInOrange.click();

		log.info("Clicked on Sign In button Successfully....");
		Reporter.addStepLog("Clicked on Sign In button Successfully....");

	}

	/**
	 * Method to verify landing on Home page
	 * 
	 * @param sitename The site name to land
	 */
	public void verifyLandingOnHomePage(String sitename) {

		String actualShopForAPlanText = txtShopForAPlan.getText().trim();
		String expectedShopForAPlanText = "Shop for a plan";
		String signInFailedURL = "https://portal-qa1.regence.com/member/sign-in-failed/";

		log.info("Landing on " + sitename + " page...");
		assertEquals(actualShopForAPlanText, expectedShopForAPlanText,
				"Not Landed on " + sitename + "the Home page...");

		if (driver.getCurrentUrl() == signInFailedURL) {

			log.info("Sign-in failed...");
			Reporter.addStepLog("Sign-in failed...");

		} else {

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			log.info("Landed on " + sitename + " page Successfully...");

			log.info("Login to application completed Successfully...");
			Reporter.addStepLog("Login to application completed Successfully...");

		}

	}

	/**
	 * Method to click on Find A Doctor link
	 * 
	 */
	public void clickOnFindADoctor() {

		Actions actions = new Actions(driver);

//		Code to handle StaleElementReferenceException
		PauseScript(2);

		log.info("Clicking Find a doctor hyperlink...");

		try {
			actions.moveToElement(lnkFindADoctor).click().perform();
		} catch (StaleElementReferenceException e) {
			actions.moveToElement(lnkFindADoctor).click().perform();
		}

		log.info("Clicked on Find a doctor hyperlink Successfully...");

	}

	/**
	 * @param driver
	 * @return homePageDriver
	 */
	public WebDriver naviagteToRegenceHomePageWindow(WebDriver driver) {

		log.info("Navigating back to Regence Home Page Window...");
		Reporter.addStepLog("Navigating back to Regence Home Page Window...");

		homePageDriver = DriverFactory.getHandleToWindow(driver, regenceHomePageWindowTitle);

		log.info("Navigated back to Regence Home Page Window Successfully...");
		Reporter.addStepLog("Navigated back to Regence Home Page Window Successfully...");

		return homePageDriver;

	}

	/**
	 * Method to Navigate to Asuris Home Page Window
	 * 
	 * @param driver The webdriver instance
	 * @return homePageDriver
	 */
	public WebDriver naviagteToAsurisHomePageWindow(WebDriver driver) {

		log.info("Navigating back to Asuris Home Page Window...");
		Reporter.addStepLog("Navigating back to Asuris Home Page Window...");

		homePageDriver = DriverFactory.getHandleToWindow(driver, asurisHomePageWindowTitle);

		log.info("Navigated back to Asuris Home Page Window Successfully...");
		Reporter.addStepLog("Navigated back to Asuris Home Page Window Successfully...");

		return homePageDriver;

	}

	/**
	 * Method to Navigate to BridgeSpan Health Home Page Window
	 * 
	 * @param driver The webdriver instance
	 * @return homePageDriver
	 */
	public WebDriver naviagteToBridgeSpanHealthHomePageWindow(WebDriver driver) {

		log.info("Navigating back to BridgeSpan Health Home Page Window...");
		Reporter.addStepLog("Navigating back to BridgeSpan Health Home Page Window...");

		homePageDriver = DriverFactory.getHandleToWindow(driver, bridgeSpanHealthHomePageWindowTitle);

		log.info("Navigated back to BridgeSpan Health Home Page Window Successfully...");
		Reporter.addStepLog("Navigated back to BridgeSpan Health Home Page Window Successfully...");

		return homePageDriver;

	}

	/**
	 * Method to close Regence Home Page Window
	 * 
	 */
	public void closeRegenceHomePageWindow() {

		log.info("Closing the Regence Home Page Window...");
		Reporter.addStepLog("Closing the Regence Home Page Window...");

		homePageDriver = DriverFactory.getHandleToWindow(driver, regenceHomePageWindowTitle);

		log.info("Closed the Regence Home Page Window Successfully...");
		Reporter.addStepLog("Closed the Regence Home Page Window Successfully...");

		homePageDriver.quit();

	}

	/**
	 * Method to close Asuris Home Page Window
	 * 
	 */
	public void closeAsurisHomePageWindow() {

		log.info("Closing the Asuris Home Page Window...");
		Reporter.addStepLog("Closing the Asuris Home Page Window...");

		homePageDriver = DriverFactory.getHandleToWindow(driver, asurisHomePageWindowTitle);

		homePageDriver.close();

		log.info("Closed the Asuris Home Page Window Successfully...");
		Reporter.addStepLog("Closed the Asuris Home Page Window Successfully...");

	}

	/**
	 * Method to close BridgeSpan Health Home Page Window
	 * 
	 */
	public void closeBridgeSpanHealthHomePageWindow() {

		log.info("Closing the BridgeSpan Health Home Page Window...");
		Reporter.addStepLog("Closing the BridgeSpan Health Home Page Window...");

		homePageDriver = DriverFactory.getHandleToWindow(driver, bridgeSpanHealthHomePageWindowTitle);

		homePageDriver.close();

		log.info("Closed the BridgeSpan Health Home Page Window Successfully...");
		Reporter.addStepLog("Closed the BridgeSpan Health Home Page Window Successfully...");

	}

// *********************************************************************

//	Buttons

//	public static final By btnSignInBlue = By.linkText("Sign in");
//	public static final By btnSignInOrange = By.xpath("//button[@id='_signinportlet_WAR_signinportlet_submit']");

//	Buttons

//	public static final By txtUserName = By.xpath("//input[@id='_signinportlet_WAR_signinportlet_signIn']");
//	public static final By txtPasssword = By.xpath("//input[@id='_signinportlet_WAR_signinportlet_password']");

}
