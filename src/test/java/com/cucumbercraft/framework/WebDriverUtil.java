package com.cucumbercraft.framework;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TimeoutException;

/**
 * Class containing useful WebDriver utility functions
 * 
 * @author Cognizant
 */
public class WebDriverUtil {
	private WebDriver driver;

	/**
	 * Constructor to initialize the {@link WebDriverUtil} object
	 * 
	 * @param driver The {@link WebDriver} object
	 */
	public WebDriverUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Function to pause the execution for the specified time period
	 * 
	 * @param milliSeconds The wait time in milliseconds
	 */
	public void waitFor(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Function to wait until the specified element is located
	 * 
	 * @param by               The {@link WebDriver} locator used to identify the
	 *                         element
	 * @param timeOutInSeconds The wait timeout in seconds
	 */
	public void waitUntilElementLocated(By by, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	/**
	 * Function to wait until the specified element is visible
	 * 
	 * @param by               The {@link WebDriver} locator used to identify the
	 *                         element
	 * @param timeOutInSeconds The wait timeout in seconds
	 */
	public void waitUntilElementVisible(By by, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public void waitUntilElementVisible(WebDriver driver, WebElement element, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Function to wait until the specified element is enabled
	 * 
	 * @param by               The {@link WebDriver} locator used to identify the
	 *                         element
	 * @param timeOutInSeconds The wait timeout in seconds
	 */
	public void waitUntilElementEnabled(By by, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.elementToBeClickable(by));
	}

	/**
	 * Function to wait until the specified element is disabled
	 * 
	 * @param by               The {@link WebDriver} locator used to identify the
	 *                         element
	 * @param timeOutInSeconds The wait timeout in seconds
	 */
	public void waitUntilElementDisabled(By by, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds))
				.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(by)));
	}
	
	public void waitUntilElementDisabled(WebElement webElement, long timeOutInSeconds) {
		(new WebDriverWait(driver, timeOutInSeconds))
				.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(webElement)));
	}

	/**
	 * Function to select the specified value from a listbox
	 * 
	 * @param by   The {@link WebDriver} locator used to identify the listbox
	 * @param item The value to be selected within the listbox
	 */
	public void selectListItem(By by, String item) {
		Select dropDownList = new Select(driver.findElement(by));
		dropDownList.selectByVisibleText(item);
	}
	
	/**
	 * Function to verify whether the specified object exists within the current
	 * page
	 * 
	 * @param by The {@link WebDriver} locator used to identify the element
	 * @return Boolean value indicating whether the specified object exists
	 */
	public Boolean objectExists(By by) {
		if (driver.findElements(by).size() == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Function to verify whether the specified text is present within the current
	 * page
	 * 
	 * @param textPattern The text to be verified
	 * @return Boolean value indicating whether the specified test is present
	 */
	public Boolean isTextPresent(String textPattern) {
		if (driver.findElement(By.cssSelector("BODY")).getText().matches(textPattern)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Function to check if an alert is present on the current page
	 * 
	 * @param timeOutInSeconds The number of seconds to wait while checking for the
	 *                         alert
	 * @return Boolean value indicating whether an alert is present
	 */
	public Boolean isAlertPresent(long timeOutInSeconds) {
		try {
			new WebDriverWait(driver, timeOutInSeconds).until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (TimeoutException ex) {
			return false;
		}
	}

	/**
	 * Function to move to the child window
	 * 
	 * @param windowTitle The title of the child window to navigate
	 * 
	 * @return WebDriver returning the Webdriver instance of the child window
	 */
	public WebDriver getHandleToWindow(String windowTitle) {

		WebDriver popUpWindow = null;
		
		Set<String> windowIterator = driver.getWindowHandles();
		System.err.println("No of windows :  " + windowIterator.size());

		for (String s : windowIterator) {
			String windowHandle = s;
			popUpWindow = driver.switchTo().window(windowHandle);

			System.out.println("Window Title : " + popUpWindow.getTitle());
			System.out.println("Window Url : " + popUpWindow.getCurrentUrl());

			if (popUpWindow.getTitle().equals(windowTitle)) {
				System.out.println("Selected Window Title : " + popUpWindow.getTitle());
				return popUpWindow;
			}

		}
		System.out.println("Window Title :" + popUpWindow.getTitle());
		System.out.println();
		return popUpWindow;
	}

	/**
	 * Method to find whether the element present or not.
	 * 
	 * It will return true if the element passed by is found, else it will return
	 * false.
	 * 
	 * @param by
	 * @return
	 */
	public boolean isElementPresent(By by, String windowTitle) {
		
		WebDriverUtil webDriverUtil = new WebDriverUtil(driver);
		WebDriver popUpWindow = null;
		
		popUpWindow = webDriverUtil.getHandleToWindow(windowTitle);

		try {

			popUpWindow.findElement(by);
			return true;

		} catch (NoSuchElementException e) {
			System.out.println("Not able to locate the elment...");
			e.printStackTrace();
			return false;
		}

	}

}