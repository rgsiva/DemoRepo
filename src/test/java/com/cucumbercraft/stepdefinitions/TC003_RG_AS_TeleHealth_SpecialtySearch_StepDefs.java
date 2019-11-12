package com.cucumbercraft.stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.DriverManager;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.framework.WebDriverUtil;

import cucumber.api.java.en.And;

public class TC003_RG_AS_TeleHealth_SpecialtySearch_StepDefs extends MasterStepDefs {

	static Logger log = Logger.getLogger(TC003_RG_AS_TeleHealth_SpecialtySearch_StepDefs.class);

	WebDriver driver = DriverManager.getWebDriver();
	WebDriver hsqWindowDriver = null;
	WebDriverWait Wait = null;
	WebDriverUtil webDriverUtil = null;

	/**
	 * @param telehealthspecialtyname
	 * @throws Throwable
	 */
	@And("^I enter the Telehealth Specialty Search text as \"([^\"]*)\"$")
	public void i_enter_the_telehealth_specialty_search_text_as_something(String telehealthspecialtyname)
			throws Throwable {
		
		By searchAllTxtBox = By.cssSelector("#input-what");

		hsqWindowDriver = DriverFactory.getHandleToWindow(driver, "Search for care");
		hsqWindowDriver.findElement(searchAllTxtBox).sendKeys(telehealthspecialtyname);

		currentScenario.embed(Util.takeScreenshot(hsqWindowDriver), "image/png");
		hsqWindowDriver.findElement(searchAllTxtBox).sendKeys(Keys.RETURN);

		System.out.println("inside TC003");
		
		log.info("Telehealth Specialty name entered Successfully...");

	}

}
