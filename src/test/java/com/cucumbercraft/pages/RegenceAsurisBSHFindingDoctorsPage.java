package com.cucumbercraft.pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
public class RegenceAsurisBSHFindingDoctorsPage extends MasterStepDefs {

	/**
	 * Initializing the log4j instance for console logging
	 */
	static Logger log = Logger.getLogger(RegenceAsurisBSHFindingDoctorsPage.class);

	private WebDriver driver;
	private WebDriver homePageDriver = null;

	public RegenceAsurisBSHFindingDoctorsPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

//	Buttons


//	text fields
	
	
//	link fields

	@FindBy(how = How.LINK_TEXT, using = "Finding doctors")
	private static WebElement lnkFindingDoctors;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search now')]")
	private static WebElement lnkSearchNowLink;
	
	
	/**
	 * Method to verify landing on Finding Doctors page
	 * 
	 */
	public void verifyLandingOnFindingDoctorsPage() {
		
//		Unable to locate element
		PauseScript(3);

		String findingDoctorsActualText = lnkFindingDoctors.getText().trim();
		String findingDoctorsExpectedText = "Finding doctors";

		log.info("Landing on Finding Doctors page...");
		assertEquals(findingDoctorsActualText, findingDoctorsExpectedText, "Finding doctors text mismatch...");
		
		log.info("Landed on Finding Doctors page Successfully...");
	}
	
	/**
	 * Method to click on Search now link
	 * 
	 */
	public void clickOnSearchNowLink() {
		
		log.info("Clicking on Search now link...");
		
		lnkSearchNowLink.click();

		log.info("Clicked on Search now link Successfully...");
	
	}
	
	
	
	
	

// *********************************************************************

//	Buttons

//	public static final By btnSignInBlue = By.linkText("Sign in");
//	public static final By btnSignInOrange = By.xpath("//button[@id='_signinportlet_WAR_signinportlet_submit']");

//	Buttons

//	public static final By txtUserName = By.xpath("//input[@id='_signinportlet_WAR_signinportlet_signIn']");
//	public static final By txtPasssword = By.xpath("//input[@id='_signinportlet_WAR_signinportlet_password']");

}
