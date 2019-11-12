package com.cucumbercraft.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.cucumbercraft.framework.WebDriverUtil;
import com.cucumbercraft.stepdefinitions.MasterStepDefs;

/**
 * @author r632871
 * 
 *         UI Map for Regence & Asuris Member Dashboard Page
 *
 */

public class RegenceAsurisBSHSignInFailedPage extends MasterStepDefs{
	
	/**
	 * Initializing the log4j instance for console logging
	 */
	
	static Logger log = Logger.getLogger(RegenceAsurisBSHSignInFailedPage.class);

	private WebDriver driver;
	WebDriverUtil webDriverUtil  = null;
	private WebDriver regenceWindowDriver = null;

	public RegenceAsurisBSHSignInFailedPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
//	links

	@FindBy(how = How.LINK_TEXT, using = "Sign-in failed")
	private static WebElement lnkSignInFailed;
	
	
}
