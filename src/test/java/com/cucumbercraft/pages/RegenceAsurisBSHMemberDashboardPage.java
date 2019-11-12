package com.cucumbercraft.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.WebDriverUtil;
import com.cucumbercraft.stepdefinitions.MasterStepDefs;

/**
 * @author r632871
 * 
 *         UI Map for Regence & Asuris Member Dashboard Page
 *
 */
public class RegenceAsurisBSHMemberDashboardPage extends MasterStepDefs{
	
	/**
	 * Initializing the log4j instance for console logging
	 */
	static Logger log = Logger.getLogger(RegenceAsurisBSHMemberDashboardPage.class);

	private WebDriver driver;
	WebDriverUtil webDriverUtil;
	private WebDriver regenceWindowDriver = null;

	public RegenceAsurisBSHMemberDashboardPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	links

	@FindBy(how = How.LINK_TEXT, using = "Find a doctor")
	private static WebElement lnkFindADoctor;

	@FindBy(how = How.LINK_TEXT, using = "Medical provider")
	private static WebElement lnkMedicalProvider;
	
	@FindBy(how = How.LINK_TEXT, using = "Pharmacy")
	private static WebElement lnkPharmacy;
	
//	Buttons
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-dialog modal-sm css-npaliu']//span[contains(text(),'x')]")
	private static WebElement btnFindADoctorModalClose;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign out')]")
	private static WebElement btnSignOut;
	
	@FindBy(how = How.XPATH, using = "//button[@id='survey-affirmative']")
	private static WebElement btnSurveyYes;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'No thanks')]")
	private static WebElement btnSurveyNoThanks;
	
	@FindBy(how = How.XPATH, using = "//img[@class='css-uv2geg']")
	private static WebElement imgSurveyClose;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"modal\"]/div/div/div/div/div/button[2]")
	private static WebElement btnMemberExpSurveyNoThanks;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"survey-affirmative\"]")
	private static WebElement btnMemberExpSurveyYes;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"modal\"]/div/div/div/div/css-d3xkxu/span/img")
	private static WebElement imgMemberExpSurveyClose;
	
	/**
	 * @since 1.0
	 * @see
	 * @deprecated This element is removed in Regence July 2019 Release
	 */
	@FindBy(how = How.XPATH, using = "//button[@id='btn_LogoutClose']")
	WebElement btnSignOutClose;
	
	/**
	 * Method to click on Find a Doctor link
	 * @throws InterruptedException
	 */
	public void clickOnFindADoctorLink() throws InterruptedException {
		
		PauseScript(5);
		
		log.info("Starting to click Find A Doctor - Medical Provider...");
		Reporter.addStepLog("Starting to click Find A Doctor - Medical Provider...");
	
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkFindADoctor).click().perform();
		
		log.info("Find a Doctor link clicked successfully");
		Reporter.addStepLog("Find a Doctor link clicked successfully...");
		
	}
	
	/**
	 * Method to click on Medical Provider link
	 */
	public void clickOnMedicalProviderLink() {
		
		try {
			lnkMedicalProvider.click();
		} catch (NoSuchElementException e) {
			
			log.info("Medical Provider element not available :-(");
			Reporter.addStepLog("Medical Provider element not available :-(");

			e.printStackTrace();
		}
		
		log.info("Medical Provider link clicked successfully...");
		Reporter.addStepLog("Medical Provider link clicked successfully...");
		
	}
	
	public WebDriver naviagteToMemberDashboardWindow(WebDriver driver) {

		regenceWindowDriver = DriverFactory.getHandleToWindow(driver, "Member dashboard - Regence.com");
		
		log.info("Regence Window Title is " + regenceWindowDriver.getTitle());
		
		
		log.info("Naviagated back to Member Dashboard Window Successfully...");
		Reporter.addStepLog("Naviagated back to Member Dashboard Window Successfully...");

		return regenceWindowDriver;

	}
	
	public void closeMedicalProviderPopupWindow() {
		
		RegenceAsurisBSHMemberDashboardPage.btnFindADoctorModalClose.click();
		
		log.info("Find A Doctor Window Closed Successfully...");
		Reporter.addStepLog("Find A Doctor Window Closed Successfully...");
		
	}
	
	public void clickOnSignOutButton() {
		
		RegenceAsurisBSHMemberDashboardPage.btnSignOut.click();
		
		log.info("Sing Out button clicked...");
		Reporter.addStepLog("Sing Out button clicked...");
		
	}
	

	/**
	 * @since 1.0
	 * @see
	 * @deprecated This element is removed in Regence July 2019 Release
	 */
//	public static final By btnSignOutClose = By.xpath("//button[@id='btn_LogoutClose']");

}

//*******************************************************************************************

//links
//public static final By lnkFindADoctor = By.linkText("Find a doctor");
//public static final By lnkMedicalProvider = By.linkText("Medical provider");
//public static final By lnkPharmacy = By.linkText("Pharmacy");

//Buttons
//public static final By btnFindADoctorModalClose = By
//		.xpath("//div[@class='modal-dialog modal-sm css-npaliu']//span[contains(text(),'x')]");
//public static final By btnSignOut = By.xpath("//span[contains(text(),'Sign out')]");
