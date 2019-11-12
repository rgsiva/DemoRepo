package com.cucumbercraft.pages;

import org.openqa.selenium.By;

/**
 * @author r632871
 * 
 *         UI Map for HSQ Home Page
 *
 */
public class HSQHomePage {

	public static final By lnkDoctorsByNameElement = By.xpath("//h2[contains(text(),'Doctors by name')]");
	public static final By lnkDefaultAddress = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]/u[1]");
	public static final By lnkLocationAddress = By.cssSelector("[data-test='location-trigger-text']");
	public static final By txtSearchLocation = By.cssSelector("#input-location");
	public static final By btnYesThisIsCorrect = By.xpath("//button[@id='CONFIRM_LOCATION_TRIGGER']");
	public static final By HSQ_searchAllOption = By
			.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[8]/div[1]/button[1]");
	public static final By txtSearchAllText = By.cssSelector("#input-what");
	public static final By lblTeleHealthFilter = By.xpath("//label[text()='Telehealth']");
	public static final By txtTeleHealthText = By.xpath(
			"/html[1]/body[1]/div[2]/div[1]/div[4]/main[1]/section[1]/div[1]/div[1]/div[3]/div[4]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[5]/div[1]/div[2]");

}
