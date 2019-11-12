package com.cucumbercraft.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.cucumbercraft.stepdefinitions.MasterStepDefs;

/**
 * @author r632871
 * 
 *         UI Map for BridgeSpanHealth Home Page
 *
 */
public class BSHHomePage extends MasterStepDefs{
	
	static Logger log = Logger.getLogger(BSHHomePage.class);
	
	private WebDriver driver;
	private WebDriver homePageDriver = null;
	
	public BSHHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}

//	links
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Sign in')]")
	private static WebElement lnkSignInBsh;
	
//	Text fields
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='User name']")
	private static WebElement txtUserNameBsh;
	
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	private static WebElement txtPassswordBsh;
	
//	Buttons
	
	@FindBy(how = How.XPATH, using = "//button[@id='signin-submit']")
	private static WebElement btnSignInBlueBsh;
	
	@FindBy(how = How.XPATH, using = "//button[@id='signin-cancel']")
	private static WebElement btnCancel;
	
	public void clickOnSignInBSH() {
		
		log.info("Clicking on Sign in hyperlink...");
		Reporter.addStepLog("Clicking on Sign in hyperlink...");

		lnkSignInBsh.click();

		log.info("Clicked on Sign in hyperlink Successfully...");
		Reporter.addStepLog("Clicked on Sign in hyperlink Successfully...");		
	}
	
	public void clearBshUserName() {

		log.info("Clearning text on BSH User Name text box....");
		Reporter.addStepLog("Clearning text on BSH User Name text box....");

		txtUserNameBsh.clear();

		log.info("Cleard text on BSH User Name text box....");
		Reporter.addStepLog("Cleard text on BSH User Name text box....");
	}
	
	public void enterBshUserName(String username) {

		log.info("Entering " + username + " in the BSH User Name text box...");
		Reporter.addStepLog("Entering " + username + " in the BSH User Name text box...");

		txtUserNameBsh.sendKeys(username);

		log.info("Entered " + username + " in the BSH User Name text box...");
		Reporter.addStepLog("Entered " + username + " in the BSH User Name text box...");
	}
	
	public void clearBshPassword() {

		log.info("Clearing text on BSH Password text box....");
		Reporter.addStepLog("Clearing text on BSH Password text box....");

		txtPassswordBsh.clear();

		log.info("Cleard text on BSH Password text box....");
		Reporter.addStepLog("Cleard text on BSH Password text box....");
	}
	
	public void enterBshPassword(String password) {

		log.info("Entering " + password + " in the BSH Password text box...");
		Reporter.addStepLog("Entering " + password + " in the BSH Password text box...");

		txtPassswordBsh.sendKeys(password);

		log.info("Entered " + password + " in the BSH Password text box...");
		Reporter.addStepLog("Entered " + password + " in the BSH Password text box...");
	}

	
	public void clickOnSignInBshButton() {

		log.info("Clicking on Sign In BSH button....");
		Reporter.addStepLog("Clicking on Sign In BSH button....");

		btnSignInBlueBsh.click();

		log.info("Clicked on Sign In BSH button....");
		Reporter.addStepLog("Clicked on Sign In BSH button....");

		log.info("Login to BSH application completed Successfully...");
		Reporter.addStepLog("Login to BSH application completed Successfully...");
	}
	
//	links
	public static final By lnkSignInBsh1 = By.xpath("//span[contains(text(),'Sign in')]");
	
//	Text fields
	public static final By txtUserNameBsh1 = By.xpath("//input[@placeholder='User name']");
	public static final By txtPassswordBsh1 = By.xpath("//input[@placeholder='Password']");

//	Buttons
	public static final By btnSignInBlueBsh1 = By.xpath("//button[@id='signin-submit']");
	public static final By btnCancel1 = By.xpath("//button[@id='signin-cancel']");

}
