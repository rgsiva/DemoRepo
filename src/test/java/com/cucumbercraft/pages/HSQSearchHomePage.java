package com.cucumbercraft.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.framework.WebDriverUtil;
import com.cucumbercraft.stepdefinitions.MasterStepDefs;

/**
 * UI Map for HSQ Search Home Page.
 * 
 * @author r632871 (Sivakumar Ganesan)
 * @version 1.0
 * @since 7/18/2019
 * @see some.other.class.Documentation
 * 
 * 
 */
public class HSQSearchHomePage extends MasterStepDefs {

	static Logger log = Logger.getLogger(HSQSearchHomePage.class);

	private WebDriver driver;
	WebDriverUtil webDriverUtil;
	WebDriver hsqWindowDriver;

	public HSQSearchHomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	links

	@FindBy(how = How.CSS, using = "[class='sidebar-content my-6'] [type]")
	private static WebElement lnkBrowseAListOfNetworks;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/u[1]")
	private static WebElement lnkDefaultAddress;

	@FindBy(how = How.CSS, using = "[data-test='location-trigger-text']")
	private static WebElement lnkLocationAddress;

	@FindBy(how = How.XPATH, using = "//h4[text()='All Networks']")
	private static WebElement lnkAllNetworks;

	@FindBy(how = How.CSS, using = "[class='dropdown-content p-3 shadow bg-white text-dark right'] [type]")
	private static WebElement lnkOkIUnderstand;

	@FindBy(how = How.CSS, using = "[class='all-advanced-container position-relative d-flex p-0 has-multiple-of-four-tiles'] [type]")
	private static WebElement lnkAllCategories;

//	text fields

	@FindBy(how = How.XPATH, using = "//label[text()='Available networks']")
	private static WebElement txtAvailableNetworks;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[7]/div/div/div[1]/div[1]/div/div[1]/h3/span")
	private static WebElement txtFindYourNetworkByName;
	
	@FindBy(how = How.CSS, using = "#input-location")
	private static WebElement txtSearchLocation;

	@FindBy(how = How.CSS, using = "#input-what")
	private static WebElement txtSearchAll;

	@FindBy(how = How.CSS, using = "[class='lead font-weight-light mb-1']")
	private static WebElement txtSearchCriteriaElement;

	@FindBy(how = How.XPATH, using = "//input[@id='input-what']")
	private static WebElement txtInputWhat;

//	Buttons

	@FindBy(how = How.XPATH, using = "//button[@id='button-welcome']")
	private static WebElement btnChooseANetwork;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]")
	private static WebElement btnConfirmSelection;

	@FindBy(how = How.CSS, using = "[class='sidebar-content my-6'] [type='button']:nth-child(3)")
	private static WebElement btnConfirmSelection1;

	@FindBy(how = How.XPATH, using = "//button[@id='CONFIRM_LOCATION_TRIGGER']")
	private static WebElement btnYesThisIsCorrect;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[8]/div[1]/button[1]")
	private static WebElement btnSearchAll;

//	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign out')]")
//	private static WebElement btnSignOut;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Doctors by name')]")
	private static WebElement btnDoctorsByName;

	/**
	 * Method to navigate to HSQ Window
	 * 
	 * @param driver
	 * @return
	 */
	public WebDriver naviagteToHsqWindow(WebDriver driver) {

		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search homepage");

		return hsqWindowDriver;

	}

	/**
	 * Method to locate Doctors By Name element
	 * 
	 * @param driver
	 */
	public void locateDoctorsByNameElement(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(HSQSearchHomePage.btnDoctorsByName));

		log.info("Doctors by name element is located...");

		String DoctorsByNameElementText = HSQSearchHomePage.btnDoctorsByName.getText().trim();

		log.info("DoctorsByNameElementText Captured is : " + DoctorsByNameElementText);
		assertTrue(DoctorsByNameElementText.contains("Doctors by name"), "Failed to Land on HSQ Home page...");

		log.info("Landed on HSQ Home page Successfully...");
		Reporter.addStepLog("Landed on HSQ Home page Successfully...");

	}

	/**
	 * Method to validate HSQ Home Page Title
	 * 
	 * @param driver
	 * @param hsqhomepagetitle
	 */
	public void validateHsqHomePageTitle(WebDriver driver, String hsqhomepagetitle) {

		String actualWindowTitle = driver.getTitle();
		PauseScript(3);

//		Pardon our interruption page may come here. Write a code to handle here
		if (actualWindowTitle == "Pardon Our Interruption") {

			log.info("landed on Pardon Our Interruption page due to ...");

		} else {

			assertEquals(actualWindowTitle, hsqhomepagetitle,
					"HSQ Search homepage mismatch... Not Landed on HSQ Search homepage. Please report the issue...");

			log.info("Landed on HSQ Search homepage Successfully and validated the title as " + hsqhomepagetitle
					+ "...");

		}

	}

	/**
	 * Method to verify default address
	 * 
	 * @param driver
	 * @param defaultaddress
	 */
	public void verifyDefaultAddress(WebDriver driver, String defaultaddress) {

		String actualDefaultAddress = HSQSearchHomePage.lnkDefaultAddress.getText().trim();
		assertEquals(actualDefaultAddress, defaultaddress, "Expected and actual address mismatch");

		log.info(defaultaddress + " validated Successfully...");
		Reporter.addStepLog(defaultaddress + " validated Successfully...");

	}

	/**
	 * Method to click on Location Address
	 * 
	 * @param driver
	 */
	public void clickOnLocationAddress(WebDriver driver) {

		Actions actions = new Actions(driver);
		actions.moveToElement(HSQSearchHomePage.lnkLocationAddress).click().perform();

		log.info("Clicked on Location Address Successfully...");
		Reporter.addStepLog("Clicked on Location Address Successfully...");

	}

	/**
	 * Method to clear Search Location
	 * 
	 * @param driver
	 */
	public void clearSearchLocation(WebDriver driver) {

		txtSearchLocation.clear();

		log.info("Cleared Search Location Successfully...");
		Reporter.addStepLog("Clicked on Location Address Successfully...");

	}

	/**
	 * Method to enter valid Address
	 * 
	 * @param driver
	 * @param validaddress
	 */
	public void enterValidAddress(WebDriver driver, String validaddress) {

		txtSearchLocation.sendKeys(validaddress);
		txtSearchLocation.sendKeys(Keys.TAB);

		log.info(validaddress + " Updated Successfully...");
		Reporter.addStepLog(validaddress + " Updated Successfully...");

	}

	/**
	 * Method to click on Yes This is correct Button
	 * 
	 */
	public void clickOnYesThisIsCorrectButton() {

		btnYesThisIsCorrect.click();

		log.info("Clicked on Yes, this is correct button Successfully...");
		Reporter.addStepLog("Clicked on Yes, this is correct button Successfully...");

	}

	/**
	 * Method to click on Search All Button
	 * 
	 * @param searchby
	 */
	public void clickOnSearchAll(String searchby) {

		btnSearchAll.click();

		log.info("Clicked on Search All Option Successfully...");
		Reporter.addStepLog("Clicked on Search All Option Successfully...");

	}

	/**
	 * Method to enter Telehealth Provider name
	 * 
	 * @param telehealthprovidername
	 */
	public void enterTeleHealthProviderName(String telehealthprovidername) {

		txtSearchAll.sendKeys(telehealthprovidername);
		txtSearchAll.sendKeys(Keys.RETURN);

		log.info(telehealthprovidername + " entered Successfully...");
		Reporter.addStepLog(telehealthprovidername + " entered Successfully...");

	}

	public void clickOnChooseANetworkButton() {

//		element click intercepted: Element is not clickable at point (1491, 470)

		log.info("Pausing for 3 Seconds...");
		PauseScript(3);

		log.info("Clicking on Choose a network button...");
		btnChooseANetwork.click();

		log.info("Clicked on Choose a network button Successfully...");

	}

	public void navigateToFindYourNetworkByNameSection() {

		log.info("Pausing for 2 Seconds...");
		PauseScript(2);

		log.info("Landing on Find your network by name section...");

		assertEquals(txtFindYourNetworkByName.getText().trim(), "Find your network by name",
				"Find your network by name not found...");

		log.info("Landed on Find your network by name section Successfully...");

	}

	public void clickOnBrowseAListOfNetworksLink() {

		log.info("Pausing for 2 Seconds...");
		PauseScript(2);

		Actions actions = new Actions(driver);
//		WebElement browseAListOfNetworksElement = hsqWindowDriver.findElement(browseAListOfNetworks);

		log.info("Scrolling down until to find the \"Browse a list of networks\" link...");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lnkBrowseAListOfNetworks);
		log.info("Scrolled down and found the \"Browse a list of networks\" link Successfully...");

		log.info("Clicking on Browse a list of networks link...");
		actions.moveToElement(lnkBrowseAListOfNetworks).click().perform();
		log.info("Clicked on Browse a list of networks link Successfully...");

	}

	public void navigateToBrowseAllNetworksSection() {

		log.info("Pausing for 1 Seconds...");
		PauseScript(1);

		log.info("Navigating to Browse all networks section...");

		log.info("Locating the text \"Available Networks\"...");
		assertEquals(txtAvailableNetworks.getText().trim(), "Available networks",
				"Available networks is NOT present...");

		log.info("Located the text \"Available Networks\" Successfully...");

		log.info("Navigated to Browse all networks section Successfully...");

	}

	public void scrollDownTillFindingAllNetworksLink() {

//		Element click intercepted
		log.info("Pausing for 2 Seconds...");
		PauseScript(2);

		log.info("Scrolling down till locating \"All Networks\" Option...");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lnkAllNetworks);

		log.info("Scrolled down and located \"All Networks\" Option Successfully...");

		log.info("Pausing for 1 Second...");
		PauseScript(1);

	}

	public void FindingAllNetworksLink(String networkname) {

		if (networkname.equalsIgnoreCase("All Networks")) {

			log.info("Finding All Networks Option...");
			assertEquals(lnkAllNetworks.getText().trim(), "All Networks", "All Networks option is NOT present...");

			log.info("Found All Networks Option Successfully...");

		}

	}

	public void clickOnNetworkName(String networkname) {

		if (networkname.equalsIgnoreCase("All Networks")) {

			log.info("Clicking on " + networkname + " option...");

			log.info("Pausing for 2 Seconds...");
			PauseScript(2);

			lnkAllNetworks.click();
			log.info("Clicked on " + networkname + " option Successfully...");

		}

	}

	public void locateConfirmSelectionButton() {

		log.info("Pausing for 2 Seconds...");
		PauseScript(2);

		log.info("Locating the presense of Confirm selection button...");

		assertEquals(btnConfirmSelection.getText().trim(), "Confirm selection",
				"Confirm selection button is NOT present...");

		log.info("Located the presense of Confirm selection button Successfully...");

	}

	public void hitConfirmSelectionButton() {

		log.info("Clicking on Confirm selection button...");
		btnConfirmSelection.click();

		log.info("Clicked on Confirm Selection button Successfully...");

	}

	public void locateOkIUnderstandLink() {

		log.info("Locating Ok, I understand option...");
		assertEquals(lnkOkIUnderstand.getText().trim(), "Ok, I understand",
				"Not able to locate \"Ok, I understand\" link");

		log.info("Located Ok, I understand option Sucessfully...");

	}

	public void clickOnOkIUnderstandLink() {

		log.info("Clicking on \"Ok, I understand\" link...");
		lnkOkIUnderstand.click();

		log.info("Clicked on \"Ok, I understand\" link Successfully...");

	}

	public void clickOnAllCategories() {

		log.info("Clicking on All categoris Option...");
		lnkAllCategories.click();

		log.info("Clicked on All categoris option Successfully...");

	}

	public void locateSearchForDoctors_HospitalsAndClinicByName_Condition_Or_Specialty() {

		String searchCriteriaExpectedText = "Search for doctors, hospitals and clinics by name, condition or specialty.";
		
		log.info("Locating the text \"Search for doctors, hospitals and clinic by name, condition or specialty\"...");
		assertEquals(txtSearchCriteriaElement.getText().trim(), searchCriteriaExpectedText,
				"\"Search for doctors, hospitals and clinics by name, condition or specialty\" is NOT present...");

		log.info(
				"Located the text \"Search for doctors, hospitals and clinic by name, condition or specialty\" text Successfully...");

	}

	public void enterSearchText(String searchtext) {
		
		log.info("Entering the Search text...");
		txtInputWhat.sendKeys(searchtext);

		log.info("Entered the Search text Successfully...");

		log.info("Pressing ENTER key from the keyboard...");
		txtInputWhat.sendKeys(Keys.ENTER);
		log.info("Pressed ENTER key from the keyboard Successfully...");

	}
	
	public void navigatebackToHomepage(String brand) {
		
		
	}
	
	
	
	

//	************************************************************************************************************************************

//	links
//	public static final By lnkDefaultAddress = By
//			.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/u[1]");
//	public static final By lnkLocationAddress = By.cssSelector("[data-test='location-trigger-text']");

//	text fields
//	public static final By txtSearchLocation = By.cssSelector("#input-location");
//	public static final By txtSearchAll = By.cssSelector("#input-what");

//	Buttons
//	public static final By btnYesThisIsCorrect = By.xpath("//button[@id='CONFIRM_LOCATION_TRIGGER']");
//	public static final By btnSearchAll = By
//			.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[8]/div[1]/button[1]");
//	public static final By btnSignOut = By.xpath("//span[contains(text(),'Sign out')]");
//	public static final By btnDoctorsByName1 = By
//			.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/span[1]");
//	public static final By btnDoctorsByName = By.xpath("//h2[contains(text(),'Doctors by name')]");
}
