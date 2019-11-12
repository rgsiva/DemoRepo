package com.cucumbercraft.stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.DriverManager;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.framework.WebDriverUtil;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HSQ_TelehealthProviderNameSearchStepDefs extends MasterStepDefs {

//	static Logger log = Logger.getLogger(HSQ_TelehealthProviderNameSearchStepDefs.class);
//
//	WebDriver driver = DriverManager.getWebDriver();
//	WebDriver hsqWindowDriver = null;
//	WebDriverWait Wait = null;
//	WebDriverUtil webDriverUtil = null;

//	@When("^I login with valid the username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
//	public void i_login_with_valid_the_username_as_and_Password_as(String userName, String password) throws Throwable {
//
//		login(userName, password);
//	}
//
//	@When("^I click on Find a Doctor link and select Medical Provider Icon$")
//	public void i_click_on_Find_a_Doctor_link_and_select_Medical_Provider_Icon() throws Throwable {
//
//		By findADoctor = By.xpath("//a[@class='css-148kjl2 css-huylcg'][contains(text(),'Find a doctor')]");
//		By medicalProvider = By.xpath("//a[contains(text(),'Medical provider')]");
//
//		log.info("Starting to click Find A Doctor --> Medical Provider...");
//
//		Actions actions = new Actions(driver);
//		WebElement findADoctorElement = driver.findElement(findADoctor);
//		actions.moveToElement(findADoctorElement).click().perform();
//
//		log.info("Find a Doctor link clicked successfully");
//
//		driver.findElement(medicalProvider).click();
//
//		log.info("Medical Provider link clicked successfully");
//
//		currentScenario.embed(Util.takeScreenshot(driver), "image/png");
//	}

//	@Then("^I should be landed on the HSQ Home page$")
//	public void i_should_be_landed_on_the_HSQ_Home_page() throws Throwable {
//
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//		webDriverUtil = new WebDriverUtil(hsqWindowDriver);
//
//		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
//
//		log.info("Starting to HSQ Navigation...");
//
//		By locationElement = By.xpath("//label[text()='Your Location']");
//		webDriverUtil.waitUntilElementLocated(locationElement, 5);
//
//		System.out.println("HSQ Window title : " + hsqWindowDriver.getTitle());
//
//		Assert.assertTrue(hsqWindowDriver.getTitle().contains("Search homepage"), "Navigation to HSQ Window failed...");
//
//		log.info("Navigated to HSQ Window Successfully...");
//
//	}

//	@Then("^I Verify location is defaulted to member's address$")
//	public void i_Verify_location_is_defaulted_to_member_s_address() throws Throwable {
//
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//
//		String expectedDefaultAddress = "1 TEST DEMO ST, SEATTL...";
//
//		By defaultAddress = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/u[1]");
//
//		String actualDefaultAddress = hsqWindowDriver.findElement(defaultAddress).getText().trim();
//		Assert.assertEquals(actualDefaultAddress, expectedDefaultAddress,
//				"Expected and actual address mismatch");
//
//		log.info("Default address validated Successfully...");
//
//		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
//	}

//	@Then("^I Update the address in choose your search location to valid address if it is found invalid$")
//	public void i_Update_the_address_in_choose_your_search_location_to_valid_address_if_it_is_found_invalid()
//			throws Throwable {
//
//		String searchLocation = "Salt Lake City, UT";
//
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//
//		By locationAddressLnk = By.cssSelector("[data-test='location-trigger-text']");
//		By searchLocationTxtBox = By.cssSelector("#input-location");
//		By yesThisIsCorrectBtn = By.xpath("//button[@id='CONFIRM_LOCATION_TRIGGER']");
//		
//		Actions actions = new Actions(hsqWindowDriver);
//		
//		WebElement locationAddressLnkelement = driver.findElement(locationAddressLnk);
//		actions.moveToElement(locationAddressLnkelement).click().perform();
//
//		hsqWindowDriver.findElement(searchLocationTxtBox).clear();
//		hsqWindowDriver.findElement(searchLocationTxtBox).sendKeys(searchLocation);
//		hsqWindowDriver.findElement(searchLocationTxtBox).sendKeys(Keys.TAB);
//		webDriverUtil.waitUntilElementLocated(yesThisIsCorrectBtn, 5);
//		hsqWindowDriver.findElement(yesThisIsCorrectBtn).click();
//
//		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
//
//		log.info("Search Address Updated Successfully...");
//
//	}

//	@Then("^I click on Search All button$")
//	public void i_click_on_Search_All_button() throws Throwable {
//
//		By searchAllBtn = By
//				.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[8]/div[1]/button[1]");
//
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//		hsqWindowDriver.findElement(searchAllBtn).click();
//
//		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
//
//		log.info("Search All button clicked Successfully...");
//
//	}

//	@Then("^I enter the Telehealth provider name as \"([^\"]*)\"$")
//	public void i_enter_the_Telehealth_provider_name_as(String teleHealthProviderName) throws Throwable {
//
//		By searchAllTxtBox = By.cssSelector("#input-what");
//
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//		hsqWindowDriver.findElement(searchAllTxtBox).sendKeys(teleHealthProviderName);
//		
//		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
//		hsqWindowDriver.findElement(searchAllTxtBox).sendKeys(Keys.RETURN);
//
//		log.info("Telehealth provider name entered Successfully...");
//	}

//	@Then("^I select the Telehealth filter$")
//	public void i_select_the_Telehealth_filter() throws Throwable {
//
//		By teleHealthFilter = By.xpath("//label[text()='Telehealth']");
//
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//		hsqWindowDriver.findElement(teleHealthFilter).click();
//
//		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
//
//		log.info("Telehealth filter selected Successfully...");
//
//	}

//	@Then("^the provider should be displayed with the text \"([^\"]*)\"$")
//	public void the_provider_should_be_displayed_with_the_text(String teleHealthExpectedText) throws Throwable {
//
//		
//		By teleHealthText = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[4]/main[1]/section[1]/div[1]/div[1]/div[3]/div[4]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]");
//		
//		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
//		String teleHealthActualText = hsqWindowDriver.findElement(teleHealthText).getText().trim();
//		Assert.assertEquals(teleHealthActualText, teleHealthExpectedText, "TeleHealth Text mis-match...");
//		
//		log.info("Telehealth text validation completed successfully...");
//
//	}

//	private void login(String userName, String password) {
//
//		By signInBlueBtn = By.linkText("Sign in");
//		By userNameBtn = By.xpath("//input[@id='_signinportlet_WAR_signinportlet_signIn']");
//		By passswordBtn = By.xpath("//input[@id='_signinportlet_WAR_signinportlet_password']");
//		By signInOrangeBtn = By.xpath("//button[@id='_signinportlet_WAR_signinportlet_submit']");
//
//		driver.findElement(signInBlueBtn).click();
//		driver.findElement(userNameBtn).clear();
//		driver.findElement(userNameBtn).sendKeys(userName);
//		driver.findElement(passswordBtn).clear();
//		driver.findElement(passswordBtn).sendKeys(password);
//		
//		log.info("Starting login to Regence...");
//
//		currentScenario.embed(Util.takeScreenshot(driver), "image/png");
//		driver.findElement(signInOrangeBtn).click();
//		
//		log.info("Login to application Completed Successfully...");
//
//	}

}
