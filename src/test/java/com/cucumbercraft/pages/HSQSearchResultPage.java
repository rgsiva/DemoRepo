package com.cucumbercraft.pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.framework.WebDriverUtil;

/**
 * UI Map for HSQ Search Results Page.
 * 
 * @author r632871 (Sivakumar Ganesan)
 * @version 1.0
 * @since 7/18/2019
 * @see some.other.class.Documentation
 * 
 * 
 */
public class HSQSearchResultPage {

	static Logger log = Logger.getLogger(HSQSearchResultPage.class);

	private WebDriver driver;
	WebDriverUtil webDriverUtil;
	WebDriver hsqWindowDriver;
	WebDriver surveyWindowDriver;
	String hsqWindowTitle = "Search homepage";

	public HSQSearchResultPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	Buttons

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[8]/div[1]/div[2]/footer[1]/button[2]")
	private static WebElement btnLetsGo;

//	Check Boxes

	@FindBy(how = How.XPATH, using = "//label[contains(text(),\"I don't see the specific doctor I was looking for\")]")
	private static WebElement chkBoxIDontSeeTheSpecificDoctorIWasLookingFor;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),\"I don't see the specialty I was looking for\")]")
	private static WebElement chkBoxIDontSeeTheSpecialtyIWasLookingFor;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'I was expecting to see cost information')]")
	private static WebElement chkBoxIWasExpectingToSeeCostInformation;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),\"I don't see the facility I was looking for\")]")
	private static WebElement chkBoxIDontSeeTheFacilityIWasLookingFor;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Other')]")
	private static WebElement chkBoxOther;

//	labels

	@FindBy(how = How.XPATH, using = "//label[text()='Telehealth']")
	private static WebElement lblTeleHealthFilter;

//	text fields

	@FindBy(how = How.XPATH, using = "//div[text()='Telehealth']")	                                 
	private static WebElement txtTeleHealthText;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Did you find what you were looking for?')]")
	private static WebElement txtSurveyText;

	@FindBy(how = How.CSS, using = "[data-test='interstitial-survey-alert-confirm']")
	private static WebElement txtThanksForYourFeedback;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Would you take a')]")
	private static WebElement txtWouldYouLikeA;

	@FindBy(how = How.XPATH, using = "//input[@id='oe9.0']")
	private static WebElement txtOther;

//	link fields

	@FindBy(how = How.CSS, using = "[class] h4 [type='button']:nth-of-type(1)")
	private static WebElement lnkSurveyTextYes;

	@FindBy(how = How.CSS, using = "[class] h4 [type='button']:nth-of-type(2)")
	private static WebElement lnkSurveyTextNo;

	@FindBy(how = How.CSS, using = "[data-test='interstitial-survey-alert-deny']")
	private static WebElement lnkShortSurvey;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'short survey')]")
	private static WebElement lnkShortSurvey1;

	/**
	 * Method to navigate to HSQ window.
	 * 
	 * @param driver
	 * @return
	 */
	public WebDriver naviagteToHsqWindow(WebDriver driver) {

		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search homepage");

		return hsqWindowDriver;

	}

	/**
	 * Method to select Telehealth Filter.
	 * 
	 */
	public void selectTeleHealthFilter() {

		HSQSearchResultPage.lblTeleHealthFilter.click();

		log.info("Telehealth filter selected Successfully...");
		Reporter.addStepLog("Telehealth filter selected Successfully...");

	}

	/**
	 * Method to verify Telehealth text for Searched Provider.
	 * 
	 * @param telehealthtext
	 */
	public void verifyTeleHealthTextForSearchedProvider(String telehealthtext) {

		String teleHealthActualText = HSQSearchResultPage.txtTeleHealthText.getText().trim();
		Assert.assertEquals(teleHealthActualText, telehealthtext, "TeleHealth Text mis-match...");

		log.info("Telehealth text validation completed Successfully...");
		Reporter.addStepLog("Telehealth text validation completed Successfully...");

	}

	/**
	 * Method to close HSQ Search Result Tab
	 * 
	 * @param driver
	 */
	public void closeHsqSearchResultTab(WebDriver driver) {

		driver.close();

		log.info("HSQ Search Result Window is closed Successfully...");
		Reporter.addStepLog("HSQ Search Result Window is closed Successfully...");

	}

	public void locateSurveyTextWithYesAndNoOption(String surveytext) {

		String expectedSurveyText = surveytext;

//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, hsqWindowTitle);

		log.info("Locating \"Did you find what you are looking for?\" text...");
		assertEquals(txtSurveyText.getText().trim(), expectedSurveyText,
				"Not able to locate \"Did you find what you are looking for?\" text...");

		log.info("Located \"Did you find what you are looking for?\" text Successfully...");

		log.info("Locating the Yes option...");
		assertEquals(lnkSurveyTextYes.getText().trim(), "Yes", " \"Yes\" text is NOT present...");
		log.info("Located the Yes option Successfully...");

		log.info("Locating the No option...");
		assertEquals(lnkSurveyTextNo.getText().trim(), "No", " \"No\" text is NOT present...");
		log.info("Located the No option Successfully...");

	}

	public void selectSurvey(String selectionsurvey) {

		if (selectionsurvey.equalsIgnoreCase("Yes")) {

			log.info("Hitting the Yes button...");
			lnkSurveyTextYes.click();

			log.info("Hit the Yes button Successfully...");

		}

	}

	public void surveyConfirmation(String feedback_Confirmaiton) {

		if (feedback_Confirmaiton.equalsIgnoreCase("Thanks for your feedback!")) {

			log.info("Locating Thanks for your feedback text...");
			assertEquals(txtThanksForYourFeedback.getText().trim(), feedback_Confirmaiton,
					"Thanks for your feedback! text is NOT present...");

			log.info("Located \"Thanks for your feedback text\" Successfully...");
//			currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");

		} else if (feedback_Confirmaiton.equalsIgnoreCase("Would you take a short survey to help us improve?")) {

			log.info("Clicking short survey link...");
			lnkShortSurvey.click();

			log.info("Clicked on short survey link Successfully...");

			log.info("Clicking Let's Go button");
			btnLetsGo.click();
			log.info("Clicked on Let's Go button Successfully...");

			surveyWindowDriver = DriverFactory.getHandleToWindow(driver, "Survey");

			String actualSurveyTitle = surveyWindowDriver.getTitle();
			String expectedSurveyTitle = "Survey";

			log.info("Validating Survey window title...");
			assertEquals(actualSurveyTitle, expectedSurveyTitle);
			log.info("Validated Survey window title Successfully...");

		}
	}

	public void closeHSQSearchResultsWindow() {
		
		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, hsqWindowTitle);
		
		String hsqWindowDriverTitle = hsqWindowDriver.getTitle();
		
		log.info("HSQ Window Driver Title is: " + hsqWindowDriverTitle);
		
		log.info("Closing the HSQ " + hsqWindowDriverTitle + " tab...");
//		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

		hsqWindowDriver.close();
		log.info("Closed the HSQ " + hsqWindowDriverTitle + " tab Successfully...");

	}

//	labels
//	public static final By lblTeleHealthFilter = By.xpath("//label[text()='Telehealth']");

//	text fields
//	public static final By txtTeleHealthText = By.xpath(
//			"/html[1]/body[1]/div[2]/div[1]/div[4]/main[1]/section[1]/div[1]/div[1]/div[3]/div[4]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]");

//	
//	
//	By thanksForYourFeedback = By.xpath("//h3[contains(text(),'Thanks for your feedback!')]");
//	By WouldYouLikeA = By.xpath("//h3[contains(text(),'Would you take a')]");
//	By shortSurvey = By.cssSelector("[data-test='interstitial-survey-alert-deny']");
//	By shortSurvey1 = By.xpath("//a[contains(text(),'short survey')]");
//	By letsGoButton = By.xpath("/html[1]/body[1]/div[2]/div[8]/div[1]/div[2]/footer[1]/button[2]");
//	By iDontSeeTheSpecificDoctorIWasLookingFor_chkBox = By
//			.xpath("//label[contains(text(),\"I don't see the specific doctor I was looking for\")]");
//	By iDontSeeTheSpecialtyIWasLookingFor_chkBox = By
//			.xpath("//label[contains(text(),\"I don't see the specialty I was looking for\")]");
//	By iWasExpectingToSeeCostInformation_chkBox = By
//			.xpath("//label[contains(text(),'I was expecting to see cost information')]");
//	By iDontSeeTheFacilityIWasLookingFor_chkBox = By
//			.xpath("//label[contains(text(),\"I don't see the facility I was looking for\")]");
//	By otherChkBox = By.xpath("//label[contains(text(),'Other')]");
//	By otherTxtBox = By.xpath("//input[@id='oe9.0']");

}
