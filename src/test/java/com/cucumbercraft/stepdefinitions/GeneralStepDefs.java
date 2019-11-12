package com.cucumbercraft.stepdefinitions;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.cucumber.listener.Reporter;
import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.DriverManager;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.framework.WebDriverUtil;
import com.cucumbercraft.pages.BSHHomePage;
import com.cucumbercraft.pages.HSQSearchHomePage;
import com.cucumbercraft.pages.HSQSearchResultPage;
import com.cucumbercraft.pages.RegenceAsurisBSHHomePage;
import com.cucumbercraft.pages.RegenceAsurisBSHMemberDashboardPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * The {@code GeneralStepDefs} class represents General Step Definitions methods
 * that can be applied to most of the feature files.
 * 
 * It extends MasterStepDefs class that has several Functions that are
 * Applicable only when the ExecutionMode used is <b> PERFECTO </b>
 * 
 * @author r632871 (Sivakumar Ganesan)
 * @version 1.0
 * @since 7/9/19
 * @see
 * 
 *
 */

public class GeneralStepDefs extends MasterStepDefs {

	/**
	 * Initializing log4j instance for console logging
	 */
	static Logger log = Logger.getLogger(GeneralStepDefs.class);

	/**
	 * Initializing driver instance from the getWebDriver() method from
	 * DriverManager class
	 */
	WebDriver driver = DriverManager.getWebDriver();

	/**
	 * Initializing hsqWindowDriver instance to null. Later inside the method it
	 * will be initialized according to the current HSQ window Object
	 */
	WebDriver hsqWindowDriver = null;

	/**
	 * Initializing regenceWindowDriver instance to null. Later inside the method it
	 * will be initialized according to current Regence window Object
	 */
	WebDriver regenceWindowDriver = null;

	/**
	 * Initializing the webDriverUtil instance to null. It will be used to access
	 * various user defined methods like the below
	 * 
	 * <ul>
	 * <li>waitFor</li>
	 * <li>waitUntilElementVisible</li>
	 * <li>waitUntilElementEnabled</li>
	 * <li>waitUntilElementDisabled</li>
	 * <li>selectListItem</li>
	 * <li>objectExists</li>
	 * <li>isTextPresent</li>
	 * <li>isAlertPresent</li>
	 * <li>getHandleToWindow</li>
	 * <li>etc.,</li>
	 * </ul>
	 * 
	 */
	WebDriverUtil webDriverUtil = null;

	/**
	 * Initializing the WebDriverWait instance to null to use in the methods when
	 * needed
	 */
	WebDriverWait Wait = null;

	/**
	 * Method that handles both the Regence and Asuris Login functionalities based
	 * on the below parameters passed in feature files
	 * 
	 * <ul>
	 * <li>Brand -----------(Regence, Ausris, BSH</li>
	 * <li>User Experience--(public, authenticated)</li>
	 * <li>Test Environment-(QA1, QA2, QA3, DEV1, DEV2, DEV3, PROD)</li>
	 * <ul>
	 * 
	 * @param brand          possible values: Regence, Asuris, BSH
	 * @param userexperience possible values: authenticated, public
	 * @param environment    possible values: QA1, QA2, QA3, DEV1, DEV2, DEV3, PROD
	 * @throws Throwable
	 */

	@Given("^I am in the \"([^\"]*)\" brand login page of \"([^\"]*)\" user experience in \"([^\"]*)\" environment$")
	public void i_am_in_the_something_brand_login_page_of_something_user_experience_in_something_environment(
			String brand, String userexperience, String environment) throws Throwable {

		if (brand.equalsIgnoreCase("Regence") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA1")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("RegenceQA1ApplicationURL"));
			currentScenario.embed(Util.takeScreenshot(driver), "image/png");

			assertTrue(driver.getTitle().contains("Regence health insurance - Regence.com")
					|| driver.getTitle().contains("Regence health insurance"),"Regence Home page title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("Regence") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA2")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("RegenceQA2ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("Regence health insurance - Regence.com")
					|| driver.getTitle().contains("Regence health insurance"),"Regence Home page title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("Regence") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA3")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("RegenceQA3ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("Regence health insurance - Regence.com")
					|| driver.getTitle().contains("Regence health insurance"),"Regence Home page title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("Asuris") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA1")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("AsurisQA1ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("Asuris Northwest Health"),"Asuris Home page title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("Asuris") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA2")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("AsurisQA2ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("Asuris Northwest Health"),"Asuris Home page title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("Asuris") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA3")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("AsurisQA3ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("Asuris Northwest Health"));

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("BSH") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA1")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("BSHQA1ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("BridgeSpan Health"), "BSH Title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("BSH") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA2")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("BSHQA2ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("BridgeSpan Health"), "BSH Title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");

		} else if (brand.equalsIgnoreCase("BSH") && userexperience.equalsIgnoreCase("authenticated")
				&& environment.equalsIgnoreCase("QA3")) {

			log.info("Launching " + brand + " " + userexperience + " " + environment + " URL");
			Reporter.addStepLog("Launching " + brand + " " + userexperience + " " + environment + " URL");

			driver.get(properties.getProperty("BSHQA3ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains("BridgeSpan Health"), "BSH Title mismatch issue...");

			log.info("Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
			Reporter.addStepLog(
					"Launched " + brand + " " + userexperience + " " + environment + " URL Successfully...");
		}

	}

	/**
	 * @param zipcode  method is deprecated... Only applicable for BSH QA1
	 *                 Application when the ZipCode modal pop-up window appears in
	 *                 the beginning
	 * @param username username of the application
	 * @param password password of the application
	 * @throws Throwable
	 */
	@When("^I give the zip code as \"([^\"]*)\" and login with valid username as \"([^\"]*)\" and valid Password as \"([^\"]*)\"$")
	public void i_give_the_zip_code_as_something_and_login_with_valid_username_as_something_and_valid_password_as_something(
			String zipcode, String username, String password) throws Throwable {

		By ZipCode = By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/input[1]");

		driver.findElement(ZipCode).clear();
		System.out.println("cleard Zip code data");

		driver.findElement(ZipCode).sendKeys(zipcode);
		System.out.println("Entered zipcode");

		driver.findElement(ZipCode).sendKeys(Keys.TAB);
		System.out.println("Pressed Tab Key");

//		webDriverUtil.waitFor(8000);
		System.out.println("Wait of 8000 ms completed");

		webDriverUtil = new WebDriverUtil(driver);
		By OKBtn = By.xpath("//button[@class='btn zipcode-modal-ok-btn']");
		WebElement ok = driver.findElement(OKBtn);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", ok);

		System.out.println("Clicked on Ok button");
		webDriverUtil.waitFor(5000);
		bshlogin(username, password);

	}

	/**
	 * @param username username of the BSH application
	 * @param password password of the BSH application
	 * @throws Throwable
	 */
	@When("^I login with valid username as \"([^\"]*)\" and valid Password as \"([^\"]*)\" for BSH$")
	public void i_login_with_valid_username_as_something_and_valid_password_as_something_for_bsh(String username,
			String password) throws Throwable {

		bshlogin(username, password);

	}

	/**
	 * Method that handles specifically the BSH Login functionality
	 * 
	 * @param username username of the BSH application
	 * @param password password password of the BSH application
	 * @throws InterruptedException
	 */
	public void bshlogin(String username, String password) throws InterruptedException {

		BSHHomePage bSHHomePage = new BSHHomePage(driver);

		log.info("Starting login to BSH Application...");
		Reporter.addStepLog("Starting login to BSH Application...");

		bSHHomePage.clickOnSignInBSH();
		bSHHomePage.clearBshUserName();
		bSHHomePage.enterBshUserName(username);
		bSHHomePage.clearBshPassword();
		bSHHomePage.enterBshPassword(password);
		bSHHomePage.clickOnSignInBshButton();

		PauseScript(3);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	/**
	 * Method that handles both Regence and Asuris login functionalities
	 * 
	 * @param username
	 * @param password
	 * @throws Throwable
	 */
	@When("^I login with valid username as \"([^\"]*)\" and valid Password as \"([^\"]*)\"$")
	public void i_login_with_valid_username_as_something_and_valid_password_as_something(String username,
			String password) throws Throwable {

		log.info("Calling Regence/Asuris login method...");
		Reporter.addStepLog("Calling Regence/Asuris login method...");

		login(username, password);

	}

	/**
	 * Method that handles both Regence and Asuris login functionalities
	 * 
	 * @param username
	 * @param password
	 */
	private void login(String username, String password) {

		RegenceAsurisBSHHomePage regenceAsurisBSHHomePage = new RegenceAsurisBSHHomePage(driver);

		log.info("Starting login to Application...");
		Reporter.addStepLog("Starting login to Application...");
		
		regenceAsurisBSHHomePage.clickOnSignInBlueButton();

		regenceAsurisBSHHomePage.clearUserName();

		regenceAsurisBSHHomePage.enterUserName(username);

		regenceAsurisBSHHomePage.clearPassword();
		regenceAsurisBSHHomePage.enterPassword(password);

		regenceAsurisBSHHomePage.clickOnSignInOrangeButton();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	/**
	 * Method that handles Clicking Find a Doctor link and selecting the user given
	 * "Provider Search Option"
	 * 
	 * @param providersearchoption
	 * @throws Throwable
	 */
	@And("^I click on Find a Doctor link and select \"([^\"]*)\" Icon$")
	public void i_click_on_find_a_doctor_link_and_select_something_icon(String providersearchoption) throws Throwable {

		RegenceAsurisBSHMemberDashboardPage regenceAsurisBSHMemberDashboardPage = new RegenceAsurisBSHMemberDashboardPage(
				driver);

		regenceAsurisBSHMemberDashboardPage.clickOnFindADoctorLink();

		PauseScript(3);

		if (providersearchoption.equalsIgnoreCase("medicalProvider")) {

			regenceAsurisBSHMemberDashboardPage.clickOnMedicalProviderLink();

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");

		}
	}

	/**
	 * Method that verifies the user landing on the HSQ Home page
	 * 
	 * @throws Throwable
	 */
	@Then("^I should be landed on the HSQ Home page$")
	public void i_should_be_landed_on_the_HSQ_Home_page() throws Throwable {

//		String expectedHSQWindowURL = "https://cmbtestweb.healthsparq.com/healthsparq/";

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);

		hsqWindowDriver = hsqSearchHomePage.naviagteToHsqWindow(driver);
		
		PauseScript(3);
		
		Reporter.addStepLog("Actual URL displayed is : " + hsqWindowDriver.getCurrentUrl());
		log.info("Actual URL displayed is : " + hsqWindowDriver.getCurrentUrl());

		/*
		 * assertTrue(hsqWindowDriver.getCurrentUrl().contains(expectedHSQWindowURL),
		 * "Navigation to HSQ window failure...");
		 */
		
		hsqSearchHomePage.locateDoctorsByNameElement(hsqWindowDriver);

		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");

	}

	/**
	 * Method that verifies the title of the HSQ Home page
	 * 
	 * @param hsqhomepagetitle
	 * @throws Throwable
	 */
	@And("^verify the title of the HSQ Home page as \"([^\"]*)\"$")
	public void verify_the_title_of_the_hsq_home_page_as_something(String hsqhomepagetitle) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);

		hsqWindowDriver = hsqSearchHomePage.naviagteToHsqWindow(driver);
		hsqSearchHomePage.validateHsqHomePageTitle(hsqWindowDriver, hsqhomepagetitle);

		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
	}

	/**
	 * Method that verifies the whether the location is defaulted to the member's
	 * default address
	 * 
	 * @param defaultaddress
	 * @throws Throwable
	 */
	@Then("^I Verify the location is defaulted to \"([^\"]*)\"$")
	public void i_verify_the_location_is_defaulted_to_something(String defaultaddress) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);

		hsqWindowDriver = hsqSearchHomePage.naviagteToHsqWindow(driver);
		hsqSearchHomePage.verifyDefaultAddress(hsqWindowDriver, defaultaddress);

		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");

	}

	/**
	 * Method that updates the search address in choose your location link
	 * 
	 * @param validaddress
	 * @throws Throwable
	 */
	@And("^I Update the address in choose your search location as \"([^\"]*)\" if it is found as invalid$")
	public void i_update_the_address_in_choose_your_search_location_as_something_if_it_is_found_as_invalid(
			String validaddress) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);

		hsqWindowDriver = hsqSearchHomePage.naviagteToHsqWindow(driver);
		hsqSearchHomePage.clickOnLocationAddress(hsqWindowDriver);
		PauseScript(3);
		hsqSearchHomePage.clearSearchLocation(hsqWindowDriver);
		hsqSearchHomePage.enterValidAddress(hsqWindowDriver, validaddress);
		PauseScript(3);
		hsqSearchHomePage.clickOnYesThisIsCorrectButton();

		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
	}

	/**
	 * Method that handles the user given searchby option
	 * 
	 * @param searchby
	 * @throws Throwable
	 */
	@And("^I click on \"([^\"]*)\" option$")
	public void i_click_on_something_option(String searchby) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);

		hsqWindowDriver = hsqSearchHomePage.naviagteToHsqWindow(driver);

		if (searchby.equalsIgnoreCase("search_All")) {

//			Getting ElementClickInterceptedException
			PauseScript(3);

			hsqSearchHomePage.clickOnSearchAll(searchby);
			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
		}

	}

	/**
	 * Method that handles the user entering Telehealth provider name for search
	 * 
	 * @param teleHealthProviderName
	 * @throws Throwable
	 */
	@And("^I enter the Telehealth provider name as \"([^\"]*)\"$")
	public void i_enter_the_Telehealth_provider_name_as(String teleHealthProviderName) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqWindowDriver = hsqSearchHomePage.naviagteToHsqWindow(driver);

		hsqSearchHomePage.enterTeleHealthProviderName(teleHealthProviderName);
		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	/**
	 * Method that handles selecting Telehealth filter for search
	 * 
	 * @throws Throwable
	 */
	@And("^I select the Telehealth filter$")
	public void i_select_the_Telehealth_filter() throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);
		hsqWindowDriver = hsqSearchResultPage.naviagteToHsqWindow(driver);

		PauseScript(3);

		hsqSearchResultPage.selectTeleHealthFilter();

		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");

	}

	/**
	 * Method that verifies the Telehealth text "Talk to a doctor. Telehealth offers
	 * confidential phone or video appointments."
	 * 
	 * @param telehealthtext
	 * @throws Throwable
	 */
	@Then("^the searched provider should be displayed with the Telehealth text \"([^\"]*)\"$")
	public void the_searched_provider_should_be_displayed_with_the_telehealth_text_something(String telehealthtext)
			throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);

		log.info("Current HSQ Window Title is : " + driver.getTitle());

		PauseScript(3);

		hsqSearchResultPage.verifyTeleHealthTextForSearchedProvider(telehealthtext);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	/**
	 * Method that handles closing the current instance of the HSQ tab
	 * 
	 * @throws Throwable
	 */
	@And("^I close the HSQ tab$")
	public void i_close_the_hsq_tab() throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);
		hsqWindowDriver = hsqSearchResultPage.naviagteToHsqWindow(driver);

		hsqSearchResultPage.closeHsqSearchResultTab(hsqWindowDriver);
	}

	/**
	 * Method that handles navigating back to the Regence Member dashboard tab
	 * 
	 * @throws Throwable
	 */
	@And("^I Navigate back to Regence Member Dashboard Page$")
	public void i_navigate_back_to_regence_member_dashboard_page() throws Throwable {

		RegenceAsurisBSHMemberDashboardPage regenceAsurisMemberDashboardPage = new RegenceAsurisBSHMemberDashboardPage(
				driver);

		regenceAsurisMemberDashboardPage.naviagteToMemberDashboardWindow(driver);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	/**
	 * Method that handles closing the Medical provider pop-up window
	 * 
	 * @throws Throwable
	 */
	@And("^I Close the Medical Provider popup Window$")
	public void i_close_the_medical_provider_popup_window() throws Throwable {

		RegenceAsurisBSHMemberDashboardPage regenceAsurisMemberDashboardPage = new RegenceAsurisBSHMemberDashboardPage(
				driver);

		regenceAsurisMemberDashboardPage.naviagteToMemberDashboardWindow(driver);
		regenceAsurisMemberDashboardPage.closeMedicalProviderPopupWindow();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");
	}

	/**
	 * Method that handles clicking on SignOut hyperlink
	 * 
	 * @throws Throwable
	 */
	@And("^I Click on SignOut hyperlink$")
	public void i_click_on_signout_hyperlink() throws Throwable {

		RegenceAsurisBSHMemberDashboardPage regenceAsurisMemberDashboardPage = new RegenceAsurisBSHMemberDashboardPage(
				driver);

		regenceAsurisMemberDashboardPage.clickOnSignOutButton();
		
		PauseScript(1);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	/**
	 * Method that handles clicking on the Close option in "You have successfully
	 * signed out pop up window"
	 * 
	 * Update: 7/3/2019 - Functionality removed - Test cases updated
	 * 
	 * @deprecated This method is deprecated in July 2019 Release
	 * @throws Throwable
	 * 
	 */
	@And("^I Click on the Close option in the You have successfully signed out pop up window$")
	public void i_click_on_the_close_option_in_the_you_have_successfully_signed_out_pop_up_window() throws Throwable {

		regenceWindowDriver = DriverFactory.getHandleToWindow(driver, "Member dashboard - Regence.com");
//		regenceWindowDriver.findElement(RegenceAsurisBSHMemberDashboardPage.btnSignOutClose).click();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

		PauseScript(3);

		log.info("Signed Out from the application Successfully...");
		Reporter.addStepLog("Signed Out from the application Successfully...");

	}

	/**
	 * @throws Throwable
	 */
	@And("^I Closed the browser window$")
	public void i_Closed_the_browser_window() throws Throwable {

		RegenceAsurisBSHHomePage regenceAsurisHomePage = new RegenceAsurisBSHHomePage(driver);

		regenceAsurisHomePage.naviagteToRegenceHomePageWindow(driver);
		regenceAsurisHomePage.closeRegenceHomePageWindow();

	}

}